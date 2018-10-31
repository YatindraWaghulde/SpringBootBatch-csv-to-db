package com.yatindra.demo.repository;

/**
 * @author Yatindra Waghulde
 */

import org.springframework.data.repository.CrudRepository;

import com.yatindra.demo.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
