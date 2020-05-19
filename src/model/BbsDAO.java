package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

public class BbsDAO {
		Connection con;
		PreparedStatement psmt;
		ResultSet rs;
	
	public BbsDAO(String driver, String url) {

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

	//DB자원해제
	public void close() {
		try {
			if(rs!=null) rs.close();
			if(psmt!=null) psmt.close();
			if(con!=null) con.close();
		}
		catch (Exception e) {
			System.out.println("자원반납시 예외발생");
		}
	}
	public int getTotalRecordCount(Map<String,Object> map) {
		//게시물의 수는 0으로 초기화
		int totalCount = 0;
		//기본쿼리문(전체레코드를 대상으로 함)
		String query = "SELECT * FROM board";
		
		//JSP페이지에서 검색어를 입력한 경우 where절이 동적으로 추가됨.
		if(map.get("Word")!=null) {
			query += " WHERE "+ map.get("Column") + " "
					+" LIKE '%" + map.get("Word") + "%'";
		}
		System.out.println("query=" + query);
		
		try {
			psmt= con.prepareStatement(query);
			rs.next();
			//반환한 결과값(레코드수)을 저장
			totalCount = rs.getInt(1);
		}
		catch(Exception e) {}
		return totalCount;
	}
	
}