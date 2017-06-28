package com.jlcindia.jdbc;
import com.jlcindia.util.JDBCUtil;
import java.sql.*;
import com.jlcindia.to.UserTo;


public class UserService {
	public int verifyUser (String un,String pw){
		int x=0;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
				con=JDBCUtil.getMySqlConnection();
				String sql="select  * from jlcuser where username=? and password=? ";
				ps=con.prepareStatement(sql);
				ps.setString(1, un);
				ps.setString(2, pw);
				
				rs=ps.executeQuery();
				if(rs.next())
					x=1;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			JDBCUtil.cleanup(rs, ps, con);
		}
		return x;
	}
	
	public int registerUser(UserTo uto){
		int x=0;
		Connection con=null;
		PreparedStatement ps=null;
		try{
			con=JDBCUtil.getMySqlConnection();
			String sql="insert into jlcuser values(?,?,?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setInt(1,uto.getUserid());
			ps.setString(2, uto.getFname());
			ps.setString(3, uto.getEmail());
			ps.setLong(4, uto.getPhone());
			ps.setString(5, uto.getUsername());
			ps.setString(6, uto.getPassword());
			x=ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			JDBCUtil.cleanup(ps, con);
		}
		return x;
	}
	
	public String getPasswordByEmail(String em){
		String pw=null;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			String sql="select password from jlcuser where email=?" ;
			ps=con.prepareStatement(sql);
			ps.setString(1, em);
			rs=ps.executeQuery();
			if(rs.next()){
				pw=rs.getString(1);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			JDBCUtil.cleanup(rs, ps, con);
		}
		return pw;
	}
	
	public int getNextUserId(){
		int x=0;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			con=JDBCUtil.getMySqlConnection();
			String sql="select max(userid) from jlcuser";
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			if(rs.next()){
				x=rs.getInt(1);
				x=x+1;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			JDBCUtil.cleanup(rs, ps, con);
		}
		return x;
	}
	

}
