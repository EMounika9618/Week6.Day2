package week6.Day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		// setup path for excel
		XSSFWorkbook ex = new XSSFWorkbook("./ExcelPractice/Student.xlsx");

		//go to particular sheet
		XSSFSheet sheet = ex.getSheet("Mounika");

		//get no of row excluding header 
		int rows = sheet.getLastRowNum();
		System.out.println(rows);

		//get no of row including header 
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(physicalNumberOfRows);
		
		
	
		//get into the respective row
		//XSSFRow rows1 = ex.getRow(1);
		
		//get no of cells
		int cellCount = sheet.getRow(0).getLastCellNum();
		System.out.println(cellCount);
		
		//to get data from cell
		
		for (int i = 1; i<= rows; i++)
		{
			String data = sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(data);
		}
		//get all rows and colmns
		for(int i=1; i<= rows; i++)
		{
			for (int j=0; j< cellCount;j++)
		{
				String fetchData = sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.println(fetchData);
		}
						//close excel
			ex.close();
			//return;
		}

	}

	public static String[][] readData(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}
}