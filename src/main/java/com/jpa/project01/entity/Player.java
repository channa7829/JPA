package com.jpa.project01.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Player_Info")
public class Player {
	
	@Id
	private int playerId;
	
	private String playerName;
	
	private String playerLocattaion;
	
	private int age;

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerLocattaion() {
		return playerLocattaion;
	}

	public void setPlayerLocattaion(String playerLocattaion) {
		this.playerLocattaion = playerLocattaion;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerLocattaion=" + playerLocattaion
				+ ", age=" + age + "]";
	}

	public Player(int playerId, String playerName, String playerLocattaion, int age) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerLocattaion = playerLocattaion;
		this.age = age;
	}

	public Player() {
		
	}
	
	

}
