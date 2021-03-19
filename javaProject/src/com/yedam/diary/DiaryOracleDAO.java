package com.yedam.diary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class DBCon {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "diary";
		String password = "diary";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, id, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

}

public class DiaryOracleDAO implements DAO {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	String sql = null;
	
	public void close() {
		if(rs != null) {			
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public List<DiaryVO> getDiaryList() {
		conn = DBCon.getConnection();
		sql = "select to_char(wdate,'yymmdd') wdate, content from diary order by wdate";
		List<DiaryVO> list = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				DiaryVO vo = new DiaryVO();
				vo.setWdate(rs.getString("wdate"));
				vo.setCotents(rs.getString("content"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

	@Override
	public int insert(DiaryVO vo) {
		boolean is = false;
		if(selectDate(vo.getWdate()) != null) {
			is = true;
		}
		if(!is) {			
			conn = DBCon.getConnection();
			sql = "insert into diary values (to_date('"
					+ vo.getWdate() + "','yymmdd'), '"
					+ vo.getCotents() + "')";
			try {
				stmt = conn.createStatement();
				int r = stmt.executeUpdate(sql);
				return r;
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				close();
			}
		}
		return 0;
	}

	@Override
	public int update(DiaryVO vo) {
		conn = DBCon.getConnection();
		sql = "update diary set content = '"
				+ vo.getCotents() + "' where wdate = "
				+ "to_date('" + vo.getWdate() + "','yymmdd')";
		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			return r;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return 0;
		
	}

	@Override
	public int delete(String date) {
		conn = DBCon.getConnection();
		sql = "delete from diary where wdate = "
				+ "to_date('" + date + "','yymmdd')";
		try {
			stmt = conn.createStatement();
			int r = stmt.executeUpdate(sql);
			return r;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return 0;
	}

	@Override
	public DiaryVO selectDate(String date) {
		conn = DBCon.getConnection();
		sql = "select to_char(wdate,'yymmdd') wdate, content from diary where wdate = '"
				+ date + "'";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				DiaryVO vo = new DiaryVO();
				vo.setWdate(rs.getString("wdate"));
				vo.setCotents(rs.getString("content"));
				return vo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return null;
	}

	@Override
	public List<DiaryVO> selectContent(String content) {
		conn = DBCon.getConnection();
		sql = "select to_char(wdate,'yymmdd') wdate, content from diary where content like '%"
				+ content + "%' order by wdate";
		List<DiaryVO> result = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				DiaryVO vo = new DiaryVO();
				vo.setWdate(rs.getString("wdate"));
				vo.setCotents(rs.getString("content"));
				result.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}

	@Override
	public List<DiaryVO> selectAll() {
		return getDiaryList();
	}

}
