package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class MemberDAO {

	//멤버변수 (클래스 전체 멤버메소드에서 접근가능)
	Connection con;
	PreparedStatement psmt;
	ResultSet rs;
	
	public MemberDAO() {
		System.out.println("기본생성자 실행");
	}
	public MemberDAO(String driver, String url) {
	   try {
		   Class.forName(driver);
		   String id = "kosmo";
		   String pw = "1234";
		   con =DriverManager.getConnection(url, id, pw);
		   System.out.println("DB연결성공");
	   }
	   catch (Exception e) {
		e.printStackTrace();
	   }
	}
	
	public Map<String, String> getMemberMap(String id, String pwd){
	  
		Map<String, String> maps = new HashMap<String, String>();

		String query = "Select id, pass, name FROM "
				+" member WHERE id=? AND pass=?";
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, id);
			psmt.setString(2, pwd);
			rs = psmt.executeQuery();

			if(rs.next()) {
				maps.put("id",rs.getString(1));
				maps.put("pass",rs.getString("pass"));
				maps.put("name",rs.getString("name"));
			}
			else {
				System.out.println("결과셋이 없습니다.");
			}
		}
		catch (SQLException e) {
			System.out.println("getMemberDTO오류");
			e.printStackTrace();
		}

		//DTO객체를 반환한다.
		return maps; 
	}
	
	
}
