package learn.example.skillboxjavaintensive.coffemashinedatascreen;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws AWTException {

        System.out.println("Кофе-машина");

        //TODO: количество денег считывается из консоли
        Scanner scan = new Scanner (System.in);
        System.out.print("Введите количество денег: ");
        int moneyAmount = scan.nextInt();

        int[] drinkPrices = {150, 80, 20, 60};
        String[] drinkNames = {"капучино", "эспрессо", "воду", "молоко"};

        boolean canBuyAnything = false;

        for (int i = 0; i < drinkNames.length; i++){
            if (moneyAmount >= drinkPrices[i]){
                System.out.println("Вы можете купить " + drinkNames[i]);
                canBuyAnything = true;
            }
        }

        if (!canBuyAnything){
            System.out.println("Недостаточно средств :( Изучайте Java и зарабатывайте много! :)");
        }

        //TODO: публикация текущей даты в формате 20200608_205858
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Date now = new Date();
        System.out.println(formatter.format(now));

        //TODO: скриншот экрана и публикация его размеров
        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        System.out.println(image.getWidth() + "x" + image.getHeight());
    }
}
