package cl.mgn.labs.rrhh.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	
	public static void main(String[] args) throws SQLException {
		
		String username= "jmaldonado";
		String password = "kvz2015";
		String query = "select * FROM TEST_USUARIOS WHERE USERNAME='"+ username +"' and PASSWORD = '"+password+"' ";
		
		Statement stmt = null;
		Connection con = ConnectionTest.getInstance();
		stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        
        
        
        PreparedStatement pstmt = con.prepareStatement("SELECT * FROM TEST_USUARIOS WHERE USERNAME = ? and PASSWORD=?"); 
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        ResultSet rset = pstmt.executeQuery();
        
        System.out.println( rs.next() );
        
        
	}
}
