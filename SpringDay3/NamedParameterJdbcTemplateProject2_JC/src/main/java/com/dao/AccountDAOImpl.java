package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

//import javax.sql.DataSource;


import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import org.springframework.stereotype.Repository;

import com.data.Account;


@Repository("accountDAO")
public class AccountDAOImpl implements AccountDAO {
	 @Autowired
	  private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public int saveAccount(Account ac) {
		// TODO Auto-generated method stub
		String sql="insert into Account values(:aid,:holder,:balance)";
		
		 MapSqlParameterSource params = new MapSqlParameterSource()
		            .addValue("aid", ac.getAid())
		            .addValue("holder", ac.getCustomer())
		            .addValue("balance", ac.getBalance());
		
			int i=jdbcTemplate.update(sql,params);
		return i;
	}

	@Override
	public int updateAccount(Account ac) {
		String sql="update Account set holder=:holder ,balance=:balance where aid=:aid";
		
		 MapSqlParameterSource params = new MapSqlParameterSource()
		            .addValue("aid", ac.getAid())
		            .addValue("holder", ac.getCustomer())
		            .addValue("balance", ac.getBalance());
		 
		int i=jdbcTemplate.update(sql,params);
		return i;
	}

	@Override
	public int deleteAccount(Account ac) {
		// TODO Auto-generated method stub
		String sql="delete Account  where aid=:aid";
		 MapSqlParameterSource params = new MapSqlParameterSource()
		            .addValue("aid", ac.getAid());
		int i=jdbcTemplate.update(sql,params);
		return i;
	}
	
	@Override
	public Account getAccountById(int aid) {
		String query ="select * from account where aid= :aid";
		return jdbcTemplate.queryForObject(query,
				Collections.singletonMap("aid", aid),
				 (rs, rowNum) ->{
						System.out.println("Rtrieving account");
						Account ob=new Account();
					
						ob.setAid(rs.getInt("aid"));
						ob.setCustomer(rs.getString("holder"));
						ob.setBalance(rs.getDouble("balance"));
					
						System.out.println("Rtrieved account "+ob);
						return ob;
					}
				);	
	}
	
	@Override
	public List<Account> getAccountList() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from account", 
				new ResultSetExtractor<List<Account>>()
				{

					@Override
					public List<Account> extractData(ResultSet rs) 
					throws SQLException, DataAccessException {
						// TODO Auto-generated method stub
						List<Account> alist=new ArrayList<>();
						while(rs.next())
						{
							Account ob=new Account();
							ob.setAid(rs.getInt("aid"));
							ob.setCustomer(rs.getString("holder"));
							ob.setBalance(rs.getDouble("balance"));
							alist.add(ob);
						}
						return alist;
					}	
				});
}
}
