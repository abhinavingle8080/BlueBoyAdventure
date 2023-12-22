package object;

import javax.imageio.ImageIO;
import java.util.Objects;

public class OBJ_Boots extends SuperObject {
    public OBJ_Boots() {
        name = "boots";
        try {
            image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/objects/boots.png")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        collision = true;
    }
}
