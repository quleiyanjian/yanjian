package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Student;
import com.example.demo.mapper.StudentMapper;
import org.yaml.snakeyaml.events.Event;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class StudentController {
    @Resource
    private StudentMapper studentMapper;
    private Student student = null;
    private List<Student> students = null;

    @RequestMapping("/insert")
    public void insertStudent(@RequestParam("ID") String ID, @RequestParam(value = "name", required = false) String name, @RequestParam(value = "age", required = false) String age, @RequestParam(value = "FM", required = false) String FM) {
        student = new Student(ID, name, age, FM);
        studentMapper.InsertStudent(student);
    }

    @RequestMapping("/select")
    public List<Student> selectAll() {
        students = studentMapper.SelectAll();
        return students;
    }

    @RequestMapping("/select/byid")
    public List<Student> selectStudentByid(@RequestParam(value = "ID") String ID) {
        students = studentMapper.SelectByID(ID);
        return students;
    }

    @RequestMapping("/select/byname")
    public List<Student> selectStudentByname(@RequestParam(value = "name") String name) {
        students = studentMapper.SelectByname(name);
        return students;
    }

    @RequestMapping("/select/byage")
    public List<Student> selectStudentByage(@RequestParam(value = "age") String age) {
        students = studentMapper.SelectByage(age);
        return students;
    }

    @RequestMapping("/updateid")
    public void updateStudentID(@RequestParam(value = "ID") String ID, @RequestParam(value = "newID") String newID) {
        studentMapper.UpdateStudentID(ID, newID);
    }

    @RequestMapping("/updatename")
    public void updateStudentname(@RequestParam(value = "name") String name, @RequestParam(value = "newName") String newName) {
        studentMapper.UpdateStudentName(name, newName);
    }

    @RequestMapping("/updateage")
    public void updateStudentAge(@RequestParam(value = "age") String age, @RequestParam(value = "newAge") String newAge) {
        studentMapper.UpdateStudentAge(age, newAge);
    }

    @RequestMapping("/delete")
    public void deleteStudentAll() {
        studentMapper.DeleteStudentAll();
    }

    @RequestMapping("/delete/byid")
    public void deleteStudentByid(@RequestParam(value = "ID") String ID) {
        studentMapper.DeleteStudentByid(ID);
    }

    @RequestMapping("/delete/byname")
    public void deleteStudentByname(@RequestParam(value = "name") String name) {
        studentMapper.DeleteStudentByname(name);
    }

    @RequestMapping("/delete/byage")
    public void deleteStudentByage(@RequestParam(value = "age") String age) {
        studentMapper.DeleteStudentByage(age);
    }
}
