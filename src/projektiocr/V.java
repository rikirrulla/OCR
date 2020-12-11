/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektiocrlista;

/**
 *
 * @author Dell
 */
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

public class V {
    public static void main(String[] args) throws IOException {
        File image = new File("C:\\Users\\Dell\\Desktop\\Bub\\src\\Lista.jpg");
        BufferedImage bufferedImage = ImageIO.read(image);

        bufferedImage = bufferedImage.getSubimage(720, 610, 1005, 1100);

        ImageIO.write(bufferedImage,"jpg", new File("C:\\Users\\Dell\\Desktop\\Bub\\src\\ListaSTest.jpg"));
    }

}

