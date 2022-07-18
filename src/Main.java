import Entity.Campaing;
import Entity.Game;
import Entity.Player;
import manager.CampaingServiceImpl;
import manager.GameService;
import manager.GameServiceImpl;
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



        GameServiceImpl gameService = new GameServiceImpl();
        Game game = new Game();
        game.setId(2);
        game.setName("valorant");
        game.setPrice(23.50);
        game.setMemory(27.567);

        gameService.buy(game);


        CampaingServiceImpl campaingService = new CampaingServiceImpl();
        Campaing campaing = new Campaing();
        campaing.setDiscount(20.00);

        campaingService.discount(campaing);


    }
}
