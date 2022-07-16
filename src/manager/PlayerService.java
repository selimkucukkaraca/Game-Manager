package manager;

import Entity.Player;

public interface PlayerService {
    Player add(Player player);
    void delete(int id);
    Player update(Player player);


}

