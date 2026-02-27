package com.example.demo.service;

import  java.util.Random;
import com.example.demo.model.Plays;
import org.springframework.stereotype.Service;

@Service
public class Player {

    private final Random random = new Random();

    public Plays choosePlays() {
        int value = random.nextInt(3);

        switch (value) {
            case 0: return Plays.PEDRA;
            case 1: return Plays.PAPEL;
            default: return Plays.TESOURA;
        }
    }
}