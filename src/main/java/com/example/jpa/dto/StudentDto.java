package com.example.jpa.dto;

import com.example.jpa.entities.StudentEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentDto {
    private Long id;  //Entity.id
    private String name; //Entity.name
    private String email; //Entity.email

    //studentDto가 entity정보가 있을 때 새로운 dto가 만들어지게끔 할 수 있음
    // 정적 팩토리 메소드
    // 유지보수, 재사용성 측면에서 좋음
    public static StudentDto
    fromEntity(StudentEntity studentEntity){
        //내부에서 새로운 dto를 만들어줌
        StudentDto dto = new StudentDto();
        dto.setId(studentEntity.getId());
        dto.setName(studentEntity.getName());
        dto.setEmail(studentEntity.getEmail());
        return dto;
    }
}
