package org.jc4.ducthangwru.lesson1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDataAccess {

    public static void writeToTextFile(List<Student> listStudents) throws IOException {

        FileWriter fileWriter = new FileWriter("dssv.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String buffer;
        buffer = listStudents.toString();
        bufferedWriter.write(buffer);

        bufferedWriter.close();
    }

    public static List<Student> readToTextFile(String path) throws IOException {
        String name = null;
        String studentId = null;
        String address;
        int age = 0;

        List<Student> listStudents = new ArrayList<>();

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
        return listStudents;
    }

    public static void writeToBinaryFile(List<Student> listStudents) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("dssv.bin"));

        objectOutputStream.writeObject(listStudents);
        objectOutputStream.close();

    }

    public static List<Student> readToBinaryFile(String path) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)));
        List<Student> listStudents = (List<Student>)objectInputStream.readObject();
        objectInputStream.close();
        return listStudents;
    }
}
