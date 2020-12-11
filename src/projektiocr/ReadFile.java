package projektiocr;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) throws Exception {
        String thisLine = null;

        List studentet = new ArrayList();
        Exceli exceli = new Exceli();

        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Dell\\Documents\\NetBeansProjects\\ProjektiOcr\\src\\projektiocr\\file\\file.txt"));

            while ((thisLine = br.readLine()) != null) {


                    if(thisLine.length() > 9){
                        String id = thisLine.substring(0,9);
                        studentet.add(id);
                    }
                  

            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        studentet.remove(0);
        studentet.remove(0);


//        System.out.println("Studentet "+studentet);

        for (Object o: studentet) {
            String s = (String)o;
            exceli.writeFile(s);
        }
    }
}