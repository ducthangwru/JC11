package org.jc4.ducthangwru.lesson1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDataAccess {

    private static String name;
    private static String studentId;
    private static String address;
    private static int age;

    public static void writeToTextFile(List<Student> listStudents) throws IOException {

        FileWriter fileWriter = new FileWriter("dssv.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String buffer;
        buffer = listStudents.toString();
        bufferedWriter.write(buffer);

        bufferedWriter.close();
    }

    public static List<Student> readToTextFile(String path) throws IOException {
        List<Student> listStudents = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

            String line;
            int i = 1;
            while ((line = bufferedReader.readLine()) != null) {
                switch (i) {
                    case 1:
                        studentId = line.substring(line.indexOf(":") + 1, line.length());
                        break;
                    case 2:
                        name = line.substring(line.indexOf(":") + 1, line.length());
                        break;
                    case 3:
                        age = Integer.parseInt(line.substring(line.indexOf(":") + 1, line.length()));
                        break;
                    case 4:
                        address = line.substring(line.indexOf(":") + 1, line.length());
                        i = 0;
                        listStudents.add(new Student(studentId, name, age, address));
                        break;
                }
                i++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return listStudents;
    }

    public static void writeToBinaryFile(List<Student> listStudents) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("dssv.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeBytes(listStudents.toString());

        objectOutputStream.close();
    }

    public static List<Student> readToBinaryFile(String path) {
        List<Student> listStudents = new ArrayList<>();

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));

            String line;
            int i = 1;
            while ((line = objectInputStream.readLine()) != null) {
                switch (i) {
                    case 1:
                        studentId = line.substring(line.indexOf(":") + 1, line.length());
                        break;
                    case 2:
                        name = line.substring(line.indexOf(":") + 1, line.length());
                        break;
                    case 3:
                        age = Integer.parseInt(line.substring(line.indexOf(":") + 1, line.length()));
                        break;
                    case 4:
                        address = line.substring(line.indexOf(":") + 1, line.length());
                        i = 0;
                        listStudents.add(new Student(studentId, name, age, address));
                        break;
                }
                i++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return listStudents;
    }
}
