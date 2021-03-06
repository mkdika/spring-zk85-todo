package com.mkdika.springzk85todo.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task implements Serializable {

    @Id    
    @Column(name = "id")    
    @GeneratedValue(strategy=GenerationType.IDENTITY)    
    Integer id;    
    String content;
    Boolean complete;
    Boolean editable;            
}
