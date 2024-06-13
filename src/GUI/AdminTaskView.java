/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import employeemanager.ComboBoxFill;
import employeemanager.EmployeeSaving;
import employeemanager.TaskViewing;
import employeemanager.UserNotFoundException;
import employeemanager.UsernameLedger;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSeparator;


/**
 *
 * @author Rafee-M
 */

public class AdminTaskView extends javax.swing.JFrame implements ComboBoxFill{

    
    private AdminHomePage page;
    private TaskViewing taskView = new TaskViewing();
    
    public AdminTaskView() {
        initComponents();
        fillComboBox();
    }
    

    public AdminTaskView(AdminHomePage a) {
        initComponents();
        fillComboBox();
        page = a;
    }
    
    public AdminTaskView(AdminHomePage a, int x, int y) {
        initComponents();
        fillComboBox();
        this.setLocation(x, y);
        this.setResizable(false); // Make the frame not resizable
        page = a;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AdminTaskViewLabel = new javax.swing.JLabel();
        EmployeeNameLabel = new javax.swing.JLabel();
        AdminViewTaskButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TaskViewList = new javax.swing.JList<>();
        EmployeeListCombo = new javax.swing.JComboBox<>();
        FileError = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        AdminTaskViewLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin-task-viewing.png"))); // NOI18N

        EmployeeNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        EmployeeNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmployeeNameLabel.setText("Select Employee Username:");

        AdminViewTaskButton.setBackground(new java.awt.Color(102, 102, 102));
        AdminViewTaskButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        AdminViewTaskButton.setForeground(new java.awt.Color(255, 255, 255));
        AdminViewTaskButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-icon.png"))); // NOI18N
        AdminViewTaskButton.setText(" View Tasks");
        AdminViewTaskButton.setFocusPainted(false);
        AdminViewTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminViewTaskButtonActionPerformed(evt);
            }
        });

        TaskViewList.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TaskViewList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        TaskViewList.setCellRenderer(new CustomListCellRenderer());
        jScrollPane2.setViewportView(TaskViewList);

        EmployeeListCombo.setBackground(new java.awt.Color(102, 102, 102));
        EmployeeListCombo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EmployeeListCombo.setForeground(new java.awt.Color(255, 255, 255));
        EmployeeListCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        EmployeeListCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeListComboActionPerformed(evt);
            }
        });

        FileError.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        FileError.setForeground(new java.awt.Color(255, 51, 51));
        FileError.setText("Employee has been FIRED");
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
                .addGap(28, 28, 28)
                .addComponent(BackButton)
                .addGap(208, 208, 208)
                .addComponent(AdminTaskViewLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmployeeListCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FileError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(EmployeeNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AdminViewTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(AdminTaskViewLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmployeeNameLabel)
                    .addComponent(AdminViewTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(EmployeeListCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208)
                        .addComponent(FileError)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void AdminViewTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminViewTaskButtonActionPerformed
        String username = (String)EmployeeListCombo.getSelectedItem();
        EmployeeSaving save = new EmployeeSaving();
        
        try {
            if(save.checkFired(username)){
                FileError.setVisible(true);
                return;
            }
        } catch (UserNotFoundException ex) {
            System.out.println(ex.getMessage());
            FileError.setText("File Error");
        }
        
        DefaultListModel<String> model = new DefaultListModel<>();
        FileError.setVisible(false);
        
        
        try {
            model.addAll(taskView.viewTasks(username, true));
            TaskViewList.setModel(model);
        } catch (UserNotFoundException ex) {
            Logger.getLogger(AdminTaskView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_AdminViewTaskButtonActionPerformed

    private void EmployeeListComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeListComboActionPerformed
        String selectedUser = (String) EmployeeListCombo.getSelectedItem();

    }//GEN-LAST:event_EmployeeListComboActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        this.setVisible(false);
        page.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

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

    public class CustomListCellRenderer extends DefaultListCellRenderer {
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (index < list.getModel().getSize()) {
            JSeparator separator = new JSeparator(JSeparator.HORIZONTAL);
            separator.setForeground(Color.LIGHT_GRAY);
            JPanel panel = new JPanel(new BorderLayout());
            panel.add(c, BorderLayout.CENTER);
            panel.add(separator, BorderLayout.SOUTH);
            return panel;
        } else {
            return c;
        }
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
            java.util.logging.Logger.getLogger(AdminTaskView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminTaskView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminTaskView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminTaskView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminTaskView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminTaskViewLabel;
    private javax.swing.JButton AdminViewTaskButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox<String> EmployeeListCombo;
    private javax.swing.JLabel EmployeeNameLabel;
    private javax.swing.JLabel FileError;
    private javax.swing.JList<String> TaskViewList;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
