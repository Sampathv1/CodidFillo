package Project1;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ExcelConstructor {
	
	public static  Fillo fillo;
	public static  Connection connection;
	 public static String UserData;

	public static void main(String[] args) {
	
		try {
	
			getExcelData("UserData","Sampath","MobileNumber");
			
			}
		 catch(Exception e)
		{
			 System.out.println(e.getMessage());
		   }
			
	}
	public static void getExcelData(String Sheetname, String FirstName, String Columnname)
	{
      
		try {
			
			fillo=new Fillo();
			
			connection=fillo.getConnection("C:\\Users\\SampathKumar.Sampath\\eclipse-workspace\\Cucumber-Tutorials\\TestData\\Test.ods");
			
			String strQuery="Select " + Columnname + " from "+ Sheetname + "where name=" + FirstName;
			
			Recordset recordset=connection.executeQuery(strQuery);
			 
			while(recordset.next()){
			
				System.out.println(recordset.getField("MobileNum"));
			}
			
			recordset.close();
			}
			catch (Exception e)
			{
			   System.out.println(e.getMessage());
			}
			
			 connection.close();
	        }
			
     }


