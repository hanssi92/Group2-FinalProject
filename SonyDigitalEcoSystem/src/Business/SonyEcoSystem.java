/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Enterprise.DigitalEntertainment;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HardwareAndSupplyChain;
import Business.Enterprise.PartnerAndService;
import Business.Model.InventoryItem;
import Business.Model.Order;
import Business.Organization.Organization;
import Business.Model.User;
import Business.Organization.ComponentSupplier;
import Business.Organization.GameDevStudio;
import Business.Organization.InteractiveEntertainment;
import Business.Organization.ManufacturingPartner;
import Business.Organization.OnlineServiceProvider;
import Business.Organization.Retailer;
import Business.Role.Role;
import Business.Role.RoleType;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ContentPublishingRequest;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.WorkRequestStatus;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 *
 * @author Hyungs
 */
public class SonyEcoSystem {
    
    private final ArrayList<Enterprise> enterpriseList;
    private final ArrayList<Organization> organizationList;
    private final ArrayList<User> userList;
    private final ArrayList<InventoryItem> supplierInventory;
    private final ArrayList<InventoryItem> retailInventory;
    private final ArrayList<Order> supplyRequestList;
    private final ArrayList<Order> productionOrderList;
    private final ArrayList<Order> restockRequestList;
    private final ArrayList<WorkRequest> workRequestList;

