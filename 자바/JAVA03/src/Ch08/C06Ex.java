package Ch08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C06Ex {

	public static void main(String[] args) {
		// DB CONN DATA
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/opendatadb";

		// JDBC참조변수
		Connection conn = null; // DBMS의 특정 DB와 연결되는 객체
		PreparedStatement pstmt = null; // SQL Query 전송용 객체
		ResultSet rs = null; // Select 결과물 담을 객체

		// 연결작업
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // JDBC 드라이버 로딩
			System.out.println("Driver Loading Success...");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB CONNECTED...");

			// 00. charge_station.sql 을 dbms에 복원하세요 (opendatadb.tbl_charge)
			// 01. tbl_charge에 insert 코드 실행

//			pstmt = conn.prepareStatement("insert into tbl_charge values(?, ?, ?, ?, ?, ?)");
//			pstmt.setInt(1, 200);
//			pstmt.setString(2, "대구");
//			pstmt.setString(3, "대구지사");
//			pstmt.setString(4, "너거집");
//			pstmt.setInt(5, 38882);
//			pstmt.setString(6, "경산시 경안로");

			// sql를 dbms로 전달
//			int result = pstmt.executeUpdate();
			// 결과값으로 java에서 처리
//			if (result > 0)
//				System.out.println("INSERT 성공");
//			else
//				System.out.println("INSERT 실패");

//		} catch (ClassNotFoundException e1) {
//			System.out.println("클래스 부재 예외발생!");
//		} catch (SQLException e2) {
//			    	  System.out.println("SQL 예외발생!");
//			e2.printStackTrace();
//		} finally {
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
			// 02. tbl_charge에 update 코드 실행
			pstmt = conn.prepareStatement("update tbl_charge set name = ? where 순번 = ?);
			pstmt.setInt(1, 200);
			pstmt.setString(2, "집");
			pstmt.setString(3, "우리 집");
			pstmt.setString(4, "내 집");
			pstmt.setInt(5, 38542);
			pstmt.setString(6, "경산시 경안로");

			int result = pstmt.executeUpdate();
			// 결과값으로 java에서 처리
			if (result > 0)
				System.out.println("INSERT 성공");
			else
				System.out.println("INSERT 실패");

		} catch (ClassNotFoundException e1) {
			System.out.println("클래스 부재 예외발생!");
		} catch (SQLException e2) {
//		    	  System.out.println("SQL 예외발생!");
			e2.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// 03. tbl_charge에 delete 코드 실행
		// 04. tbl_charge에 내용을 Select한 결과 console에서 확인
		// sql query 객체 생성

	}

}
