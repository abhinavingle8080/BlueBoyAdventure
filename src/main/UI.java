package main;

import object.OBJ_Key;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;

public class UI {

    GamePanel gp;
    Font arial_40, arial_80B;
    BufferedImage keyImage;

    public boolean messageOn = false;
    public int messageCounter = 0;
    public String message = "";
    public boolean gameFinished = false;

    double gameTime;
    DecimalFormat df = new DecimalFormat("0.00");

    public UI(GamePanel gp) {
        this.gp = gp;
        arial_40 = new Font("Arial", Font.PLAIN, 40);
        arial_80B = new Font("Arial", Font.BOLD, 80);
        OBJ_Key key = new OBJ_Key();
        keyImage = key.image;
    }

    public void showMessage(String text) {
        messageOn = true;
        message = text;
    }

    public void draw(Graphics2D g2) {

        if (gameFinished) {

            g2.setFont(arial_40);
            g2.setColor(Color.white);

            String text;
            int textLength;
            int x;
            int y;

            text = "You found the treasure!";
            textLength = (int) g2.getFontMetrics().getStringBounds(text, g2).getWidth();
            x = (gp.screenWidth / 2) - (textLength / 2);
            y = (gp.screenHeight / 2) - (gp.tilesize * 3);

            g2.drawString(text, x, y);

            text = "You finished in " + df.format(gameTime) + " seconds!";
            textLength = (int) g2.getFontMetrics().getStringBounds(text, g2).getWidth();
            x = (gp.screenWidth / 2) - (textLength / 2);
            y = (gp.screenHeight / 2) - (gp.tilesize);
            g2.drawString(text, x, y);

            g2.setFont(arial_80B);
            g2.setColor(Color.yellow);
            text = "Congratulations!";
            textLength = (int) g2.getFontMetrics().getStringBounds(text, g2).getWidth();
            x = (gp.screenWidth / 2) - (textLength / 2);
            y = (gp.screenHeight / 2) + (gp.tilesize * 2);
            g2.drawString(text, x, y);

            gp.gameThread = null;

        } else {
            g2.setFont(arial_40);
            g2.setColor(Color.white);
            g2.drawImage(keyImage, gp.tilesize / 2, gp.tilesize / 2, gp.tilesize, gp.tilesize, null);
            g2.drawString("Key = " + gp.player1.hasKeyCount, 74, 65);

            // Time
            gameTime += (double) 1 / 60;
            g2.drawString("Time: " + df.format(gameTime), gp.tilesize * 12, 65);

            // message
            if (messageOn) {
                g2.setFont(g2.getFont().deriveFont(30F));
                g2.drawString(message, (gp.screenWidth / 2) - (g2.getFontMetrics().stringWidth(message) / 2), gp.tilesize / 2);

                messageCounter++;

                if (messageCounter > 120) {
                    messageOn = false;
                    messageCounter = 0;
                }
            }
        }
    }
}
