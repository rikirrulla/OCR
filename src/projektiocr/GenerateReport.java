/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektiocr;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;

/**
 *
 * @author Dell
 */
public class GenerateReport {

    public void generate() throws JRException, IOException {

        // Compile jrxml file.
        JasperReport jasperReport = JasperCompileManager
                .compileReport("C:\\Users\\Dell\\Documents\\NetBeansProjects\\ProjektiOcr\\src\\projektiocr\\file\\Blank_Letter.jrxml");

        // Parameters for report
        Map<String, Object> parameters = new HashMap<String, Object>();

        // DataSource
        // This is simple example, no database.
        // then using empty datasource.
        JRDataSource dataSource = new JREmptyDataSource();
        Connection con = (Connection) new ConnectionDB().getConnection();

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,
                parameters, con);

        // Make sure the output directory exists.
        File outDir = new File("C:\\Users\\Dell\\Documents\\NetBeansProjects\\ProjektiOcr\\src\\projektiocr\\file\\");
        outDir.mkdirs();

        // Export to PDF.
        JasperExportManager.exportReportToPdfFile(jasperPrint,
                "C:\\Users\\Dell\\Documents\\NetBeansProjects\\ProjektiOcr\\src\\projektiocr\\file\\Raporti.pdf");

        System.out.println("Done!");
    }

    public void openFile() throws IOException {
        File file = new File("C:\\Users\\Dell\\Documents\\NetBeansProjects\\ProjektiOcr\\src\\projektiocr\\file\\Raporti.pdf");

        Desktop desktop = Desktop.getDesktop();
        if (file.exists()) {
            desktop.open(file);
        }

    }
}
