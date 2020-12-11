package projektiocr.gjykata;

import projektiocr.*;
import com.asprise.ocr.Ocr;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import javax.imageio.ImageIO;

public class OcrReadGjykata {

    public static String teDhenatLenda = new String();
    public static ArrayList teDhenatAdresa;
    private ArrayList teDhenat;
    public static String gjykata;
    public static String emri_mbiemri;
    public static String adresa;
    public static String nrTelit;
    public static String emriGjykatsi;
    private String pathi = null;

    public void path(String p) throws IOException {
        pathi = p;
//        String path = "C:\\Users\\Dell\\Documents\\NetBeansProjects\\ProjektiOcr\\src\\projektiocr\\file\\ListaS.jpg";
        Ocr.setUp();
        Ocr ocr = new Ocr();
        ocr.startEngine("eng", Ocr.SPEED_FASTEST);
        String s = ocr.recognize(new File[]{new File(p)},
                Ocr.RECOGNIZE_TYPE_TEXT, Ocr.OUTPUT_FORMAT_PLAINTEXT);
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Dell\\Documents\\NetBeansProjects\\ProjektiOcr\\src\\projektiocr\\file\\fileGjykatsi.txt"));
        writer.write(s);
        writer.close();
//        System.out.println("Result: " + s);
        ocr.stopEngine();
    }

    public void shfaq() throws IOException {
        String thisLine = null;

        teDhenat = new ArrayList();

        try {

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Dell\\Documents\\NetBeansProjects\\ProjektiOcr\\src\\projektiocr\\file\\fileGjykatsi.txt"));

            while ((thisLine = br.readLine()) != null) {
                
                teDhenat.add(thisLine);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println(teDhenat.size());
        gjykata = (String) teDhenat.get(1);

        emri_mbiemri = (String) teDhenat.get(2);

        adresa = (String) teDhenat.get(3);

        nrTelit = (String) teDhenat.get(4);

        getTeDhenat();

        File image = new File(pathi);
        BufferedImage bufferedImage = ImageIO.read(image);

        bufferedImage = bufferedImage.getSubimage(170, 700, 1515, 700);

        ImageIO.write(bufferedImage, "jpg", new File("C:\\Users\\Dell\\Documents\\NetBeansProjects\\ProjektiOcr\\src\\projektiocr\\file\\ListaCropGjykatsiLenda.jpg"));
        path2();

        File image1 = new File(pathi);
        BufferedImage bufferedImage1 = ImageIO.read(image1);

        bufferedImage1 = bufferedImage1.getSubimage(10, 1500, 1515, 500);

        ImageIO.write(bufferedImage1, "jpg", new File("C:\\Users\\Dell\\Documents\\NetBeansProjects\\ProjektiOcr\\src\\projektiocr\\file\\ListaCropGjykatsiAdresa.jpg"));
        path3();
    }

    public void path2() throws IOException {
//        String path = "C:\\Users\\Dell\\Documents\\NetBeansProjects\\ProjektiOcr\\src\\projektiocr\\file\\ListaS.jpg";
        Ocr.setUp();
        Ocr ocr = new Ocr();
        ocr.startEngine("eng", Ocr.SPEED_SLOW);
        String s = ocr.recognize(new File[]{new File("C:\\Users\\Dell\\Documents\\NetBeansProjects\\ProjektiOcr\\src\\projektiocr\\file\\ListaCropGjykatsiLenda.jpg")},
                Ocr.RECOGNIZE_TYPE_ALL, Ocr.OUTPUT_FORMAT_PLAINTEXT);
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Dell\\Documents\\NetBeansProjects\\ProjektiOcr\\src\\projektiocr\\file\\Lenda.txt"));
        writer.write(s);
        writer.close();
//        System.out.println("Result2: " + s);
        ocr.stopEngine();
        lenda();
    }

    public void path3() throws IOException {
//        String path = "C:\\Users\\Dell\\Documents\\NetBeansProjects\\ProjektiOcr\\src\\projektiocr\\file\\ListaS.jpg";
        Ocr.setUp();
        Ocr ocr = new Ocr();
        ocr.startEngine("eng", Ocr.SPEED_SLOW);
        String s = ocr.recognize(new File[]{new File("C:\\Users\\Dell\\Documents\\NetBeansProjects\\ProjektiOcr\\src\\projektiocr\\file\\ListaCropGjykatsiAdresa.jpg")},
                Ocr.RECOGNIZE_TYPE_ALL, Ocr.OUTPUT_FORMAT_PLAINTEXT);
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Dell\\Documents\\NetBeansProjects\\ProjektiOcr\\src\\projektiocr\\file\\Adresa.txt"));
        writer.write(s);
        writer.close();
//        System.out.println("Result2: " + s);
        ocr.stopEngine();
        adresa();
    }

    public void lenda() throws IOException {

        String thisLine = null;
        try {

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Dell\\Documents\\NetBeansProjects\\ProjektiOcr\\src\\projektiocr\\file\\Lenda.txt"));

            while ((thisLine = br.readLine()) != null) {
                System.out.println(thisLine);
                teDhenatLenda = teDhenatLenda + thisLine+"\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println(teDhenatLenda);
//        countGjithsej = teDhenatLenda.size();
    }

    public void adresa() throws IOException {
        teDhenatAdresa = new ArrayList();

        String thisLine = null;
        try {

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Dell\\Documents\\NetBeansProjects\\ProjektiOcr\\src\\projektiocr\\file\\Adresa.txt"));

            while ((thisLine = br.readLine()) != null) {
                teDhenatAdresa.add(thisLine);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        emriGjykatsi = (String) teDhenatAdresa.get(1);
    }

    public void saveExcel() throws IOException {
        Exceli exceli = new Exceli();
        lenda();

//        exceli.writeFile(teDhenatLenda);
//            System.out.println("U ruaj me sukses");
    }

    public void clear() {
//        teDhenatLenda.clear();
//        teDhenat.clear();
        gjykata = "";
        emri_mbiemri = "";
        adresa = "";

    }

    private void getTeDhenat() {
        adresa = adresa.substring(9);
//        gjykata = gjykata.substring(8);
        emri_mbiemri = emri_mbiemri.substring(19);
        nrTelit = nrTelit.substring(17);
//        emriGjykatsi = emriGjykatsi.substring(8);
    }

}
