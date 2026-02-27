package com.example.demo.controller;

import com.example.demo.model.Plays;
import com.example.demo.service.Bot;
import com.example.demo.service.Game;
import com.example.demo.service.Player;
import com.example.demo.service.Winner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class GameController {

    private final Player player;
    private final Bot bot;
    private final Winner winner;

    public GameController(Player player, Bot bot, Winner winner) {
        this.player = player;
        this.bot = bot;
        this.winner = winner;
    }

    @GetMapping
    public String start() {

        Plays playerPlay = player.choosePlays();
        Plays botPlay = bot.botPlays();

        return winner.result(playerPlay, botPlay);
    }
}