package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DB_TEST.OracleXEConnection;

public class TuserDao {
	
	StringBuffer sb = new StringBuffer();
	ResultSet rs=  null;
	PreparedStatement pstmt = null;
	Connection conn = null;
	
	public TuserDao() {
		conn = OracleXEConnection.getInstance().getConnection();
		System.out.println(conn);
	}//생성자 end
	
	
	
	

}
