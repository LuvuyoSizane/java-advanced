package Chapter10;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromExcel {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Luvuyo Sizane\\Documents\\JAVA ADVANCED\\java-advanced\\writeCitiestoExcel.xlsx";
        File myFile = null;


        try {
            myFile = new File(filePath);
            FileInputStream fileInput = new FileInputStream(myFile);
            XSSFWorkbook wookbook = new XSSFWorkbook(fileInput);
            XSSFSheet spreadsheet= wookbook.getSheetAt(0);
            for(Row myrow:spreadsheet){
                for (Cell mycell : myrow){
                    if(mycell.getCellTypeEnum()== CellType.STRING){
                        System.out.println(mycell.getStringCellValue()+"\t\t");
                    }else if(mycell.getCellTypeEnum()==CellType.NUMERIC){
                        System.out.println(mycell.getNumericCellValue()+"\t\t");
                    }else if(mycell.getCellTypeEnum()==CellType.FORMULA){
                        System.out.println(mycell.getCellFormula()+"\t\t");
                    }
                }
                System.out.println();
            }
            fileInput.close();
            wookbook.close();

            Desktop.getDesktop().open(myFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
