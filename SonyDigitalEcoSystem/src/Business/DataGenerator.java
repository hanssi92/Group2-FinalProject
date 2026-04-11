/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Model.InventoryItem;
import Business.Model.PerformanceRecord;
import Business.Model.ProductionOrder;
import Business.Model.ProductionOrderStatus;
import Business.Organization.Organization;
import Business.Organization.OrganizationType;
import Business.Role.RoleType;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.ComponentSupplyRequest;
import Business.WorkQueue.ContentPublishingRequest;
import Business.WorkQueue.RetailRestockRequest;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.WorkRequestStatus;
import Business.WorkSpace.SonyRoleWorkspace;
import java.util.ArrayList;

/**
 *
 * @author sumayyahhusain
 */

// private final is used to show that a field is only used inside the class and should not be reassigned after initialization
public class DataGenerator {
    
    private static final Object[][] SUPPLIER_INVENTORY = {
        {"Sensor Module", "Hardware Component", 180},
        {"Display Panel", "Hardware Component", 96},
        {"Controller Board", "Hardware Component", 142},
        {"Cooling Fan", "Hardware Component", 215},
        {"Memory Chip", "Hardware Component", 240},
        {"Audio Driver", "Hardware Component", 88}
    };

    private static final Object[][] PRODUCTION_ORDERS = {
        {"PO-1001", "PS Console", 1200, ProductionOrderStatus.PLANNED},
        {"PO-1002", "VR Headset", 680, ProductionOrderStatus.IN_PROGRESS},
        {"PO-1003", "DualSense Controller", 1500, ProductionOrderStatus.QUALITY_CHECK},
        {"PO-1004", "Portable Device", 420, ProductionOrderStatus.PLANNED},
        {"PO-1005", "Pulse Headset", 900, ProductionOrderStatus.IN_PROGRESS}
    };

    private static final Object[][] RETAIL_INVENTORY = {
        {"PS5 Slim", "Retail Product", 65},
        {"Pulse Headset", "Retail Product", 120},
        {"Controller Bundle", "Retail Product", 84},
        {"VR2 Bundle", "Retail Product", 43},
        {"Gift Card", "Retail Product", 175},
        {"Portable Console Case", "Retail Product", 58}
    };

    private static final Object[][] PERFORMANCE_DATA = {
        {"PS5 Slim", 420, 209950.00},
        {"VR2 Bundle", 155, 85325.00},
        {"DualSense", 610, 45750.00},
        {"Game Voucher", 880, 70400.00},
        {"Headset", 315, 39375.00}
    };

    private static final String[][] SUPPLY_REQUESTS = {
        {"Supply GPU Chips", "Component batch for the next console assembly cycle"},
        {"Supply Display Panels", "Replacement panel stock for the upcoming production run"},
        {"Supply Audio Modules", "Audio hardware needed for headset production"},
        {"Supply Cooling Systems", "Thermal modules for premium device assembly"}
    };

    private static final String[][] RESTOCK_REQUESTS = {
        {"Restock Holiday Bundle", "Retail inventory replenishment before the holiday campaign"},
        {"Restock Controller Pack", "Fast-moving accessory pack replenishment"},
        {"Restock Console Units", "Core console inventory refill for flagship stores"}
    };

    private static final Object[][] CONTENT_PUBLISHING_REQUESTS = {
        {"100456", "PS5 Launch Trailer", "John Miller", "Video", "High", "Launch trailer assets prepared for homepage placement.", WorkRequestStatus.PENDING},
        {"100457", "God of War Blog Post", "Emily Chen", "Article", "Medium", "Feature article draft for the next promotional push.", WorkRequestStatus.PENDING},
        {"100458", "Spiderman Update Notes", "Alex Brown", "News", "High", "Patch note summary for the latest gameplay update.", WorkRequestStatus.PENDING},
        {"100459", "Horizon Image Assets", "David Lee", "Image", "Medium", "Gallery image set ready for campaign review.", WorkRequestStatus.APPROVED},
        {"100460", "Gran Turismo Social Ad", "Sarah Davis", "Social", "Low", "Social promotion asset prepared for publishing.", WorkRequestStatus.REJECTED}
    };

