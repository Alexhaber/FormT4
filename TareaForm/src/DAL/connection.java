package Dal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class connection
{
	String strconnectDB = "jdbc:sqlite:C:\\Users\\Admin\\Documents\\TareaForm\\db\\registro_usuarios.s3db";
	Connection conexion = null;
	
	public connection()
	{
		try{
			Class.forName("org.sqlite.JDBC");
			conexion = DriverManager.getConnection(strconnectDB);
			System.out.println("Conexion lograda");
		}
		catch(Exception e){
			System.out.println("Conexion fallada" + e);
		}
		
	}
	
	public int EjecutarSql(String sentenciasql)
	{
		try{
			PreparedStatement prm = conexion.prepareStatement(sentenciasql);
			prm.execute();
			return 1;
		}
		catch(Exception e){
			System.out.println(e);
			return 0;
		}
	}
	
	public ResultSet Consultasql(String sentenciasql)
	{
		try
		{
			PreparedStatement prm = conexion.prepareStatement(sentenciasql);
			ResultSet retorno = prm.executeQuery();
			return retorno;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return null;
		}
	}
}
