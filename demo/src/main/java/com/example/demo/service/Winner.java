package com.example.demo.service;

import com.example.demo.model.Plays;
import org.springframework.stereotype.Service;

@Service
public class Winner {
    private final Player player;
    private final Bot bot;

    public Winner(Player player, Bot bot) {
        this.player = player;
        this.bot = bot;
    }

    public String result(Plays optionPlayer, Plays optionBot) {

        if (optionPlayer == optionBot) {
            return "Empate, Tente novamente";
        } else if  ((optionPlayer == Plays.PEDRA && optionBot == Plays.TESOURA) ||
                    (optionPlayer == Plays.PAPEL && optionBot == Plays.PEDRA) ||
                    (optionPlayer == Plays.TESOURA && optionBot == Plays.PAPEL)) {
            return "Ganhou, Parabens voce venceu";
        } else {
            return "Perdeu, tente novamente!";
        }
    }
}
