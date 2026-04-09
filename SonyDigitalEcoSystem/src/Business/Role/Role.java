/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

/**
 *
 * @author Hyungs
 */
public abstract class Role {

    private final RoleType type;

    protected Role(RoleType type) {
        this.type = type;
    }

    public RoleType getType() {
        return type;
    }

    public String getDisplayName() {
        return type.getDisplayName();
    }

    public abstract String getDashboardTitle();

    public JPanel createWorkArea(SonyRoleWorkspace workspace) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(
                new JLabel("No work area implemented for " + getDisplayName(), SwingConstants.CENTER),
                BorderLayout.CENTER
        );
        return panel;
    }
}
