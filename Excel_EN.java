package Interview;

import java.lang.*;
import java.util.*;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.IOException;
import java.io.FileInputStream;


public class Excel_EN {
   List expected_EN = new ArrayList();

   public void readXLSXFile() throws IOException {


      FileInputStream fi = new FileInputStream("D:/task/Translations_EcommerceConnect_EN_DE_HU_PL_RO_SKv4_CZv4_SI.xlsx");
      Workbook wb = new XSSFWorkbook(fi);
/**

      Cell d1_1 = wb.getSheetAt(0).getRow(67).getCell(CellReference.convertColStringToIndex("C")); // Enter payment card information
      String d1_1_d = d1_1.getStringCellValue();
      System.out.println(d1_1_d);
      expected_EN.add(d1_1_d);

      Cell d1_2 = wb.getSheetAt(0).getRow(175).getCell(CellReference.convertColStringToIndex("C")); // Details of payment
      String d1_2_d = d1_2.getStringCellValue();
      System.out.println(d1_2_d);
      expected_EN.add(d1_2_d);

      Cell d1_3 = wb.getSheetAt(0).getRow(214).getCell(CellReference.convertColStringToIndex("C")); // Order ID
      String d1_3_d = d1_3.getStringCellValue();
      System.out.println(d1_3_d);
      expected_EN.add(d1_3_d);

      Cell d1_4 = wb.getSheetAt(0).getRow(128).getCell(CellReference.convertColStringToIndex("C")); // Merchant
      String d1_4_d = d1_4.getStringCellValue();
      System.out.println(d1_4_d);
      expected_EN.add(d1_4_d);

      Cell d1_5 = wb.getSheetAt(0).getRow(216).getCell(CellReference.convertColStringToIndex("C")); // Description
      String d1_5_d = d1_5.getStringCellValue();
      System.out.println(d1_5_d);
      expected_EN.add(d1_5_d);

      Cell d1_6 = wb.getSheetAt(0).getRow(174).getCell(CellReference.convertColStringToIndex("C")); // Amount
      String d1_6_d = d1_6.getStringCellValue();
      System.out.println(d1_6_d);
      expected_EN.add(d1_6_d);
/**
      Cell d1_7 = wb.getSheetAt(0).getRow(188).getCell(CellReference.convertColStringToIndex("C")); // Payment method !not found in Excel!
      String d1_7_d = d1_7.getStringCellValue();
      System.out.println(d1_7_d);
      expected_EN.add(d1_7_d);

      Cell d1_8 = wb.getSheetAt(0).getRow(188).getCell(CellReference.convertColStringToIndex("C")); // Credit / Debit card  !not found in Excel!
      String d1_8_d = d1_8.getStringCellValue();
      System.out.println(d1_8_d);
      expected_EN.add(d1_8_d);
*/
       /**     Cell d1_9 = wb.getSheetAt(0).getRow(147).getCell(CellReference.convertColStringToIndex("C")); // Card type
      String d1_9_d = d1_9.getStringCellValue();
      System.out.println(d1_9_d);
      expected_EN.add(d1_9_d);

      Cell d1_10 = wb.getSheetAt(0).getRow(146).getCell(CellReference.convertColStringToIndex("C")); // Card Number
      String d1_10_d = d1_10.getStringCellValue();
      System.out.println(d1_10_d);
      expected_EN.add(d1_10_d);

      Cell d1_11 = wb.getSheetAt(0).getRow(168).getCell(CellReference.convertColStringToIndex("C")); // Expiry Date
      String d1_11_d = d1_11.getStringCellValue();
      System.out.println(d1_11_d);
      expected_EN.add(d1_11_d);
*/
      Cell d1_12 = wb.getSheetAt(0).getRow(182).getCell(CellReference.convertColStringToIndex("C")); // E-Mail
      String d1_12_d = d1_12.getStringCellValue();
      System.out.println(d1_12_d);
      expected_EN.add(d1_12_d);
/**
      Cell d1_13 = wb.getSheetAt(0).getRow(118).getCell(CellReference.convertColStringToIndex("C")); // Click on the image to learn more
      String d1_13_d = d1_13.getStringCellValue();
      System.out.println(d1_13_d);
      expected_EN.add(d1_13_d);

      Cell d1_14 = wb.getSheetAt(0).getRow(138).getCell(CellReference.convertColStringToIndex("C")); // Note : The next screen you see may be payment card verification through your card issuer
      String text_14 = d1_14.getStringCellValue();
      String str1 = text_14.replace("<b>", "");
      String str2 = str1.replace("</b>", "");
      String d1_14d = str2.replace("\\", "");
      System.out.println(d1_14d);
      expected_EN.add(d1_14d);
*/
      Cell d1_15 = wb.getSheetAt(0).getRow(317).getCell(CellReference.convertColStringToIndex("C")); // >> Proceed !NOT FOUND VALUE OF BUTTON FROM WEB PAGE!
      String d1_15_d = d1_15.getStringCellValue();
      System.out.println(d1_15_d);
      expected_EN.add(d1_15_d);
/**
      Cell d1_16 = wb.getSheetAt(0).getRow(153).getCell(CellReference.convertColStringToIndex("C")); // Please enter the CVV2/CVC2 code to perform the payment
      String d1_16_d = d1_16.getStringCellValue();
      System.out.println(d1_16_d);
      expected_EN.add(d1_16_d);

      Cell d1_17 = wb.getSheetAt(0).getRow(139).getCell(CellReference.convertColStringToIndex("C")); // The next action is the process of authorization. Please wait patiently and DO NOT click any buttons. This will avoid any disruption to your payment's processing.
      String d1_17_d = d1_17.getStringCellValue();
      System.out.println(d1_17_d);
      expected_EN.add(d1_17_d);
*/
   }


   public List getList() throws IOException {
      readXLSXFile();
      return expected_EN;
   }

}

