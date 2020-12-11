 package projektiocr;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceli {

    static ArrayList<Object[]> data = new ArrayList<Object[]>();

    public Exceli() {
        data.add(new String[]{"ID", "Nenshkrimi"});
    }

    public static void writeFile(String id) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Lista");
        data.add(new String[]{id, "I nenshkurar"});

        int rownum = 0;
        for (Object[] countries : data) {
            Row row = sheet.createRow(rownum++);

            int cellnum = 0;
            for (Object obj : countries) {
                Cell cell = row.createCell(cellnum++);
                if (obj instanceof String) {
                    cell.setCellValue((String) obj);
                } else if (obj instanceof Double) {
                    cell.setCellValue((Double) obj);
                } else if (obj instanceof Integer) {
                    cell.setCellValue((Integer) obj);
                }
            }
        }

        try {
            String path = "C:/Users/Dell/Documents/NetBeansProjects/ProjektiOcr/src/projektiocr/file/Raporti";
            Calendar calendar = Calendar.getInstance();
            Date date = new Date();  
            SimpleDateFormat formatter = new SimpleDateFormat("-dd-MM-yyyy-HH;mm;ss");
            String strDate= formatter.format(date); 
            FileOutputStream out = new FileOutputStream(new File(path+strDate+".xls"));
            workbook.write(out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            workbook.close();
        }
    }

}
