package org.jc4.ducthangwru.lesson1;

public class Student {
    String name;
    int age;
    String studentId;
    String address;

    public Student(String studentId, String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Mã SV:" + getStudentId() + "\r\nSinh viên:" + getName() + "\r\nTuổi:" + getAge()  + "\r\nĐịa chỉ:" + getAddress() + "\r\n";
    }
}
