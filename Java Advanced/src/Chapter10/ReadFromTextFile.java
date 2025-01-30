package Chapter10;

import java.io.*;

public class ReadFromTextFile {
    public static void main(String[] args) {
        String path = "src/Chapter10/resources/read_example.txt";
        File myFile = null ;
        String data=null;
        myFile = new File(path);
        try {
            FileReader reader = new FileReader(myFile);
            BufferedReader read = new BufferedReader(reader);//reads text data

            while((data =read.readLine())!= null){

                System.out.println(data);

            }

            read.close();
        } catch (FileNotFoundException e) {
            System.err.println("File Not Found");
        } catch (IOException e) {
            System.err.println("Cannot read from File");
        }

       readNumber();
    }

    public static void readNumber(){
        String filePath ="src/Chapter10/resources/number.txt";
        String nuimbersLine=null;
        File myFile = null;

        try {
            myFile= new File(filePath);
            FileReader reader = new FileReader(myFile);
            BufferedReader read = new BufferedReader(reader);
            System.out.println("IS EVEN");
            nuimbersLine =read.readLine();
            String[] arNumbers = nuimbersLine.split(",");
            for(String num :arNumbers){
                if(Integer.parseInt(num)%2 == 0)
                System.out.println(num);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
