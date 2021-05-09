package dorduncuDers2Odev.conretes;

import dorduncuDers2Odev.abstracts.SaleService;
import dorduncuDers2Odev.entities.Campaign;
import dorduncuDers2Odev.entities.Game;
import dorduncuDers2Odev.entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void sale(Game game, Gamer gamer, Campaign campaign) {
		double discountPrice = game.getGamePrice() - (game.getGamePrice() * campaign.getCampaignPerCent()/100);

		
		System.out.println(game.getGameName() + " oyununu " + gamer.getGamerFirstName() +" "+gamer.getGamerLastName() +
				" adlý kiþisi oyunu " + discountPrice + "TL'ye satýn aldý.");
		
	}

}