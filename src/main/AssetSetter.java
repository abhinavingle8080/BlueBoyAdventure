package main;

import object.OBJ_Boots;
import object.OBJ_Chest;
import object.OBJ_Door;
import object.OBJ_Key;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }

    public void setObject(){
        gp.obj[0] = new OBJ_Key();
        gp.obj[0].name = "key";
        gp.obj[0].worldX = gp.tilesize * 23;
        gp.obj[0].worldY = gp.tilesize * 7;

        gp.obj[1] = new OBJ_Key();
        gp.obj[1].name = "key";
        gp.obj[1].worldX = gp.tilesize * 23;
        gp.obj[1].worldY = gp.tilesize * 40;

        gp.obj[2] = new OBJ_Key();
        gp.obj[2].name = "key";
        gp.obj[2].worldX = gp.tilesize * 38;
        gp.obj[2].worldY = gp.tilesize * 8;

        gp.obj[3] = new OBJ_Door();
        gp.obj[3].name = "door";
        gp.obj[3].worldX = gp.tilesize * 10;
        gp.obj[3].worldY = gp.tilesize * 11;

        gp.obj[4] = new OBJ_Door();
        gp.obj[4].name = "door";
        gp.obj[4].worldX = gp.tilesize * 8;
        gp.obj[4].worldY = gp.tilesize * 28;

        gp.obj[5] = new OBJ_Door();
        gp.obj[5].name = "door";
        gp.obj[5].worldX = gp.tilesize * 12;
        gp.obj[5].worldY = gp.tilesize * 22;

        gp.obj[6] = new OBJ_Chest();
        gp.obj[6].name = "chest";
        gp.obj[6].worldX = gp.tilesize * 10;
        gp.obj[6].worldY = gp.tilesize * 7;

        gp.obj[7] = new OBJ_Boots ();
        gp.obj[7].name = "boots";
        gp.obj[7].worldX = gp.tilesize * 37;
        gp.obj[7].worldY = gp.tilesize * 42;
    }
}
