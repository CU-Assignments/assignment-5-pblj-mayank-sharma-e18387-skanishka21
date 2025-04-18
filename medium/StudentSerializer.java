package medium;

import java.io.*;

public class StudentSerializer {
    public static void main(String[] args) {
        Student student = new Student(101, "John Doe", 3.8);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            out.writeObject(student);
            System.out.println("Student details saved successfully!");
        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }

        System.out.println("\nReading from file...");
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student savedStudent = (Student) in.readObject();
            savedStudent.display();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
        }
    }
}
