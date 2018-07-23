package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.*;
import com.example.demo.entity.Student;

@Mapper
public interface StudentMapper {
    @Insert("insert into student(ID,name,age,FM) values(#{ID},#{name},#{age},#{FM})")
    void InsertStudent(Student student);

    @Delete("delete from student")
    void DeleteStudentAll();

    @Delete(value = "delete from student where ID = #{ID}")
    void DeleteStudentByid(@Param("ID") String ID);

    @Delete("delete from student where name = #{name}")
    void DeleteStudentByname(@Param("name") String name);

    @Delete("delete from student where age = #{age}")
    void DeleteStudentByage(@Param("age") String age);

    @Update("update student set ID = #{newID} where ID = #{ID}")
    void UpdateStudentID(@Param("ID") String ID, @Param("newID") String newID);

    @Update("update student set name = #{newName} where name = #{name}")
    void UpdateStudentName(@Param("name") String name, @Param("newName") String newName);

    @Update("update student set age = #{newAge} where age = #{age}")
    void UpdateStudentAge(@Param("age") String age, @Param("newAge") String newAge);

    @Select("select * from student")
    List<Student> SelectAll();

    @Select("select * from student where ID = #{ID}")
    List<Student> SelectByID(@Param("ID") String ID);

    @Select("select * from student where name = #{name}")
    List<Student> SelectByname(@Param("name") String name);

    @Select("select * from student where age = #{age}")
    List<Student> SelectByage(@Param("age") String age);
}
