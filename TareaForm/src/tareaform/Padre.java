package tareaform;


import UserBL.UserBL;

class Padre extends javax.swing.JFrame
{
    
    private javax.swing.JTextField txtEmailx;
    private javax.swing.JTextField txtLast_name;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordx;
    private javax.swing.JTextField txtPhone_number;
    private javax.swing.JTextField txtUsername;
    
    //Facilitador de vida
    protected UserBL ObtenerDatos()
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
}