    private static final Object[][] ROLE_ACCOUNT_SEEDS = {
        {OrganizationType.INTERACTIVE_ENTERTAINMENT, RoleType.CONTENT_MANAGER, "content", "content123", "Content Manager"},
        {OrganizationType.INTERACTIVE_ENTERTAINMENT, RoleType.PLAYER_OR_USER, "player", "player123", "Player User"},
        {OrganizationType.GAME_DEV_STUDIO, RoleType.GAME_DEVELOPER, "developer", "developer123", "Game Developer"},
        {OrganizationType.COMPONENT_SUPPLIER, RoleType.SUPPLIER_MANAGER, "supplier", "supplier123", "Supplier Manager"},
        {OrganizationType.MANUFACTURING_PARTNER, RoleType.PRODUCTION_MANAGER, "production", "production123", "Production Manager"},
        {OrganizationType.RETAILER, RoleType.RETAIL_MANAGER, "retail", "retail123", "Retail Manager"},
        {OrganizationType.ONLINE_SERVICE_PROVIDER, RoleType.SUPPORT_AGENT, "support", "support123", "Support Agent"},
        {OrganizationType.ONLINE_SERVICE_PROVIDER, RoleType.PARTNER_MANAGER, "partner", "partner123", "Partner Manager"}
    };

    private static final WorkRequestStatus[] ECOSYSTEM_REQUEST_STATUSES = {
        WorkRequestStatus.COMPLETED,
        WorkRequestStatus.PENDING,
        WorkRequestStatus.APPROVED,
        WorkRequestStatus.PENDING,
        WorkRequestStatus.NEW,
        WorkRequestStatus.APPROVED
    };

    private DataGenerator() {
    }

    public static SonyRoleWorkspace createSeededWorkspace() {
        SonyRoleWorkspace workspace = new SonyRoleWorkspace();

        seedSupplierInventory(workspace);
        seedProductionOrders(workspace);
        seedRetailInventory(workspace);
        seedPerformanceRecords(workspace);
        seedSupplyRequests(workspace);
        seedRestockRequests(workspace);

        return workspace;
    }

    public static SonyEcoSystem createSeededEcosystem() {
        SonyEcoSystem ecosystem = SonyEcoSystem.createDefaultEcosystem();
        seedAllRoleAccounts(ecosystem);
        seedContentPublishingRequests(ecosystem);
        seedEcosystemWorkRequestStatuses(ecosystem.getWorkRequests());
        return ecosystem;
    }

    private static void seedSupplierInventory(SonyRoleWorkspace workspace) {
        for (Object[] row : SUPPLIER_INVENTORY) {
            workspace.getSupplierService().addInventoryItem(
                    new InventoryItem((String) row[0], (String) row[1], (Integer) row[2])
            );
        }
    }

    private static void seedProductionOrders(SonyRoleWorkspace workspace) {
        for (Object[] row : PRODUCTION_ORDERS) {
            workspace.getProductionManagerService().addProductionOrder(
                    new ProductionOrder((String) row[0], (String) row[1], (Integer) row[2], (ProductionOrderStatus) row[3])
            );
        }
    }

    private static void seedRetailInventory(SonyRoleWorkspace workspace) {
        for (Object[] row : RETAIL_INVENTORY) {
            workspace.getRetailManagerService().addStoreInventoryItem(
                    new InventoryItem((String) row[0], (String) row[1], (Integer) row[2])
            );
        }
    }

    private static void seedPerformanceRecords(SonyRoleWorkspace workspace) {
        for (Object[] row : PERFORMANCE_DATA) {
            workspace.getRetailManagerService().addPerformanceRecord(
                    new PerformanceRecord((String) row[0], (Integer) row[1], (Double) row[2])
            );
        }
    }

