package tareaform;

import Dal.connection;
import java.sql.ResultSet;

public class FormLogin extends javax.swing.JFrame {
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }
    public FormLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnRegistrar = new javax.swing.JButton();
        btnIniciar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtUsername.setText("Usuario");
        txtUsername.setToolTipText("Coloque su nombre de usuario");
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Login");

        txtPassword.setText("Contraseña");
        txtPassword.setToolTipText("Introduzca su contraseña");
        txtPassword.setEchoChar('\u0000');
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(52, 221, 26));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-portapapeles-25.png"))); // NOI18N
        btnRegistrar.setText("Registrase");
        btnRegistrar.setToolTipText("Cree una nueva cuenta");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnIniciar1.setBackground(new java.awt.Color(33, 144, 185));
        btnIniciar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-invitado-masculino-24.png"))); // NOI18N
        btnIniciar1.setText("Iniciar sesión");
        btnIniciar1.setToolTipText("Abre una lista con los usuarios");
        btnIniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciar1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel2.setText("*Nota: Dejar el mouse sobre un objeto enseña");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel3.setText("un texo, algunos no.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsername)
                                    .addComponent(txtPassword)
                                    .addComponent(btnIniciar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnIniciar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed
    
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        try
        {
            SigninUser UserFr = new SigninUser();
            UserFr.setVisible(true);
            this.dispose();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed
    
    private void btnIniciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar1ActionPerformed
        
        Errorvacio err = new Errorvacio();
        connection objConnection = new connection();         
        String use = txtUsername.getText();
        String passcod = new String (txtPassword.getPassword());
           
        try
        {
            ResultSet result = objConnection.Consultasql("Select * from usuarios");
            String use2 = "";
            String passcod2 = "";
            String use3 = "";
            String passcod3 = "";
            
            while(result.next())
            {
                
                use2 = result.getString("Username");
                passcod2 = result.getString("Password");
                
                if(use.equals(use2) && passcod.equals(passcod2))
                {
                    use3 = use;
                    passcod3 = passcod;
                    RegistroUser RegistroFr = new RegistroUser();
                    RegistroFr.setVisible(true);
                    
                }
            }
            if(use3 == use && passcod3 == passcod)
            {
                this.dispose();
            }
            else if(use.equals("Usuario") || passcod.equals("Contraseña"))
            {
                err.setError("Ingrese su nombre de usuario y contraseña, sino tiene cuenta registrese.");
            }
            else
            {
                err.setError("Usuario o contraseña incorrectos");
                err.setVisible(true);
            }
                
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_btnIniciar1ActionPerformed
    
    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        if (String.valueOf(txtPassword.getPassword()).equals("Contraseña")) 
            {
                    txtPassword.setText("");                  
                    txtPassword.setEchoChar('*');
                    
            }// TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        if (String.valueOf(txtPassword.getPassword()).isEmpty()) 
                {
                    txtPassword.setText("Contraseña");
                    txtPassword.setEchoChar((char)0);
                }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        if (txtUsername.getText().equals("Usuario")) {
                    txtUsername.setText("");
                }
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        if (txtUsername.getText().isEmpty()) {
                    txtUsername.setText("Usuario");
        }
    }//GEN-LAST:event_txtUsernameFocusLost
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar1;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
