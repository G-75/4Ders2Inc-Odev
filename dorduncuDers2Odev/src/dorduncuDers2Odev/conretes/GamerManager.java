package dorduncuDers2Odev.conretes;

import dorduncuDers2Odev.abstracts.GamerService;
import dorduncuDers2Odev.entities.Gamer;

public class GamerManager implements GamerService{

	@Override
	public void add(Gamer gamer) {
		System.out.println("Oyuncu eklendi. " + gamer.getGamerFirstName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi. " + gamer.getGamerFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellendi. " + gamer.getGamerFirstName());
		
	}

}
