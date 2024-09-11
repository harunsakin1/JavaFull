package com.haruns._02_JDBC_Forum.repository;


import com.haruns._02_JDBC_Forum.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository implements ICrud<User> {
	private final DatabaseHelper databaseHelper;
	private String sql;
	
	public UserRepository() {
		this.databaseHelper = new DatabaseHelper();
	}
	
	@Override
	public void save(User user) {
		databaseHelper.executeUpdate(SQLQueryBuilder.generateInsert(user, "tblusers"));
	}
	
	@Override
	public void delete(int silinecekUserId) {
		databaseHelper.executeUpdate(SQLQueryBuilder.generateDelete(User.class, "tblusers", silinecekUserId));
	}
	
	@Override
	public void update(User user) {
		databaseHelper.executeUpdate(SQLQueryBuilder.generateUpdate(user, "tblusers"));
	}
	
	@Override
	public List<User> findAll() {
		Optional<ResultSet> resultSet = databaseHelper.executeQuery("SELECT * FROM tblusers ORDER BY id DESC");
		if (resultSet.isPresent()) {
			ResultSet rs = resultSet.get();
			return SQLQueryBuilder.generateList(User.class, "tblusers", rs);
		}
		return new ArrayList<>();
	}
	
	@Override
	public Optional<User> findById(int bulunacakUserId) {
		Optional<ResultSet> resultSet =
				databaseHelper.executeQuery("SELECT * FROM tblusers WHERE id=" + bulunacakUserId);
		if (resultSet.isPresent()) {
			ResultSet rs = resultSet.get();
			return SQLQueryBuilder.findById(User.class, "tblusers", bulunacakUserId, rs);
		}
		return Optional.empty();
	}
	
	public boolean existByUsername(String username) {
		String sql="SELECT * FROM tblusers WHERE username='"+username+"'";
		Optional<ResultSet> resultSet = databaseHelper.executeQuery(sql);
		if (resultSet.isPresent()){
			try {
				return resultSet.get().next();
			}
			catch (SQLException e) {
				System.out.println("existByUserName metodu çalışırken hata oluştu..."+e.getMessage());
			}
		}
		return false;
	}
	public Optional<User> doLogin(String username,String password){
		String sql="SELECT * FROM tblusers WHERE username='"+username+"' AND password='"+password+"'";
		Optional<ResultSet> resultSet = databaseHelper.executeQuery(sql);
		if (resultSet.isPresent()){
			try {
				ResultSet rs =  resultSet.get();
				if (rs.next()){
					int rsId = rs.getInt("id");
					String rsAd = rs.getString("ad");
					String rsSoyad = rs.getString("soyad");
					String rsUsername = rs.getString("username");
					String rsPassword = rs.getString("password");
					return Optional.of(new User(rsId,rsAd,rsSoyad,rsUsername,rsPassword));
				}
			}
			catch (SQLException e) {
				System.out.println("existByUserName metodu çalışırken hata oluştu..."+e.getMessage());
			}
		}
		return Optional.empty();
	}
}