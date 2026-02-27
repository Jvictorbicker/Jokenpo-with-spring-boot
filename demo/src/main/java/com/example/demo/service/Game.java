package com.example.demo.service;

import com.example.demo.model.Plays;
import org.springframework.stereotype.Service;

@Service
public class Game {
    private final Player player;
    private final Bot bot;
    private final Winner winner;

    public Game(Player player, Bot bot, Winner winner) {
        this.player = player;
        this.bot = bot;
        this.winner = winner;
    }

    public String start() {

        Plays playerChoose = player.choosePlays();
        Plays botChoose = bot.botPlays();

        return winner.result(playerChoose, botChoose);
    }
}