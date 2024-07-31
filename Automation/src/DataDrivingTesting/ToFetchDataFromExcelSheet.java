package DataDrivingTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ToFetchDataFromExcelSheet {
	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("");
		FileInputStream fis=new FileInputStream(f);
		workbook workbook=workBookFactory.create(fis);
		
	}

}
