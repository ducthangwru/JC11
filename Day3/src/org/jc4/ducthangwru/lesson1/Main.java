package org.jc4.ducthangwru.lesson1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static String name;
    static int age;
    static String address;
    static String studentId;
    static Scanner input = new Scanner(System.in);
    static StudentManager studentManager = new StudentManager();

    public static void main(String[] args) {
        while (true) {

            System.out.println("---------MENU-----------");
            System.out.println("1. Thêm mới sinh viên.");
            System.out.println("2. Xóa sinh viên tìm kiếm theo mã SV.");
            System.out.println("3. Sửa thông tin sinh viên tìm kiếm theo mã SV");
            System.out.println("4. Ghi danh sách SV vào File Text.");
            System.out.println("5. Đọc danh sách sinh viên từ File Text.");
            System.out.println("6. Ghi danh sách sinh viên vào File Binary.");
            System.out.println("7. Đọc danh sách sinh viên từ File Binary.");
            System.out.println("8. Hiển thị danh sách sinh viên.");
            System.out.println("9. Thoát.");
            System.out.println("Mời bạn chọn: ");

            int choose;
            try {
                choose = input.nextInt();

                switch (choose) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        deleteStudent();
                        break;
                    case 3:
                        editStudent();
                        break;
                    case 4:
                        writeToTextFile();
                        break;
                    case 5:
                        readToTextFile();
                        break;
                    case 6:
                        writeToBinaryFile();
                        break;
                    case 7:
                        readToBinaryFile();
                        break;
                    case 8:
                        listStudents();
                        break;
                    case 9:
                        break;
                    default:
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Nhập sai! Nhập lại!");
                input.nextLine();
            }
        }
    }

    public static void addStudent() {
        input.nextLine();
        System.out.println("Nhập mã sinh viên: ");
        studentId = input.nextLine();

        System.out.println("Nhập họ và tên: ");
        name = input.nextLine();

        System.out.println("Nhập địa chỉ: ");
        address = input.nextLine();

        System.out.println("Nhập tuổi: ");
        while (true) {
            try {
                age = input.nextInt();
                if (studentManager.addStudent(new Student(studentId, name, age, address))) {
                    System.out.println("Thêm thành công!");
                } else {
                    System.out.println("Thêm thất bại!");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Nhập tuổi không đúng định dạng! Nhập lại!");
                input.nextLine();
            }
        }
    }

    public static void deleteStudent() {
        input.nextLine();
        System.out.println("Nhập mã sinh viên cần xóa: ");
        studentId = input.nextLine();

        if(studentManager.deleteStudent(studentId)) {
            System.out.println("Xóa thành công!");
        }
        else {
            System.out.println("Xóa không thành công!");
        }
    }

    public static void editStudent() {
        input.nextLine();
        System.out.println("Nhập mã sinh viên cần sửa: ");
        studentId = input.nextLine();

        System.out.println("Nhập tên mới: ");
        name = input.nextLine();

        System.out.println("Nhập địa chỉ mới: ");
        address = input.nextLine();

        System.out.println("Nhập tuổi mới: ");
        while(true) {
            try {
                age = input.nextInt();
                if(studentManager.editStudent(studentId, name, age, address)) {
                    System.out.println("Sửa thông tin thành công!");
                }
                else {
                    System.out.println("Sửa thất bại!");
                }

                break;
            } catch (InputMismatchException e) {
                System.out.println("Nhập tuổi sai định dạng! Nhập lại!");
                input.nextLine();
            }
        }
    }

    public static void listStudents() {
        System.out.println(studentManager.toString());
    }

    public static void writeToTextFile() {
        try {
            StudentDataAccess.writeToTextFile(studentManager.getStudents());
            System.out.println("Ghi File thành công!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readToTextFile() {
        try {
            System.out.println(StudentDataAccess.readToTextFile("dssv.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToBinaryFile() {
        try {
            StudentDataAccess.writeToBinaryFile(studentManager.getStudents());
            System.out.println("Ghi File thành công!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readToBinaryFile() {
        System.out.println(StudentDataAccess.readToBinaryFile("dssv.bin"));
    }
}
