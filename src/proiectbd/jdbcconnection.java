package proiectbd;
import java.sql.*;

public class jdbcconnection {
	public static void main(String[] args){
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@oracle.cti.ugal.ro:1521:db","cald33","oracle");
		Statement st =con.createStatement();
		String sql="select * from emp";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()){
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+ " "+rs.getString(4) );
			
		}
	con.close();
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		
	}
}
