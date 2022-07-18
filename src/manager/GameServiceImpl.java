package manager;

import Entity.Game;
import Entity.Player;

public class GameServiceImpl implements  GameService{

    @Override
    public Game buy(Game game) {
        Game game1 = new Game();
        game1.setId(game.getId());
        game1.setName(game.getName());
        game1.setPrice(game.getPrice());
        game1.setMemory(game.getMemory());

        System.out.println(game.getId() + " id'li oyuncu , " + game.getName() + " adli oyunu satin aldi.");

        return game1;
    }
}
