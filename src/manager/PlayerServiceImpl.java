package manager;

import Entity.Log;
import Entity.LogType;
import Entity.Player;

import java.util.Date;

public class PlayerServiceImpl implements  PlayerService{

    private Logger logger = new Logger();

    @Override
    public Player add(Player player) {
        Player newPlayer = new Player();
        newPlayer.setId(player.getId());
        newPlayer.setFirstName(player.getFirstName());
        newPlayer.setLastName(player.getLastName());
        if (player.getTckn().length() == 11){
            newPlayer.setTckn(player.getTckn());
            System.out.println(newPlayer.getId() + " id'li player kaydedildi");

        }
        else {
            logger.add(new Log(LogType.ERROR, " tckn hanesi hatalı"));
        }
        newPlayer.setBirthDay(player.getBirthDay());
        newPlayer.setCreateDate(player.getCreateDate());
        return newPlayer;
    }

    @Override
    public void delete(int id) {
        System.out.println( id + "id li kullanıcı silindi");
    }

    @Override
    public Player update(Player player) {
        Player updatePlayer = new Player();
        updatePlayer.setId(player.getId());
        updatePlayer.setFirstName(player.getFirstName());
        updatePlayer.setLastName(player.getLastName());
        if (player.getTckn().length() == 11){
            updatePlayer.setTckn(player.getTckn());
        }
        else {
            logger.add(new Log(LogType.ERROR,"HATALI TCKN"));
        }
        updatePlayer.setBirthDay(player.getBirthDay());

        System.out.println(updatePlayer.getId() + "id'li kullanıcı update edildi.");
        return updatePlayer;
    }
}
