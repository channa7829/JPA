package com.jpa.project01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.project01.entity.Player;
import com.jpa.project01.repo.PlayerRepo;

@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ProjectApplication.class, args);
		
		PlayerRepo playerRepobean = context.getBean("playerRepo", PlayerRepo.class);
		
		//hi kotresh
		
		Player player = new Player();
		player.setPlayerId(101);
		player.setAge(28);
		player.setPlayerName("Prasanna");
		player.setPlayerLocattaion("Bangalore");
		
		playerRepobean.save(player);
		
		
	}

}
