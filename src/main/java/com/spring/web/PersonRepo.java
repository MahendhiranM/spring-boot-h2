package com.spring.web;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<Person, Integer>  {

}
