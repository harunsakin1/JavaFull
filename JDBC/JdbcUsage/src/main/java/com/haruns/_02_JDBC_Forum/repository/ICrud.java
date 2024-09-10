package com.haruns._02_JDBC_Forum.repository;

import java.util.List;
import java.util.Optional;

public interface ICrud<T>{
	void save(T t);
	void delete(int id);
	void update(T t);
	List<T> findAll();
	Optional<T> findById(int id);
}