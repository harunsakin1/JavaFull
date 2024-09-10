package com.haruns._02_JDBC_Forum.repository;


import com.haruns._02_JDBC_Forum.entity.User;

import java.sql.ResultSet;
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
		List<User> users = findAll();
		if (users.isEmpty()) return true;
		for (User user : users) {
			if (user.getUsername().equals(username)) {
				System.out.println("Bu kullanıcı adı sistemde kayıtlı. Lütfen başka bir kullanıcı adı giriniz");
				return false;
			}
		}
		return true;
	}
	public Optional<User> doLogin(String username,String password){
		List<User> users = findAll();
		for (User user:users){
			if (user.getUsername().equals(username)&&user.getPassword().equals(password)){
				return Optional.of(user);
			}
		}
		return Optional.empty();
	}
}