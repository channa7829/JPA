package com.jpa.project01.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.project01.entity.Player;

public interface PlayerRepo extends JpaRepository<Player, Integer> {

}
