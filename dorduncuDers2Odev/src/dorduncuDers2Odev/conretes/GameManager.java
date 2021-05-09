package dorduncuDers2Odev.conretes;

import dorduncuDers2Odev.abstracts.GameService;
import dorduncuDers2Odev.entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + "Oyun eklendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + "Oyun silindi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + "Oyun güncellendi.");
		
	}


}
