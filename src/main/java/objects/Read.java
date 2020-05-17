package objects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

public class Read {

	private static HSSFWorkbook excelWBook;// Excel WorkBook
	private static HSSFSheet excelWSheet;// Excel Sheet
	private static HSSFCell cell;// Excel cell
	public static int rowNumb;// Row Number
	public static int colNumb;// Column Number
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static Map<String, String> hm = readFile();
	
	
	public static Map<String, String>  readFile() {
		String dataFile = "src/main/resources/data.txt";
		Map<String, String> hm = new HashMap<String, String>();
		Scanner sc;
		try {
			sc = new Scanner(new File(dataFile));
			String line;
			while (sc.hasNext()) {
				line = sc.nextLine();
				String[] keyvalue = line.split("%");
				hm.put(keyvalue[0], keyvalue[1]);
			}
			sc.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		return hm;
	}
	
	//read key value
		public static String readKey(String key){
			return hm.get(key);
		}

	// This method gets excel file, row and column number for user login
	public static String getUserLoginData(int rowNum, int colNum) throws Exception {
		try {
			fi = new FileInputStream("src/test/resources/User_data.xls");
			excelWBook = new HSSFWorkbook(fi);
			excelWSheet = excelWBook.getSheetAt(0);
			cell = excelWSheet.getRow(rowNum).getCell(colNum);

			DataFormatter formatter = new DataFormatter();
			String cellData = formatter.formatCellValue(cell);
			return cellData;
		} catch (Exception e) {
			throw (e);
		}
	}

	// This method gets excel file, row and column number for adding products
	public static String getProductData(int rowNum, int colNum) throws Exception {
		try {
			fi = new FileInputStream("src/test/resources/User_data.xls");
			excelWBook = new HSSFWorkbook(fi);
			excelWSheet = excelWBook.getSheetAt(1);
			cell = excelWSheet.getRow(rowNum).getCell(colNum);

			DataFormatter formatter = new DataFormatter();
			String cellData = formatter.formatCellValue(cell);
			return cellData;
		} catch (Exception e) {
			throw (e);
		}
	}
}
