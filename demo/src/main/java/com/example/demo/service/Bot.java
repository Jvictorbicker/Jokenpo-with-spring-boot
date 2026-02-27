package com.example.demo.service;

import com.example.demo.model.Plays;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Bot {
    private final Random random = new Random();

    public int choosePlay() {
        return random.nextInt(1,4);
    }

    public Plays botPlays() {
        int botPlays = choosePlay();

        switch (botPlays) {
            case 1:
                return Plays.PEDRA;
            case 2:
                return Plays.PAPEL;
            case 3:
                return Plays.TESOURA;
        }
        return Plays.PEDRA;
    }
}
