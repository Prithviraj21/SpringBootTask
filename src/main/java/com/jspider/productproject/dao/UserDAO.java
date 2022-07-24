package com.jspider.productproject.dao;

import org.springframework.data.repository.CrudRepository;
import com.jspider.productproject.dto.User;

public interface UserDAO extends CrudRepository<User, Integer> {

}
