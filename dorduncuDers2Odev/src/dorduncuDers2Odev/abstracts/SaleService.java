package dorduncuDers2Odev.abstracts;

import dorduncuDers2Odev.entities.Campaign;
import dorduncuDers2Odev.entities.Game;
import dorduncuDers2Odev.entities.Gamer;

public interface SaleService {
	void sale(Game game, Gamer gamer, Campaign campaign);

}
