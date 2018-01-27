package com.mkdika.springzk85todo.repository;

import com.mkdika.springzk85todo.model.Task;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public interface TaskRepository extends CrudRepository<Task, Integer>{    
}
