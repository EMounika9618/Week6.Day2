package week6.Day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	
	public static String[][] readData(String fileName) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook("./ExcelPractice/FB data.xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		XSSFRow row = ws.getRow(1); // get to first row
		XSSFCell cell = row.getCell(0); // get to first cell
		String data = cell.getStringCellValue(); //get the value of first cell
		System.out.println(data);

		//get no. of rows (exclude header)
		int rowCount = ws.getLastRowNum();
		System.out.println("Total Rows: " +rowCount);

		//get no.of rows (including header)
		int physicalNumberOfRows = ws.getPhysicalNumberOfRows();
		System.out.println("Total Rows incl. header: " +physicalNumberOfRows);

		//get the no. of columns
		short colCount = ws.getRow(0).getLastCellNum();
		System.out.println("Total Col: " +colCount);

		//get the data of first column
		for(int i=1;i<rowCount;i++) {
			String firstcolData = ws.getRow(i).getCell(0).getStringCellValue();
			System.out.println(firstcolData);
		}

		String[][] data3 = new String[rowCount][colCount];
		for(int i=1;i<=rowCount;i++) {
			for (int j=0;j<colCount;j++) {
				String CellValue = ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(CellValue);
				data3[i-1][j]  = CellValue;
			}	
		}
		wb.close();
		return data3;
	}
	}
