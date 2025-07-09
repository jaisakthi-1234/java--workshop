package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyusingBinary {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("picture.jpg");
     FileOutputStream out = new FileOutputStream("Mylogo.jpeg")) {
    byte[] chunk= new byte[2048];
    int bytesRead;
    while ((bytesRead = in.read(chunk)) != -1) {
        out.write(chunk, 0, bytesRead);
    }
}    catch (IOException e){
       System.out.println("Error in reading or writing the file");
}
    }

}
