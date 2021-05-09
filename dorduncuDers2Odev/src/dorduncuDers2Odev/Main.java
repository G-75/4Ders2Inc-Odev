package dorduncuDers2Odev;

import java.time.LocalDate;

import dorduncuDers2Odev.conretes.CampaignManager;
import dorduncuDers2Odev.conretes.GameManager;
import dorduncuDers2Odev.conretes.GamerManager;
import dorduncuDers2Odev.conretes.SaleManager;
import dorduncuDers2Odev.entities.Campaign;
import dorduncuDers2Odev.entities.Game;
import dorduncuDers2Odev.entities.Gamer;

public class Main {

	public static void main(String[] args) {
		GameManager gameManager = new GameManager();
		Game game =new Game("Asasing Creed", "Aksiyon", 1500);
		gameManager.add(game);
		
		
		GamerManager gamerManager = new GamerManager();
		Gamer gamer = new Gamer("Ersoy", "KÜÇÜK", LocalDate.of(2004, 1, 3),"22222222222");
		gamerManager.add(gamer);
		
		CampaignManager campaignManager =new CampaignManager();
		Campaign campaign = new Campaign("Seri Sonu", 5);
		campaignManager.add(campaign);
				
		SaleManager saleManager = new SaleManager();
		saleManager.sale(game, gamer, campaign);
	}

}


