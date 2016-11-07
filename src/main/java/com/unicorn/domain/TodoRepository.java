package com.unicorn.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by abderrazakbouadma on 09/10/16.
 */
@Repository
public interface TodoRepository extends CrudRepository<Todo,Long> {
}
