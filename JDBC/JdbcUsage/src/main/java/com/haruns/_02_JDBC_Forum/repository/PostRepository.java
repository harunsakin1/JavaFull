package com.haruns._02_JDBC_Forum.repository;

import com.haruns._02_JDBC_Forum.entity.Post;
import com.haruns._02_JDBC_Forum.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PostRepository implements ICrud<Post> {
	private final DatabaseHelper databaseHelper;
	private String sql;
	
	public PostRepository() {
		databaseHelper=new DatabaseHelper();
	}
	
	@Override
	public void save(Post post) {
		databaseHelper.executeUpdate(SQLQueryBuilder.generateInsert(post, "tblpost"));
	}
	
	@Override
	public void delete(int silinecekPostId) {
		databaseHelper.executeUpdate(SQLQueryBuilder.generateDelete(Post.class, "tblpost", silinecekPostId));
	}
	
	@Override
	public void update(Post post) {
		databaseHelper.executeUpdate(SQLQueryBuilder.generateUpdate(post, "tblpost"));
	}
	
	@Override
	public List<Post> findAll() {
		sql="SELECT * FROM tblpost ORDER BY id DESC";
		Optional<ResultSet> resultSet = databaseHelper.executeQuery(sql);
		List<Post> postList=new ArrayList<>();
		try {
			if (resultSet.isPresent()){
				ResultSet rs = resultSet.get();
				while (rs.next()){
					int id = rs.getInt("id");
					int user_id = rs.getInt("user_id");
					String baslik = rs.getString("baslik");
					String icerik = rs.getString("icerik");
					String paylasimtarihi = rs.getString("paylasimtarihi");
					Post post=new Post(id, user_id, baslik, icerik, LocalDate.parse(paylasimtarihi));
					postList.add(post);
				}
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return postList;
	}
	
	@Override
	public Optional<Post> findById(int bulunacakPostId) {
		sql="SELECT * FROM tblpost WHERE id="+bulunacakPostId;
		Optional<ResultSet> resultSet = databaseHelper.executeQuery(sql);
		try {
			if (resultSet.isPresent()){
				ResultSet rs = resultSet.get();
				if (rs.next()){
					int id = rs.getInt("id");
					int user_id = rs.getInt("user_id");
					String baslik = rs.getString("baslik");
					String icerik = rs.getString("icerik");
					String paylasimtarihi = rs.getString("paylasimtarihi");
					return Optional.of(new Post(id, user_id, baslik, icerik, LocalDate.parse(paylasimtarihi)));
				}
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return Optional.empty();
	}
	
	public List<Post> findPostsByUserId(User user) {
		sql="SELECT * FROM tblpost WHERE user_id= "+ user.getId()+" ORDER BY id DESC";
		Optional<ResultSet> resultSet = databaseHelper.executeQuery(sql);
		List<Post>kendiPostlari=new ArrayList<>();
		try {
			if (resultSet.isPresent()){
				ResultSet rs = resultSet.get();
				if (rs.next()){
					int id = rs.getInt("id");
					int user_id = rs.getInt("user_id");
					String baslik = rs.getString("baslik");
					String icerik = rs.getString("icerik");
					String paylasimtarihi = rs.getString("paylasimtarihi");
					Post post=new Post(id, user_id, baslik, icerik, LocalDate.parse(paylasimtarihi));
					kendiPostlari.add(post);
				}
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return kendiPostlari;
		
	}
}