package UserBL;

public class UserBL
{
	private String Username;
	private String Name;
	private String Last_name;
	private String Phone_number;
	private String Email;
	private String Password;
        private String Passwordx;
    
    //getters
    public String getUsername(){
    	return Username;
    }
    
    public String getName(){
    	return Name;
    }
    
    public String getLast_name(){
    	return Last_name;
    }
    
    public String getPhone_number(){
    	return Phone_number;
    }
    
    public String getEmail(){
    	return Email;
    }
    
    public String getPassword(){
    	return Password;
    }
    
    public String getPasswordx(){
    	return Passwordx;
    }
    
    //setters
    public void setUsername(String Username) {
    	this.Username = Username;
    }
    
    public void setName(String Name) {
    	this.Name = Name;
    }
    
    public void setLast_name(String Last_name) {
    	this.Last_name = Last_name;
    }
    
    public void setPhone_number(String Phone_number) {
    	this.Phone_number = Phone_number;
    }
    
    public void setEmail(String Email) {
    	this.Email = Email;
    }
    
    public void setPassword(String Password){
    	this.Password = Password;
    }
    
    public void setPasswordx(String Passwordx){
    	this.Passwordx = Passwordx;
    }   
}