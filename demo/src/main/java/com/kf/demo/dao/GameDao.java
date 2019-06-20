package com.kf.demo.dao;

import com.kf.demo.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

    @Repository
    public interface GameDao extends JpaRepository<Game, Integer> {

        List <Game> findByNomLike(String recherche);

    }
