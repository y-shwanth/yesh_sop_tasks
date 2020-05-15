package com.example.stone_paper_scissor;

import android.app.Application;

public class GlobalClass extends Application {
    private int rounds;
    private String p1name;
    private String p2name;
    private int p1score;
    private int p2score;

    public int getRounds() {
        return rounds;
    }

    public String getP1name() {
        return p1name;
    }

    public String getP2name() {
        return p2name;
    }

    public int getP1score() {
        return p1score;
    }

    public int getP2score() {
        return p2score;
    }

    public void setP1name(String p1name) {
        this.p1name = p1name;
    }

    public void setP2name(String p2name) {
        this.p2name = p2name;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setP1score(int p1score) {
        this.p1score = p1score;
    }

    public void setP2score(int p2score) {
        this.p2score = p2score;
    }
}
