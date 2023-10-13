package day1_generic.student;

import java.util.ArrayList;
import java.util.List;

public class Batch <B extends Student>{
   private String name;
   private List<B>studentsList;


    public Batch(String name) {
        this.name = name;
        studentsList=new ArrayList<>(); //---> to make a new List everytime I create a new Batch
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<B> getStudentsList() {
        return studentsList;
    }

//    public void setStudentsList(List<Student> studentsList) {
//        this.studentsList = studentsList;
//    } -->don't want to reasign students, so I create my own method instead of setter

    public void addStudent(B student){
        studentsList.add(student);
    }


}
