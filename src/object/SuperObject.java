package object;

import main.GamePanel;

import java.awt.*;
import java.awt.image.BufferedImage;

public class SuperObject {

    public BufferedImage image;
    public String name;
    public boolean collision = false;
    public int worldX;
    public int worldY;
    public Rectangle solidArea = new Rectangle(0, 0, 48, 48);
    public int solidAreaDefaultX = 0;
    public int SolidAreaDefaultY = 0;

    public void draw(Graphics2D g2, GamePanel gp){

        int screenX = worldX - gp.player1.worldX + gp.player1.screenX;
        int screenY = worldY - gp.player1.worldY + gp.player1.screenY;

        if(
                worldX + gp.tilesize > gp.player1.worldX - gp.player1.screenX &&
                worldX - gp.tilesize < gp.player1.worldX + gp.player1.screenX &&
                worldY + gp.tilesize > gp.player1.worldY - gp.player1.screenY &&
                worldY - gp.tilesize < gp.player1.worldY + gp.player1.screenY
        ) {
            g2.drawImage(image, screenX, screenY, gp.tilesize, gp.tilesize, null);
        }
    }
}
