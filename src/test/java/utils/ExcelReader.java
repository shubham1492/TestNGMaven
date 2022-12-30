package utils;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelReader {


    public static String [][] getExcelData(String fileName,String sheetName){

        String [][] arryExcelData = null;

        try {
            FileInputStream fs = new FileInputStream(fileName);

            HSSFWorkbook workbook = new HSSFWorkbook(fs);

            HSSFSheet sheet = workbook.getSheet(sheetName);

            HSSFRow row = sheet.getRow(0);

            int noOfRows = sheet.getPhysicalNumberOfRows();

            int noOfCol = row.getLastCellNum();

            arryExcelData = new String[noOfRows-1][noOfCol];
            Cell cell;

            for(int i=1;i<noOfRows;i++){
                for(int j=0;j<noOfCol;j++){
                    row = sheet.getRow(i);
                    cell = row.getCell(j);
                    arryExcelData[i-1][j] =  cell.getStringCellValue();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return arryExcelData;
    }



}
