    package tareaform;

import Dal.connection;
import UserBL.UserBL;

public class SigninUser extends javax.swing.JFrame {

    public SigninUser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEmailx = new javax.swing.JTextField();
        jLabelemail = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelpassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabelusername = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jLabelname = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtName = new javax.swing.JTextField();
        txtPasswordx = new javax.swing.JPasswordField();
        jLabellastname = new javax.swing.JLabel();
        txtLast_name = new javax.swing.JTextField();
        jLabelphone = new javax.swing.JLabel();
        txtPhone_number = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtEmailx.setToolTipText("Coloque su  e-mail");

        jLabelemail.setText("Email");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Sign in");

        jLabelpassword.setText("Contraseña");

        txtUsername.setToolTipText("Introduzca su nombre de usuario.");
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jLabel8.setText("Confirmar contrseña");

        jLabelusername.setText("Nombre de usuario");

        btnRegistrar.setBackground(new java.awt.Color(52, 221, 26));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-añadir-usuario-masculino-24.png"))); // NOI18N
        btnRegistrar.setText("Registrase");
        btnRegistrar.setToolTipText("Todos los campos son obligatorios, si ya hay un usuario con el nombre elejido no pasara nada");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabelname.setText("Nombre");

        txtPassword.setToolTipText("Máximo 20 letras");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        txtName.setToolTipText("Introduzca su nombre real.");

        txtPasswordx.setToolTipText("Coloque la contraseña de nuevo");
        txtPasswordx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordxActionPerformed(evt);
            }
        });

        jLabellastname.setText("Apellido");

        txtLast_name.setToolTipText("Coloque su apellido.");

        jLabelphone.setText("Número de telefono");

        txtPhone_number.setToolTipText("10 caracteres, sin guiones");
        txtPhone_number.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelusername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelphone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabellastname, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabelemail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelpassword, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEmailx)
                                .addComponent(txtUsername)
                                .addComponent(txtName)
                                .addComponent(txtLast_name)
                                .addComponent(txtPhone_number)
                                .addComponent(txtPasswordx, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelusername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelname)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabellastname)
                    .addComponent(txtLast_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelphone)
                    .addComponent(txtPhone_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelemail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelpassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPasswordx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        connection objConnection = new connection();    
        UserBL objUserBL = ObtenerDatos();
        Errorvacio errVacio = new Errorvacio();
        
        try
        {   if(objUserBL.getUsername().isBlank())
            {
                errVacio.setError("El nombre esta vacio");
                    errVacio.setVisible(true);
            }
            else if(objUserBL.getName().isBlank())
            {
                errVacio.setError("El nombre esta vacio");
                    errVacio.setVisible(true);
            }
            else if(objUserBL.getLast_name().isBlank())
            {
                errVacio.setError("El apellido esta vacio");
                    errVacio.setVisible(true);
            }
            else if(objUserBL.getPhone_number().isBlank())
            {
                errVacio.setError("El numero de telefono esta vacio");
                    errVacio.setVisible(true);
            }
            else if(objUserBL.getEmail().isBlank())
            {
                errVacio.setError("El Email esta vacio");
                    errVacio.setVisible(true);
            }
            else if(objUserBL.getPassword().isBlank())
            {
                errVacio.setError("La contraseña esta vacia");
                    errVacio.setVisible(true);
            }
            else if(objUserBL.getPasswordx().isBlank()){
                errVacio.setError("La confirmación esta vacia");
                    errVacio.setVisible(true);
            }
            else
            {
                if(objUserBL.getPassword().equals(objUserBL.getPasswordx()))
                {
                    String txtInsert = String.format("Insert into usuarios (Username, Name, Last_name, Phone_number, Email, Password) "
                        + "values ('%s', '%s', '%s', '%s', '%s', '%s')",objUserBL.getUsername(),objUserBL.getName(),objUserBL.getLast_name(),objUserBL.getPhone_number(),objUserBL.getEmail(),objUserBL.getPassword());
                    objConnection.EjecutarSql(txtInsert);

                    FormLogin loginF = new FormLogin();
                    loginF.setVisible(true);
                    this.dispose();
                }
                else
                {
                    errVacio.setError("Las contraseñas no son iguales");
                    errVacio.setVisible(true);
                }                
            }
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed
           
    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtPasswordxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordxActionPerformed
    
    
    private UserBL ObtenerDatos()
    {
        UserBL objUserBL = new UserBL();
        
        String passcod = new String(txtPassword.getPassword());
        String passcodx = new String(txtPasswordx.getPassword());
        
        objUserBL.setUsername(txtUsername.getText());
        objUserBL.setName(txtName.getText());
        objUserBL.setLast_name(txtLast_name.getText());
        objUserBL.setPhone_number(txtPhone_number.getText());
        objUserBL.setEmail(txtEmailx.getText());
        objUserBL.setPassword(passcod);
        objUserBL.setPasswordx(passcodx);
        
        return objUserBL;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelemail;
    private javax.swing.JLabel jLabellastname;
    private javax.swing.JLabel jLabelname;
    private javax.swing.JLabel jLabelpassword;
    private javax.swing.JLabel jLabelphone;
    private javax.swing.JLabel jLabelusername;
    private javax.swing.JTextField txtEmailx;
    private javax.swing.JTextField txtLast_name;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordx;
    private javax.swing.JTextField txtPhone_number;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
