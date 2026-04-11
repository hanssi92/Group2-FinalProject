/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkSpace;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.SonyEcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Hyungs
 */
public final class WorkAreaSupport {
    private WorkAreaSupport() {
    }

    public static void populateProfileFields(
            SonyEcoSystem ecosystem,
            UserAccount account,
            JTextField txtName,
            JTextField txtRole,
            JTextField txtOrganization,
            JTextField txtEnterprise,
            JTextField txtEmail,
            JTextField txtPhone,
            JTextField txtStatus) {
        Employee employee = account != null ? account.getEmployee() : null;
        String name = employee != null ? employee.getName() : "";
        String role = account != null && account.getRoleType() != null ? account.getRoleType().getDisplayName() : "";
        Organization organization = ecosystem != null ? ecosystem.findOrganizationByUserAccount(account) : null;
        Enterprise enterprise = ecosystem != null ? ecosystem.findEnterpriseByOrganization(organization) : null;

        if (txtName != null) txtName.setText(name);
        if (txtRole != null) txtRole.setText(role);
        if (txtOrganization != null) txtOrganization.setText(organization != null ? organization.getName() : "");
        if (txtEnterprise != null) txtEnterprise.setText(enterprise != null ? enterprise.getName() : "");
        if (txtEmail != null) txtEmail.setText(employee != null ? employee.getEmail() : "");
        if (txtPhone != null) txtPhone.setText(employee != null ? employee.getPhone() : "");
        if (txtStatus != null) txtStatus.setText(account != null && account.isActive() ? "Active" : "Inactive");
    }

    public static void makeReadOnly(JTextField... fields) {
        if (fields == null) {
            return;
        }
        for (JTextField field : fields) {
            if (field != null) {
                field.setEditable(false);
            }
        }
    }

    public static void showSelectedRowDetails(java.awt.Component parent, JTable table, String title) {
        int selectedRow = table.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(parent, "Select a row first.");
            return;
        }

        StringBuilder builder = new StringBuilder();
        for (int column = 0; column < table.getColumnCount(); column++) {
            builder.append(table.getColumnName(column))
                    .append(": ")
                    .append(table.getValueAt(selectedRow, column))
                    .append("\n");
        }
        
        JOptionPane.showMessageDialog(parent, builder.toString(), title, JOptionPane.INFORMATION_MESSAGE);
    }
}
