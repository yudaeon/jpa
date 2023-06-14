package com.example.jpa.entities;
/* CREATE TABLE student (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT,
    age INTEGER
    phone TEXT
    email TEXT
* */

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name = "students")
public class StudentEntity {// student_entity
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //column 어노테이션에 인자를 전달해서 테이블 constraint 추가 가능
//    @Column(name = "username", nullable = false) //테이블의 이름을 지정하듯이 컬럼의 이름도 지정할수 있다.
    private String name;
    private Integer age;
  //  @Column(unique = true)
    private String phone;
    private String email;
}
