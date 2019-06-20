package com.kf.demo.web.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.kf.demo.dao.GameDao;
import com.kf.demo.model.Game;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ThymeleafGameController {

    @Autowired
    private GameDao gameDao;

    @Value("${error.message}")
    private String errorMessage;

    @RequestMapping(value = { "/", "/index" })
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/afficherjeux")
    public ModelAndView afficherjeux() {

        List<Game> games = gameDao.findAll();

        Map<String, Object> params = new HashMap<>();
        params.put("games", games);

        return new ModelAndView("afficherjeux", params);
    }

    @GetMapping(value = { "/ajouterjeu" })
    public String ajouterjeu(Model model) {

        Game game = new Game();
        model.addAttribute("game", game);

        return "ajouterjeu";
    }


    @RequestMapping(value="/ajouterjeu", method=RequestMethod.POST)
    public String ajouterjeu(Model model, @ModelAttribute("game") Game game) {
       /* int id = game.getId();
        String nom = game.getNom();
        String dateSortie = game.getDateSortie();
        int prix = game.getPrix();*/

        //if (id >= 0 && nom != null && nom.length() > 0 && dateSortie != null && dateSortie.length() > 0 && prix >= 0) {
           if(game.checkGameIsValid()){
            //Game newGame = new Game(id, nom, prix, dateSortie);
            gameDao.save(game);
            return "redirect:/afficherjeux";
        }
        //game.addAttribute("errorMessage", errorMessage);
        model.addAttribute("errorMessage", errorMessage);
        return "ajouterjeu";
    }


/*    @RequestMapping(value = { "/ajouterjeu" }, method = RequestMethod.POST)
    public String saveGame(Model model, @ModelAttribute("game") Game game) {

        int id = gameForm.getId();
        String nom = gameForm.getNom();
        String dateSortie = gameForm.getDateSortie();
        int prix = gameForm.getPrix();

        if (id >= 0 && nom != null && nom.length() > 0 && dateSortie != null && dateSortie.length() > 0 && prix >= 0) {
            Game newGame = new Game(id, nom, prix, dateSortie);
           //game.add(newGame);

            return "redirect:/afficherJeux";
        }

        model.addAttribute("errorMessage", errorMessage);
        return "ajouterjeu";
    }*/


}

