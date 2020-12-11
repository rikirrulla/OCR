package projektiocr;

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

public class OcrRead {

    public static ArrayList studentet;
    public static ArrayList studentetPaNenshkruar;
    private ArrayList teDhenat;
    public static int countNenshkruar;
    public static int countTePanenshkruar;
    public static String profa;
    public static String lenda;
    public static String orari;
    public static String klasa;
    public static String grupi;
    private String pathi = null;

    public void path(String p) throws IOException {
        pathi = p;
//        String path = "C:\\Users\\Dell\\Documents\\NetBeansProjects\\ProjektiOcr\\src\\projektiocr\\file\\ListaS.jpg";
        Ocr.setUp();
        Ocr ocr = new Ocr();
        ocr.startEngine("eng", Ocr.SPEED_FASTEST);
        String s = ocr.recognize(new File[]{new File(p)},
                Ocr.RECOGNIZE_TYPE_TEXT, Ocr.OUTPUT_FORMAT_PLAINTEXT);
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Dopi\\Documents\\ProjektiOcr\\src\\projektiocr\\file\\file.txt"));
        writer.write(s);
        writer.close();
//        System.out.println("Result: " + s);
        ocr.stopEngine();
    }

    public void shfaq() throws IOException {
        String thisLine = null;

        teDhenat = new ArrayList();

        try {

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Dopi\\Documents\\ProjektiOcr\\src\\projektiocr\\file\\file.txt"));

            while ((thisLine = br.readLine()) != null) {
                teDhenat.add(thisLine);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println(teDhenat.size());

        orari = (String) teDhenat.get(1);
        profa = (String) teDhenat.get(2);
        lenda = (String) teDhenat.get(3);
        lenda = (String) teDhenat.get(3);
        klasa = (String) teDhenat.get(4);
        grupi = (String) teDhenat.get(5);
        getTeDhenat();

//        System.out.println("Studentet "+studentet);
        File image = new File(pathi);
        BufferedImage bufferedImage = ImageIO.read(image);

        bufferedImage = bufferedImage.getSubimage(770, 640, 615, 1150);

        ImageIO.write(bufferedImage, "jpg", new File("C:\\Users\\Dopi\\Documents\\ProjektiOcr\\src\\projektiocr\\file\\ListaST!.jpg"));
        path2();
    }

    public void path2() throws IOException {
//        String path = "C:\\Users\\Dell\\Documents\\NetBeansProjects\\ProjektiOcr\\src\\projektiocr\\file\\ListaS.jpg";
        Ocr.setUp();
        Ocr ocr = new Ocr();
        ocr.startEngine("eng", Ocr.SPEED_SLOW);
        String s = ocr.recognize(new File[]{new File("C:\\Users\\Dopi\\Documents\\ProjektiOcr\\src\\projektiocr\\file\\ListaST!.jpg")},
                Ocr.RECOGNIZE_TYPE_ALL, Ocr.OUTPUT_FORMAT_PLAINTEXT);
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Dopi\\Documents\\ProjektiOcr\\src\\projektiocr\\file\\fileNenshkrimi.txt"));
        writer.write(s);
        writer.close();
//        System.out.println("Result2: " + s);
        ocr.stopEngine();
        checkNenshkrimi();
    }

    public void checkNenshkrimi() throws IOException {

        studentet = new ArrayList();
        studentetPaNenshkruar = new ArrayList();
        String thisLine = null;
        try {

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Dopi\\Documents\\ProjektiOcr\\src\\projektiocr\\file\\fileNenshkrimi.txt"));

            while ((thisLine = br.readLine()) != null) {
                if (thisLine.length() > 9) {
                    String id = thisLine.substring(0, 9);
                    studentet.add(id);
                    countNenshkruar = studentet.size();
                } 
                    else {
                        String id = thisLine.substring(0,9);
                        studentetPaNenshkruar.add(id);
                    countTePanenshkruar++;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        countGjithsej = studentet.size();

    }

    public List ListOcr() throws IOException {
        checkNenshkrimi();
        System.out.println(studentet);
        return studentet;
    }

    public void saveExcel() throws IOException {
        Exceli exceli = new Exceli();
        checkNenshkrimi();
        for (Object o : studentet) {
            String s = (String) o;
            exceli.writeFile(s);
//            System.out.println("U ruaj me sukses");

        }
    }

    public void clear() {
        studentet.clear();
//        teDhenat.clear();
        countNenshkruar = 0;
        countTePanenshkruar = 0;
        profa = "";
        lenda = "";
        orari = "";

    }

    private void getTeDhenat() {
        orari = orari.substring(14);
        profa = profa.substring(8);
        lenda = lenda.substring(8);
        klasa = klasa.substring(8);
        grupi = "####";
    }

}
