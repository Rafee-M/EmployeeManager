package GUI;

import employeemanager.ComboBoxFill;
import employeemanager.Employee;
import employeemanager.FileInfoReader;
import employeemanager.UsernameLedger;
import java.awt.Dimension;
import java.io.IOException;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Rafee-M 
 */

public class AdminViewEmployeeInfo extends javax.swing.JFrame implements ComboBoxFill{

    private AdminHomePage page;
    private FileInfoReader infoReader = new FileInfoReader();
    private Employee employee;
    
    public AdminViewEmployeeInfo() {
        initComponents();
        fillComboBox();
        viewEmployeeInfo((String) EmployeeListCombo.getSelectedItem());
        
        this.setSize(955, 729);
        
    }
    
    public AdminViewEmployeeInfo(AdminHomePage a) {
        initComponents();
        fillComboBox();
        viewEmployeeInfo((String) EmployeeListCombo.getSelectedItem());
        page = a;
        this.setSize(955, 729);
        
    
    }
    public AdminViewEmployeeInfo(AdminHomePage a, int x, int y) {
        initComponents();
        fillComboBox();
        viewEmployeeInfo((String) EmployeeListCombo.getSelectedItem());
        this.setLocation(x, y);
        this.setResizable(false); // Make the frame not resizable
        page = a;
        this.setSize(955, 729);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        AdminViewEmployeeLabel = new javax.swing.JLabel();
        EmployeeListCombo = new javax.swing.JComboBox<>();
        EmployeeNameLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ageLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        salaryLabel = new javax.swing.JLabel();
        positionLabel = new javax.swing.JLabel();
        idValue = new javax.swing.JLabel();
        usernameValue = new javax.swing.JLabel();
        nameValue = new javax.swing.JLabel();
        ageValue = new javax.swing.JLabel();
        salaryValue = new javax.swing.JLabel();
        genderValue = new javax.swing.JLabel();
        positionValue = new javax.swing.JLabel();
        FileError = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        AdminViewEmployeeLabel.setBackground(new java.awt.Color(203, 78, 22));
        AdminViewEmployeeLabel.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        AdminViewEmployeeLabel.setForeground(new java.awt.Color(228, 228, 228));
        AdminViewEmployeeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin-view-employee-label.png"))); // NOI18N

        EmployeeListCombo.setBackground(new java.awt.Color(102, 102, 102));
        EmployeeListCombo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EmployeeListCombo.setForeground(new java.awt.Color(255, 255, 255));
        EmployeeListCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        EmployeeListCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeListComboActionPerformed(evt);
            }
        });

        EmployeeNameLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        EmployeeNameLabel6.setForeground(new java.awt.Color(255, 255, 255));
        EmployeeNameLabel6.setText("Select Employee Username:");

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        ageLabel.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        ageLabel.setForeground(new java.awt.Color(39, 39, 39));
        ageLabel.setText("Age:");

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(39, 39, 39));
        usernameLabel.setText("Username:");

        idLabel.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        idLabel.setForeground(new java.awt.Color(39, 39, 39));
        idLabel.setText("ID:");

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(39, 39, 39));
        nameLabel.setText("Name:");

        genderLabel.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(39, 39, 39));
        genderLabel.setText("Gender:");

        salaryLabel.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        salaryLabel.setForeground(new java.awt.Color(39, 39, 39));
        salaryLabel.setText("Salary:");

        positionLabel.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        positionLabel.setForeground(new java.awt.Color(39, 39, 39));
        positionLabel.setText("Position:");

        idValue.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        idValue.setForeground(new java.awt.Color(23, 23, 23));
        idValue.setText("null");

        usernameValue.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        usernameValue.setForeground(new java.awt.Color(23, 23, 23));
        usernameValue.setText("null");

        nameValue.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        nameValue.setForeground(new java.awt.Color(23, 23, 23));
        nameValue.setText("null");

        ageValue.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        ageValue.setForeground(new java.awt.Color(23, 23, 23));
        ageValue.setText("null");

        salaryValue.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        salaryValue.setForeground(new java.awt.Color(23, 23, 23));
        salaryValue.setText("null");

        genderValue.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        genderValue.setForeground(new java.awt.Color(23, 23, 23));
        genderValue.setText("null");

        positionValue.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        positionValue.setForeground(new java.awt.Color(23, 23, 23));
        positionValue.setText("null");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idLabel)
                    .addComponent(usernameLabel)
                    .addComponent(nameLabel)
                    .addComponent(ageLabel)
                    .addComponent(genderLabel)
                    .addComponent(positionLabel)
                    .addComponent(salaryLabel))
                .addGap(179, 179, 179)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idValue)
                    .addComponent(nameValue)
                    .addComponent(usernameValue)
                    .addComponent(ageValue)
                    .addComponent(genderValue)
                    .addComponent(salaryValue)
                    .addComponent(positionValue))
                .addGap(0, 475, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameValue))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idValue))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameValue))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageValue))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(genderValue))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salaryLabel)
                    .addComponent(salaryValue))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(positionLabel)
                    .addComponent(positionValue))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        FileError.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        FileError.setForeground(new java.awt.Color(255, 51, 51));
        FileError.setText("Error Reading File");
        FileError.setVisible(false);

        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back-button.png"))); // NOI18N
        BackButton.setContentAreaFilled(false);
        BackButton.setSelected(true);
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addComponent(EmployeeNameLabel6)
                            .addGap(143, 143, 143)
                            .addComponent(EmployeeListCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AdminViewEmployeeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addComponent(FileError)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(FileError))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(AdminViewEmployeeLabel)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmployeeNameLabel6)
                    .addComponent(EmployeeListCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void EmployeeListComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeListComboActionPerformed
        String selectedUser = (String) EmployeeListCombo.getSelectedItem();
        viewEmployeeInfo(selectedUser);
               
        
        
    }//GEN-LAST:event_EmployeeListComboActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(false);
        page.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    public void viewEmployeeInfo(String username){
        try{
            employee = infoReader.readUser(username, false);
            
            this.nameValue.setText(employee.getName());
            this.idValue.setText(String.valueOf(employee.getId()));
            this.usernameValue.setText(employee.getUsername());
            this.ageValue.setText(String.valueOf(employee.getAge()));
            this.salaryValue.setText(String.valueOf(employee.getSalary()));
            this.positionValue.setText(employee.getPosition());
            
            String gender = (employee.getGender() == 0) ? "Male" : "Female";
            this.genderValue.setText(gender);
            
            jPanel3.setPreferredSize(new Dimension(824, 451));
            FileError.setVisible(false);
            

            
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            FileError.setVisible(true);
            jPanel3.setPreferredSize(new Dimension(824, 451));
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminViewEmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewEmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewEmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewEmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewEmployeeInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminViewEmployeeLabel;
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox<String> EmployeeListCombo;
    private javax.swing.JLabel EmployeeNameLabel6;
    private javax.swing.JLabel FileError;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel ageValue;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel genderValue;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel idValue;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameValue;
    private javax.swing.JLabel positionLabel;
    private javax.swing.JLabel positionValue;
    private javax.swing.JLabel salaryLabel;
    private javax.swing.JLabel salaryValue;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel usernameValue;
    // End of variables declaration//GEN-END:variables

    @Override
    public void fillComboBox() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        UsernameLedger ledger = new UsernameLedger();
        
        try{
            for(String username : ledger.getUsernames()){
                model.addElement(username);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        EmployeeListCombo.setModel(model);
        
    }
}