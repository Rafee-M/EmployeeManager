package GUI;

import GUI.Login;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Raafee-M
 */



public class SplashScreen extends javax.swing.JFrame {

    public SplashScreen() {
        initComponents();
        setLocationRelativeTo(null); // Set start position to center of the screen
        this.setResizable(false); // Make the frame not resizable

        addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("e");
                Splash();
                removeKeyListener(this);
            }

            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SplashPanel = new javax.swing.JPanel();
        SplashLogo = new javax.swing.JLabel();
        SplashText = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SplashPanel.setBackground(new java.awt.Color(51, 51, 51));

        SplashLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-banner.png"))); // NOI18N

        SplashText.setEditable(false);
        SplashText.setBackground(new java.awt.Color(51, 51, 51));
        SplashText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SplashText.setForeground(new java.awt.Color(204, 204, 204));
        SplashText.setText("Press any key to continue");
        SplashText.setBorder(null);
        SplashText.setFocusable(false);

        javax.swing.GroupLayout SplashPanelLayout = new javax.swing.GroupLayout(SplashPanel);
        SplashPanel.setLayout(SplashPanelLayout);
        SplashPanelLayout.setHorizontalGroup(
            SplashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SplashPanelLayout.createSequentialGroup()
                .addGroup(SplashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SplashPanelLayout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(SplashLogo))
                    .addGroup(SplashPanelLayout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(SplashText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        SplashPanelLayout.setVerticalGroup(
            SplashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SplashPanelLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(SplashLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(SplashText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplashPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplashPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }

    public void Splash() {

        SplashPanel.remove(SplashLogo);
        SplashPanel.remove(SplashText);

    // Repaint the container
        SplashPanel.revalidate();
        SplashPanel.repaint();
        
        Login loginFrame = new Login(this); //passing this instance to Login.java instance
        javax.swing.JPanel loginPanel = loginFrame.getLoginPanel();
        
        SplashPanel.add(loginPanel);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SplashLogo;
    private javax.swing.JPanel SplashPanel;
    private javax.swing.JTextField SplashText;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
