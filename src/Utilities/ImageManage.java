package Utilities;

import java.awt.Image;
import javax.swing.ImageIcon;

public class ImageManage {

    private static final int WIDTH_JLABEL_IMAGE = 50;
    private static final int HEIGTH_JLABEL_IMAGE = 50;

    public ImageIcon resizeImage(ImageIcon imageIcon) {
        Image image = imageIcon.getImage().getScaledInstance(WIDTH_JLABEL_IMAGE, HEIGTH_JLABEL_IMAGE, Image.SCALE_DEFAULT);
        imageIcon = new ImageIcon(image);
        return imageIcon;
    }

}
