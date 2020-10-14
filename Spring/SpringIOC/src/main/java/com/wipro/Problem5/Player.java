package com.wipro.Problem5;

public class Player {

	private String playerId;
	private String playerName;
	private Country playerCountry;
	
	public Player() {
		
	}
	
	public Player(String playerId, String playerName, Country playerCountry) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerCountry = playerCountry;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Country getPlayerCountry() {
		return playerCountry;
	}

	public void setPlayerCountry(Country playerCountry) {
		this.playerCountry = playerCountry;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerCountry=" + playerCountry + "]";
	}
	
	
}
