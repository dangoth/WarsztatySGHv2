package com.skni.warsztatysghv2.registration;
import org.springframework.stereotype.Component;
import java.io.*;

@Component
public class FileSaver {

    public void saveToFile(Student student) throws IOException {
        try {
            File file = new File("src/main/resources/Student.txt");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(student.toString());
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
