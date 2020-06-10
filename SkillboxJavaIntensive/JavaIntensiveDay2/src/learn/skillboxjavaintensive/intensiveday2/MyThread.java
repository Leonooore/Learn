package learn.skillboxjavaintensive.intensiveday2;

import com.dropbox.core.v2.DbxClientV2;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread {

    public DbxClientV2 client;
    private static final SimpleDateFormat FORMATTER = new SimpleDateFormat("yyyymmdd_hhmmss");

    @Override
    public void run() {
        for (int i = 0; i < 5 ; i++){
            try {
                BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
                Date now = new Date();
                String fileName = FORMATTER.format(now) + ".png";
                ByteArrayOutputStream os = new ByteArrayOutputStream();
                ImageIO.write(image, "png", os);
                client.files().uploadBuilder("/" + fileName).uploadAndFinish(new ByteArrayInputStream(os.toByteArray()));
                System.out.println("Screenshot " + fileName + " was uploaded " + FORMATTER.format(now));
                sleep(5000);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}

