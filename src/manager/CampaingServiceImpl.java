package manager;

import Entity.Campaing;
import Entity.Game;

public class CampaingServiceImpl implements CampaingService{

    @Override
    public Campaing discount(Campaing campaing) {
        Campaing campaing1 = new Campaing();
        campaing1.setDiscount(campaing.isDiscount());

        System.out.println("%" + campaing.isDiscount() + " indirime sahip ");

        return campaing1;
    }
}
