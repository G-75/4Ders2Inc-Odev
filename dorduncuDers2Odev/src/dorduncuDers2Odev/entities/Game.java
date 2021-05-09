package dorduncuDers2Odev.entities;

import dorduncuDers2Odev.abstracts.Entity;

public class Game implements Entity{
	
	private String gameName;
	private String gameType;
	private int gamePrice;
	
	public Game() {
		
	}

	public Game(String gameName, String gameType, int gamePrice) {
		super();
		this.gameName = gameName;
		this.gameType = gameType;
		this.gamePrice = gamePrice;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public int getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}
	
	
	

}
