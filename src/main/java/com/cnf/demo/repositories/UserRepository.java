package com.cnf.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.cnf.demo.domain.User;

public interface UserRepository extends CrudRepository<User, Long>
{

}