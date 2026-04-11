/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Hyungs
 */
public class EnterpriseDirectory {
    
    private final ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        this.enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public Enterprise createAndAddEnterprise(String name, EnterpriseType type) {
        Enterprise enterprise;
        switch (type) {
            case DIGITAL_ENTERTAINMENT:
                enterprise = new DigitalEntertainment(name);
                break;
            case HARDWARE_AND_SUPPLY_CHAIN:
                enterprise = new HardwareAndSupplyChain(name);
                break;
            case PARTNER_AND_SERVICE:
                enterprise = new PartnerAndService(name);
                break;
            default:
                throw new IllegalStateException("Unsupported enterprise type: " + type);
        }

        addEnterprise(enterprise);
        return enterprise;
    }

    public void addEnterprise(Enterprise enterprise) {
        if (enterprise != null && !enterpriseList.contains(enterprise)) {
            enterpriseList.add(enterprise);
        }
    }

    public boolean removeEnterprise(Enterprise enterprise) {
        return enterpriseList.remove(enterprise);
    }

    public Enterprise findEnterpriseByName(String enterpriseName) {
        for (Enterprise enterprise : enterpriseList) {
            if (enterprise.getName().equalsIgnoreCase(enterpriseName)) {
                return enterprise;
            }
        }
        return null;
    }
}