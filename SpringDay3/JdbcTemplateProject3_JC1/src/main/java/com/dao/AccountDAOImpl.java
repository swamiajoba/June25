package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

//import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.data.Account;
import com.exception.NoAccountException;

@Repository("accountDAO")
public class AccountDAOImpl implements AccountDAO {
	 @Autowired
	  private JdbcTemplate jdbcTemplate;

	 @Override
		public int saveAccount(Account ac) {
			// TODO Auto-generated method stub
			String sql="insert into Account values(?,?,?)";
			return jdbcTemplate.execute(sql, new PreparedStatementCallback<Integer>() 
					{

						@Override
						public Integer doInPreparedStatement(PreparedStatement ps)
								throws SQLException, DataAccessException {
							// TODO Auto-generated method stub
							ps.setInt(1, ac.getAid());
							ps.setString(2, ac.getCustomer());
							ps.setDouble(3, ac.getBalance());
							
							return ps.executeUpdate();
						}
						
					});
		}

		@Override
		public int updateAccount(Account ac) {
			String sql="update Account set holder=?,balance=? where aid=?";
			return jdbcTemplate.execute(sql, new PreparedStatementCallback<Integer>() 
			{

				@Override
				public Integer doInPreparedStatement(PreparedStatement ps)
						throws SQLException, DataAccessException {
					// TODO Auto-generated method stub
					ps.setString(1, ac.getCustomer());
					ps.setDouble(2, ac.getBalance());
					ps.setInt(3, ac.getAid());				
					return ps.executeUpdate();
				}
				
			});
		}

		@Override
		public int deleteAccount(Account ac) {
			// TODO Auto-generated method stub
			String sql="delete Account  where aid=?";
			return jdbcTemplate.execute(sql, new PreparedStatementCallback<Integer>() 
			{

				@Override
				public Integer doInPreparedStatement(PreparedStatement ps)
						throws SQLException, DataAccessException {
					// TODO Auto-generated method stub
					ps.setInt(1, ac.getAid());				
					return ps.executeUpdate();
				}
			});
		}
		
		@Override
		public Account getAccountById(int aid) {
			// TODO Auto-generated method stub
			return (Account) jdbcTemplate.queryForObject("select * from account where aid=?",new Object[] {aid} , 
					new RowMapper<Account>()
					{
						@Override
						public Account mapRow(ResultSet rs, int arg1) throws SQLException {
							// TODO Auto-generated method stub
							Account ob=new Account();
							ob.setAid(rs.getInt("aid"));
							ob.setCustomer(rs.getString("holder"));
							ob.setBalance(rs.getDouble("balance"));
							System.out.println("Rtrieved account "+ob);
							return ob;
						}
						
					});	
		}
		
		@Override
		public List<Account> getAccountList() {
			return jdbcTemplate.query("select * from account", 

					new RowMapper<Account>()
					{
						@Override
						public Account mapRow(ResultSet rs, int arg1) 
								throws SQLException {
								Account ob=new Account();
								ob.setAid(rs.getInt("aid"));
								ob.setCustomer(rs.getString("holder"));
								ob.setBalance(rs.getDouble("balance"));
							return ob;
						}	
					});
	}
}
