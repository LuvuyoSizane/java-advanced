package Chapter10;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteToExcel {
    public static void main(String[] args) {
        String filePath ="C:\\Users\\Luvuyo Sizane\\Documents\\JAVA ADVANCED\\java-advanced\\writeCitiestoExcel.xlsx";
        try {
            OutputStream fileOutput = new FileOutputStream(filePath);
            //Create workbook
            XSSFWorkbook workbook = new XSSFWorkbook();
            //Create SpreadSheet
            XSSFSheet spreadsheet = workbook.createSheet("Cities");
            spreadsheet.setDefaultColumnWidth(15);
            //Create Row Header
//          XSSFRow rr = workbook.getSheetAt(0).createRow(0); //this is used when you dont have a spread sheet created

            XSSFRow rowheader = spreadsheet.createRow(0);
            //Create Cell
            rowheader.createCell(0).setCellValue("City Name");
            rowheader.createCell(1).setCellValue("Population");

            //Row 1
            XSSFRow row1 = spreadsheet.createRow(1);
            //Create Cell
            row1.createCell(0).setCellValue("Johannesburg");
            row1.createCell(1).setCellValue(40000000);


            //Row 2
            XSSFRow row2 = spreadsheet.createRow(2);
            //Create Cell
            row2.createCell(0).setCellValue("Pretoria");
            row2.createCell(1).setCellValue(2000000);


            //Row 3
            XSSFRow row3 = spreadsheet.createRow(3);
            //Create Cell
            row3.createCell(0).setCellValue("Rustenburg");
            row3.createCell(1).setCellValue(600000);

            workbook.write(fileOutput); //write to Excel spreadsheet
            fileOutput.close(); //close the output stream
            workbook.close(); //close the workbook
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
