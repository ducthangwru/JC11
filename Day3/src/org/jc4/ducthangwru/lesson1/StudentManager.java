package org.jc4.ducthangwru.lesson1;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students = new ArrayList<>();


    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public boolean addStudent(Student student)
    {
        students.add(student);
        return true;
    }

    public boolean deleteStudent(String studentId)
    {
        for(int i = 0; i < students.size(); i++)
        {
            if(studentId.equals(students.get(i).getStudentId()))
            {
                students.remove(i);
                return true;
            }
        }

        return false;
    }

    public boolean editStudent(String studentId, String newName, int newAge, String newAddress)
    {
        for(int i = 0; i < students.size(); i++)
        {
            if(studentId.equals(students.get(i).getStudentId()))
            {
                students.get(i).setName(newName);
                students.get(i).setAge(newAge);
                students.get(i).setAddress(newAddress);
                return true;
            }
        }

        return false;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return students + "";
    }
}
