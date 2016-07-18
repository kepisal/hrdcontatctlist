package Utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {

	public static String excel_filename=null;
	public static String excel_path=null;
	public readExcel(String filename, String filepath){
		
	}
	
	
	public static void main(String[] args) {
		String excelpath ="D:\\OneDrive\\workspacesjava\\Utilities\\contact_db.xlsx";
		XSSFRow row=null;
		XSSFCell cell=null;
		int numberofsheet=0;
		int numberofrow=0;
		int numberofcell=0;
		String data="";
		try {
			FileInputStream fis = new FileInputStream(new File(excelpath));
			XSSFWorkbook wb = new XSSFWorkbook(fis);			
			numberofsheet = wb.getNumberOfSheets();
			numberofsheet = wb.getNumberOfSheets();
			for(int s=0; s<numberofsheet; s++){
				System.err.println("--------Sheet ["+s+"]-------");
				for(int r=0; r<wb.getSheetAt(s).getLastRowNum()-1; r++){
					System.err.println("--------Row ["+r+"]-------");
					for(int c=0; c<wb.getSheetAt(s).getRow(r).getLastCellNum(); c++){						
						if(r==2){
							data+="\n";
						}else{
							
								data+=wb.getSheetAt(s).getRow(r).getCell(c).getStringCellValue()+" ";
							
						}
					}
					data=data+"\n";
					
				}
				
			}
			System.out.println(data);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
