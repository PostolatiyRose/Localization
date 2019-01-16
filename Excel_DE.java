package Interview;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Excel_DE {
    List expected_DE = new ArrayList();
    @Test
    public void readXLSXFile() throws IOException {
        FileInputStream fi = new FileInputStream("D:/task/Translations_EcommerceConnect_EN_DE_HU_PL_RO_SKv4_CZv4_SI.xlsx");
        Workbook wb = new XSSFWorkbook(fi);

//        Считка ячеек с файла Excel
        Cell d1_1 = wb.getSheetAt(0).getRow(67).getCell(CellReference.convertColStringToIndex("D")); // Tragen Sie, bitte, die Daten der Karte ein.
        String d1_1_d = d1_1.getStringCellValue();
        System.out.println(d1_1_d);
        expected_DE.add(d1_1_d);

        Cell d1_2 = wb.getSheetAt(0).getRow(175).getCell(CellReference.convertColStringToIndex("D")); // Zahlungdaten
        String d1_2_d = d1_2.getStringCellValue();
        System.out.println(d1_2_d);
        expected_DE.add(d1_2_d);

        Cell d1_3 = wb.getSheetAt(0).getRow(214).getCell(CellReference.convertColStringToIndex("D")); // Auftrag-ID
        String d1_3_d = d1_3.getStringCellValue();
        System.out.println(d1_3_d);
        expected_DE.add(d1_3_d);

        Cell d1_4 = wb.getSheetAt(0).getRow(128).getCell(CellReference.convertColStringToIndex("D")); //  Händler
        String text_4 = d1_4.getStringCellValue();
        String d1_4_d = text_4.replace("\\u00E4", "ä");
        System.out.println(d1_4_d);
        expected_DE.add(d1_4_d);

        Cell d1_5 = wb.getSheetAt(0).getRow(216).getCell(CellReference.convertColStringToIndex("D")); // Beschreibung
        String d1_5_d = d1_5.getStringCellValue();
        System.out.println(d1_5_d);
        expected_DE.add(d1_5_d);

        Cell d1_6 = wb.getSheetAt(0).getRow(174).getCell(CellReference.convertColStringToIndex("D")); // Gesamtbetrag
        String d1_6_d = d1_6.getStringCellValue();
        System.out.println(d1_6_d);
        expected_DE.add(d1_6_d);
/**
        Cell d1_7 = wb.getSheetAt(0).getRow(188).getCell(CellReference.convertColStringToIndex("D")); // Bezahlverfahren !not found in Excel!
        String d1_7_d = d1_7.getStringCellValue();
        System.out.println(d1_7_d);
        expected_DE.add(d1_7_d);

        Cell d1_8 = wb.getSheetAt(0).getRow(188).getCell(CellReference.convertColStringToIndex("D")); // Kredit- / Debitkarte !not found in Excel!
        String d1_8_d = d1_8.getStringCellValue();
        System.out.println(d1_8_d);
        expected_DE.add(d1_8_d);
*/
        Cell d1_9 = wb.getSheetAt(0).getRow(147).getCell(CellReference.convertColStringToIndex("D")); // Kartentyp
        String d1_9_d = d1_9.getStringCellValue();
        System.out.println(d1_9_d);
        expected_DE.add(d1_9_d);

        Cell d1_10 = wb.getSheetAt(0).getRow(146).getCell(CellReference.convertColStringToIndex("D")); // Kartennummer
        String d1_10_d = d1_10.getStringCellValue();
        System.out.println(d1_10_d);
        expected_DE.add(d1_10_d);

        Cell d1_11 = wb.getSheetAt(0).getRow(168).getCell(CellReference.convertColStringToIndex("D")); // Gültig bis
        String d1_11_d = d1_11.getStringCellValue();
        String d1_11d = d1_11_d.replace("\\u00FC", "ü");
        System.out.println(d1_11d);
        expected_DE.add(d1_11_d);

        Cell d1_12 = wb.getSheetAt(0).getRow(182).getCell(CellReference.convertColStringToIndex("D")); // E-Mail
        String d1_12_d = d1_12.getStringCellValue();
        System.out.println(d1_12_d);
        expected_DE.add(d1_12_d);

        Cell d1_13 = wb.getSheetAt(0).getRow(118).getCell(CellReference.convertColStringToIndex("D")); // Um weitere Informationen zu bekommen klicken Sie auf Bild
        String d1_13_d = d1_13.getStringCellValue();
        System.out.println(d1_13_d);
        expected_DE.add(d1_13_d);

        Cell d1_14 = wb.getSheetAt(0).getRow(138).getCell(CellReference.convertColStringToIndex("D")); // Anmerkung : Es kann sein, dass Ihre Bank auf der nächsten Seite die Daten Ihrer Karte prüfen wird.
        String text_14 = d1_14.getStringCellValue();
        String str1 = text_14.replace("<b>", "");//убираем теги и код букв
        String str2 = str1.replace("</b>", "");
        String str3 = str2.replace("\\", "");
        String str4 =str3.replace("u00DF", "ss");
        String str5 =str4.replace("u00E4", "ä");
        String d1_14d =str5.replace("u00FC", "ü");
        System.out.println(d1_14d);
        expected_DE.add(d1_14d);

        Cell d1_15 = wb.getSheetAt(0).getRow(317).getCell(CellReference.convertColStringToIndex("D")); // >> Weiter
        String d1_15_d = d1_15.getStringCellValue();
        System.out.println(d1_15_d);
        expected_DE.add(d1_15_d);

        Cell d1_16 = wb.getSheetAt(0).getRow(153).getCell(CellReference.convertColStringToIndex("D")); // Tragen Sie den CVV2/CVC2 Code ein, um die Bezahlung abzuschließen
        String d1_16_d = d1_16.getStringCellValue();
        System.out.println(d1_16_d);
        expected_DE.add(d1_16_d);

        Cell d1_17 = wb.getSheetAt(0).getRow(139).getCell(CellReference.convertColStringToIndex("D")); // Die Authorisierung der Zahlungskarte folgt. Warten Sie bis zum Ende der Authorisierung OHNE eine Taste zu DRÜCKEN. Es ermöglicht den Zahlungsprozess korrekt abzuwickeln.
        String text_17 = d1_17.getStringCellValue();
        String str11 = text_17.replace("\\", "");
        String str22 = str11.replace("u00DC", "Ü");
        String d1_17_d = str22.replace("u00F6", "ö");
        System.out.println(d1_17_d);
        expected_DE.add(d1_17_d);

    }


    public List getList() throws IOException {
        readXLSXFile();
        return expected_DE;
    }

}
