package tareaform;

import java.sql.ResultSet;
import Dal.connection;
import UserBL.UserBL;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class RegistroUser extends Padre {

    DefaultTableModel model;
    
    
    
    public RegistroUser() 
    {
        String[] titles = {"Usuario","Nombre","Apellido","Num_telefono","Email"};
        initComponents();
        model = new DefaultTableModel(null,titles);
        tblUsers.setModel(model);        
        integrarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        labelusername = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtLast_name = new javax.swing.JTextField();
        txtPhone_number = new javax.swing.JTextField();
        labelname = new javax.swing.JLabel();
        labelLastame = new javax.swing.JLabel();
        labelNum = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        jScrollPane1.setViewportView(jTree1);

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(207, 207, 207));

        btnEditar.setBackground(new java.awt.Color(128, 128, 240));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-editar-usuaria-25.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Edite los datos un usuario, menos el nombre de usuario");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(140, 234, 59));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-basura-llena-25.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Elimine un usuario");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Username", "Name", "Last_name", "Phone_number", "Email"
            }
        ));
        tblUsers.setToolTipText("Lista de usuarios, todos los usuarios tienen un Username único, no se pueden repetir registros");
        tblUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblUsers);

        btnCerrar.setBackground(new java.awt.Color(222, 19, 30));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-salida-de-emergencia-24.png"))); // NOI18N
        btnCerrar.setText("Cerrar sesión");
        btnCerrar.setToolTipText("Volver a la panatalla del login");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        txtUsername.setEditable(false);
        txtUsername.setToolTipText("No encontr la manera de hacer poderlo cambiar por más la sintaxis");
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        labelusername.setText("Nombre de usuario");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtPhone_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhone_numberActionPerformed(evt);
            }
        });

        labelname.setText("Nombre");

        labelLastame.setText("Apellido");

        labelNum.setText("Numero de telefono");

        label.setText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelusername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelLastame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsername)
                            .addComponent(txtName)
                            .addComponent(txtLast_name)
                            .addComponent(txtPhone_number, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addComponent(label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelusername)
                    .addComponent(label)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLast_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLastame))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try
        {         
            connection objConnection = new connection();
            UserBL objUserBL = ObtenerDatos();
            
            String txtDelete = String.format("DELETE FROM usuarios WHERE Username = '%s'",objUserBL.getUsername());
            objConnection.EjecutarSql(txtDelete);
            this.integrarDatos();
                        
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
            connection objConnection = new connection();    
            UserBL objUserBL = ObtenerDatos();
            
            String user = objUserBL.getUsername();
            //Mucho texto
            String Update = String.format("Update usuarios Set Name = '%s', Last_name = '%s', Phone_number = '%s', Email = '%s' Where Username = '%s'",objUserBL.getName(),objUserBL.getLast_name(),objUserBL.getPhone_number(),objUserBL.getEmail(), user);
            objConnection.EjecutarSql(Update);
            
            this.integrarDatos();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void integrarDatos()
    {
        while(model.getRowCount()>0){
            model.removeRow(0);
        }
        connection objConnection = new connection();
        try
        {   
            
                
            
            ResultSet retorno = objConnection.Consultasql("Select * from usuarios");

            while(retorno.next())
            {
                System.out.println(retorno.getString("Username"));
                System.out.println(retorno.getString("Name"));
                System.out.println(retorno.getString("Last_name"));
                System.out.println(retorno.getString("Phone_number"));
                System.out.println(retorno.getString("Email"));
                
                Object[] objUser = {retorno.getString("Username"), retorno.getString("Name"),retorno.getString("Last_name"), retorno.getString("Phone_number"), retorno.getString("Email")};
                model.addRow(objUser);
            }
        }
        catch(Exception e)
        {
            System.out.println("Conexion fallada" + e);
        }
    }
    
    //Sobreescrotura del metodo heredado de "Padre"
    @Override
    protected UserBL ObtenerDatos()
    {
        UserBL objUserBL = new UserBL();
               
        objUserBL.setUsername(txtUsername.getText());
        objUserBL.setName(txtName.getText());
        objUserBL.setLast_name(txtLast_name.getText());
        objUserBL.setPhone_number(txtPhone_number.getText());
        objUserBL.setEmail(txtEmail.getText());
        
        
        return objUserBL;
    }
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        FormLogin LoginFr = new FormLogin();
        LoginFr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPhone_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhone_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhone_numberActionPerformed

    private void tblUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsersMouseClicked
        if(evt.getClickCount() == 1)
        {
            JTable recept = (JTable)evt.getSource();
            
            txtUsername.setText(recept.getModel().getValueAt(recept.getSelectedRow(),0).toString());
            txtName.setText(recept.getModel().getValueAt(recept.getSelectedRow(),1).toString());
            txtLast_name.setText(recept.getModel().getValueAt(recept.getSelectedRow(),2).toString());
            txtPhone_number.setText(recept.getModel().getValueAt(recept.getSelectedRow(),3).toString());
            txtEmail.setText(recept.getModel().getValueAt(recept.getSelectedRow(),4).toString());  
        }
    }//GEN-LAST:event_tblUsersMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel labelLastame;
    private javax.swing.JLabel labelNum;
    private javax.swing.JLabel labelname;
    private javax.swing.JLabel labelusername;
    private javax.swing.JTable tblUsers;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLast_name;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone_number;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
