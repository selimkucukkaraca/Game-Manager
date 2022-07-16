import Entity.Player;
import manager.PlayerServiceImpl;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        PlayerServiceImpl playerService = new PlayerServiceImpl();

        Player player = new Player();
        player.setId(1);
        player.setTckn("12345678911");
        player.setCreateDate(new Date());
        player.setFirstName("selim");
        player.setLastName("karaca");
        player.setBirthDay("02/06/2000");

        playerService.add(player);
    }
}
