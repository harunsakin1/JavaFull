package com.haruns._03_UserSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserRepository {
	List<User> users;
	
	public UserRepository() {
		this.users=new ArrayList<>();
		users.add(new User("Ali"));
		users.add(new User("Harun"));
		users.add(new User("Veli"));
		users.add(new User("Berk"));
		users.add(new User("Ahmet"));
		users.add(new User("Can"));
		users.add(new User("Mehmet"));
	}
	
	/**
	 * Bu metod dışarıdan gönderilen isimde bir kullanıcı bulursa o kullanıcıyı geri dönecek.
	 * Eğer bulamazsa null dönmeyecek. Kendi exceptionumuzu fırlatacağız.
	 * @param name
	 * @return
	 */
	public User getUserByName(String name) throws UserNotFoundException {
		Optional<User> optionalUser = users.stream()
		                            .filter(user -> user.getName().equals(name))
		                            .findFirst();
		//return optionalUser.orElseThrow(UserNotFoundException::new);
		return optionalUser.orElseThrow(()->new UserNotFoundException(ErrorType.REPOSITORY_USER_NOT_FOUND));
	}
	public List<User> getUserListByName(String name) throws UserNotFoundException {
		List<User> nameList = users.stream().filter(user -> user.getName().toLowerCase().contains(name)).toList();
		if (nameList.isEmpty()){
			throw new UserNotFoundException(ErrorType.REPOSITORY_USER_NOT_FOUND,"Aradiginiz kriterlerde bir kullanici" +
					" bulunamadi.");
		}
		return nameList;
	}
}