    public SonyEcoSystem() {
        enterpriseList = new ArrayList<>();
        organizationList = new ArrayList<>();
        userList = new ArrayList<>();
        supplierInventory = new ArrayList<>();
        retailInventory = new ArrayList<>();
        supplyRequestList = new ArrayList<>();
        productionOrderList = new ArrayList<>();
        restockRequestList = new ArrayList<>();
        workRequestList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public ArrayList<Enterprise> getEnterprises() {
        return enterpriseList;
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public ArrayList<InventoryItem> getSupplierInventory() {
        return supplierInventory;
    }

    public ArrayList<InventoryItem> getRetailInventory() {
        return retailInventory;
    }

    public ArrayList<Order> getSupplyRequestList() {
        return supplyRequestList;
    }

    public ArrayList<Order> getProductionOrderList() {
        return productionOrderList;
    }

    public ArrayList<Order> getRestockRequestList() {
        return restockRequestList;
    }

    public ArrayList<WorkRequest> getWorkRequests() {
        return workRequestList;
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public ArrayList<WorkRequest> getWorkRequest() {
        return workRequestList;
    }

    public void addEnterprise(Enterprise enterprise) {
        if (enterprise != null && !enterpriseList.contains(enterprise)) {
            enterpriseList.add(enterprise);
        }
    }

    public void addOrganization(Organization organization) {
        if (organization != null && !organizationList.contains(organization)) {
            organizationList.add(organization);
        }
    }

    public void addUser(User user) {
        if (user != null && !userList.contains(user)) {
            userList.add(user);
        }
    }

    public void addWorkRequest(WorkRequest workRequest) {
        if (workRequest != null && !workRequestList.contains(workRequest)) {
            workRequestList.add(workRequest);
        }
    }

    public User authenticate(String username, String password) {
        for (User user : userList) {
            if (user.getUsername().equalsIgnoreCase(username)
                    && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public UserAccount authenticateUserAccount(String username, String password, RoleType roleType) {
        for (Enterprise enterprise : enterpriseList) {
            for (Organization organization : enterprise.getOrganization()) {
                for (UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList()) {
                    if (userAccount.getUsername().equalsIgnoreCase(username)
                            && userAccount.getPassword().equals(password)
                            && userAccount.isActive()
                            && userAccount.getRoleType() == roleType) {
                        return userAccount;
                    }
                }
            }
        }
        return null;
    }

    public ArrayList<RoleType> getAvailableRoleTypes() {
        LinkedHashSet<RoleType> roleTypes = new LinkedHashSet<>();

        for (Enterprise enterprise : enterpriseList) {
            for (Organization organization : enterprise.getOrganization()) {
                for (Role role : organization.getSupportedRoles()) {
                    roleTypes.add(role.getType());
                }
                for (UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList()) {
                    roleTypes.add(userAccount.getRoleType());
                }
            }
        }

        return new ArrayList<>(roleTypes);
    }

    public ArrayList<UserAccount> getAllUserAccounts() {
        ArrayList<UserAccount> userAccounts = new ArrayList<>();

        for (Enterprise enterprise : enterpriseList) {
            for (Organization organization : enterprise.getOrganization()) {
                userAccounts.addAll(organization.getUserAccountDirectory().getUserAccountList());
            }
        }

        return userAccounts;
    }

    public Organization findOrganizationByUserAccount(UserAccount targetAccount) {
        if (targetAccount == null) {
            return null;
        }

        for (Enterprise enterprise : enterpriseList) {
            for (Organization organization : enterprise.getOrganization()) {
                for (UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList()) {
                    if (userAccount == targetAccount) {
                        return organization;
                    }
                }
            }
        }

        return null;
    }

    public Enterprise findEnterpriseByOrganization(Organization targetOrganization) {
        if (targetOrganization == null) {
            return null;
        }

        for (Enterprise enterprise : enterpriseList) {
            for (Organization organization : enterprise.getOrganization()) {
                if (organization == targetOrganization) {
                    return enterprise;
                }
            }
        }

        return null;
    }

    public Enterprise findEnterpriseByName(String enterpriseName) {
        for (Enterprise enterprise : enterpriseList) {
            if (enterprise.getName().equalsIgnoreCase(enterpriseName)) {
                return enterprise;
            }
        }
        return null;
    }

    public ArrayList<ContentPublishingRequest> getContentPublishingRequests() {
        ArrayList<ContentPublishingRequest> requests = new ArrayList<>();

        for (WorkRequest workRequest : workRequestList) {
            if (workRequest instanceof ContentPublishingRequest) {
                requests.add((ContentPublishingRequest) workRequest);
            }
        }

        return requests;
    }

    public int getPendingContentApprovalCount() {
        return countContentRequestsByStatus(WorkRequestStatus.PENDING);
    }

    public int getRejectedContentRequestCount() {
        return countContentRequestsByStatus(WorkRequestStatus.REJECTED);
    }

    public int getApprovedContentRequestsTodayCount() {
        int approvedToday = 0;
        LocalDate today = LocalDate.now();

        for (ContentPublishingRequest request : getContentPublishingRequests()) {
            if (request.getStatus() == WorkRequestStatus.APPROVED
                    && request.getRequestDate() != null
                    && request.getRequestDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().equals(today)) {
                approvedToday++;
            }
        }

        return approvedToday;
    }

    private int countContentRequestsByStatus(WorkRequestStatus status) {
        int count = 0;

        for (ContentPublishingRequest request : getContentPublishingRequests()) {
            if (request.getStatus() == status) {
                count++;
            }
        }

        return count;
    }

    public static SonyEcoSystem createDefaultEcosystem() {
        SonyEcoSystem ecosystem = new SonyEcoSystem();

        Enterprise digitalEntertainment = new DigitalEntertainment("Digital Entertainment Enterprise");
        Enterprise hardwareAndSupplyChain = new HardwareAndSupplyChain("Hardware and Supply Chain Enterprise");
        Enterprise partnerAndService = new PartnerAndService("Partner and Service Enterprise");

        Organization interactiveEntertainment = new InteractiveEntertainment("Interactive Entertainment Organization");
        Organization gameDevStudio = new GameDevStudio("Game Development Studio Organization");
        Organization componentSupplier = new ComponentSupplier("Component Supplier Organization");
        Organization manufacturingPartner = new ManufacturingPartner("Manufacturing Partner Organization");
        Organization retailer = new Retailer("Retailer Organization");
        Organization onlineServiceProvider = new OnlineServiceProvider("Online Service Provider Organization");

        digitalEntertainment.addOrganization(interactiveEntertainment);
        digitalEntertainment.addOrganization(gameDevStudio);
        hardwareAndSupplyChain.addOrganization(componentSupplier);
        hardwareAndSupplyChain.addOrganization(manufacturingPartner);
        partnerAndService.addOrganization(retailer);
        partnerAndService.addOrganization(onlineServiceProvider);

        ecosystem.addEnterprise(digitalEntertainment);
        ecosystem.addEnterprise(hardwareAndSupplyChain);
        ecosystem.addEnterprise(partnerAndService);

        ecosystem.addOrganization(interactiveEntertainment);
        ecosystem.addOrganization(gameDevStudio);
        ecosystem.addOrganization(componentSupplier);
        ecosystem.addOrganization(manufacturingPartner);
        ecosystem.addOrganization(retailer);
        ecosystem.addOrganization(onlineServiceProvider);

        return ecosystem;
    }
}
