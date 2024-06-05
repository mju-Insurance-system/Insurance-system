package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {
	
	Statement st;//쿼리문을 위한 객체

	static Connection conn;//연동을 위한 객체
	PreparedStatement pstmt;
	ResultSet rs;

	
	public static void dataconn(){
		try {
			String dbURL = "jdbc:mysql://127.0.0.1:3306/login";
			String dbID = "root";
			String dbPassword = "0310";
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
		}catch(Exception e) {
			System.out.println("fail");
			e.printStackTrace();
			
		}
	}
	public int idCheck(String id, String pw) {
		int result=0; 
		
		dataconn();
		
		try {
			st = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet resultSet;
		

		
		String q = "";
		q =     "SELECT count(*) AS CNT";
		q = q + "  FROM USERINFO ";
		q = q + "WHERE userId = '"+id+"'";
		q = q + "  AND password = '"+pw+"'";
		
		try {
			resultSet = st.executeQuery(q);
			if(resultSet.next()) {
				result = resultSet.getInt("CNT");
//				System.out.println(result);
			}else {
				System.out.println("no");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 return result;
	}
	public String getStudentNum(String id) {
		String result = null;
		
		dataconn();
		ResultSet resultSet;
		
		String q = "";
		q =     "SELECT id";
		q = q + "  FROM USERINFO ";
		q = q + "WHERE userId = '"+id+"'";
		
		try {
			resultSet = st.executeQuery(q);
			if(resultSet.next()) {
				result = resultSet.getString("id");
//				System.out.println(result);
			}else {
				System.out.println("no");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
