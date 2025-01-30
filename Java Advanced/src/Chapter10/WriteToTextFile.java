package Chapter10;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class WriteToTextFile {
    public static void main(String[] args) {
        String filePath= "C:\\Users\\Luvuyo Sizane\\Documents\\JAVA ADVANCED\\java-advanced\\WriteToText.txt";
        //Create a file class object
        File myFile= new File(filePath);
        //create the file
        try {
            PrintStream pen = null;
            if(myFile.exists()){
                pen=new PrintStream(myFile);
                pen.append("HAAAUUUU");
            }else{
                pen=new PrintStream(myFile);
                myFile.createNewFile();
                pen.println("Hello World");
                pen.println("How are You????!!!!");
                pen.println("Today is the last day!!!");
                pen.println("Awu Yebo");
                pen.println("Hello World");
                pen.println("How are You????!!!!");
                pen.println("Today is the last day!!!");
                pen.println("Awu Yebo");
            }

            pen.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