    private static void seedSupplyRequests(SonyRoleWorkspace workspace) {
        for (int index = 0; index < SUPPLY_REQUESTS.length; index++) {
            String[] row = SUPPLY_REQUESTS[index];
            ComponentSupplyRequest supplyRequest = workspace.getSupplierService().createSupplyRequest(
                    row[0],
                    workspace.getSupplierOrganization(),
                    workspace.getManufacturingOrganization(),
                    row[1]
            );
            if (index == 1) {
                supplyRequest.setStatus(WorkRequestStatus.APPROVED);
            } else if (index == 2) {
                supplyRequest.setStatus(WorkRequestStatus.REJECTED);
            }
            workspace.addSupplyRequest(supplyRequest);
        }
    }

    private static void seedRestockRequests(SonyRoleWorkspace workspace) {
        for (int index = 0; index < RESTOCK_REQUESTS.length; index++) {
            String[] row = RESTOCK_REQUESTS[index];
            RetailRestockRequest restockRequest = workspace.getRetailManagerService().requestRestock(
                    row[0],
                    workspace.getRetailerOrganization(),
                    workspace.getManufacturingOrganization(),
                    row[1]
            );
            if (index == 1) {
                restockRequest.setStatus(WorkRequestStatus.PENDING);
            }
            workspace.addRestockRequest(restockRequest);
        }
    }

    private static void seedAllRoleAccounts(SonyEcoSystem ecosystem) {
        for (Object[] row : ROLE_ACCOUNT_SEEDS) {
            Organization organization = findOrganization(ecosystem, (OrganizationType) row[0]);
            if (organization == null) {
                continue;
            }

            String username = (String) row[2];
            UserAccountDirectory userAccountDirectory = organization.getUserAccountDirectory();
            if (!userAccountDirectory.checkIfUsernameIsUnique(username)) {
                continue;
            }

            Employee employee = organization.getEmployeeDirectory().createEmployee((String) row[4]);
            employee.setEmail(username + "@sony.com");
            employee.setPhone("010-1000-10" + organization.getType().ordinal());
            employee.setActive(true);
            userAccountDirectory.createUserAccount(
                    username,
                    (String) row[3],
                    employee,
                    (RoleType) row[1]
            );
        }
    }

    private static void seedContentPublishingRequests(SonyEcoSystem ecosystem) {
        Organization contentOrganization = findOrganization(ecosystem, OrganizationType.INTERACTIVE_ENTERTAINMENT);
        Organization senderOrganization = findOrganization(ecosystem, OrganizationType.GAME_DEV_STUDIO);

        if (contentOrganization == null) {
            return;
        }

        for (Object[] row : CONTENT_PUBLISHING_REQUESTS) {
            ContentPublishingRequest request = new ContentPublishingRequest(
                    (String) row[1],
                    senderOrganization != null ? senderOrganization : contentOrganization,
                    contentOrganization,
                    (String) row[5],
                    "CP-" + row[0],
                    (String) row[2],
                    (String) row[3],
                    (String) row[4]
            );
            request.setStatus((WorkRequestStatus) row[6]);
            ecosystem.addWorkRequest(request);
            contentOrganization.addWorkRequest(request);
            if (senderOrganization != null && senderOrganization != contentOrganization) {
                senderOrganization.addWorkRequest(request);
            }
        }
    }

    private static void seedEcosystemWorkRequestStatuses(ArrayList<WorkRequest> workRequests) {
        for (int index = 0; index < workRequests.size() && index < ECOSYSTEM_REQUEST_STATUSES.length; index++) {
            workRequests.get(index).setStatus(ECOSYSTEM_REQUEST_STATUSES[index]);
        }
    }

    private static Organization findOrganization(SonyEcoSystem ecosystem, OrganizationType organizationType) {
        for (Enterprise enterprise : ecosystem.getEnterpriseList()) {
            Organization organization = enterprise.findOrganizationByType(organizationType);
            if (organization != null) {
                return organization;
            }
        }
        return null;
    }
}
