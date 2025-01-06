package study.db.sample.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProfessorDAO {
	
	Connection conn; 
	PreparedStatement psmt; 
	ResultSet rs;
	
	public List<ProfessorDTO> findProfessorListByDeptno(int deptno){
		 
		//DB 연결 
		conn = DBConnectionManager.connectDB();

		List<ProfessorDTO> professorList = new ArrayList<ProfessorDTO>();
		
		//쿼리 준비
		String sqlQuery = "select profno, name, id, position, pay, deptno, "
				+ " TO_CHAR(hiredate, 'YYYY-MM-DD') hiredate "
				+ " from professor where deptno = ? ";
		try {
			psmt = conn.prepareStatement(sqlQuery);
			
			psmt.setInt(1, deptno);
			
			rs = psmt.executeQuery();

			while(rs.next()) {	//다음 읽어올 데이터가 있는가? true 데이터가 있다

				ProfessorDTO p = new ProfessorDTO();
				
				//profno, name, id, position, pay, deptno
				p.setProfno(rs.getInt("profno"));
				p.setName(rs.getString("name"));
				p.setId(rs.getString("id"));
				p.setPosition(rs.getString("position"));
				p.setPay(rs.getInt("pay"));
				p.setDeptno(rs.getInt("deptno"));
				  
				//java.sql.Date -> java.time.LocalDate
				//p.setHiredate(rs.getDate("hiredate").toLocalDate());
				
				//DB (Date, Timestamp) -> s.getTimestamp
				//p.setHiredate(ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("hiredate")));
				//timestamp -> LocalDateTime
				
				p.setHiredate(rs.getString("hiredate"));
				
				professorList.add(p);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		return professorList;
		
	}
}
