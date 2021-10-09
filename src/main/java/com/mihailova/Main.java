package com.mihailova;

public class Main {


    public static void main(String[] args) {
        Posters onePoster = new Posters("A1", "Глянцевая", false, 19, "000001");
        Posters twoPoster = new Posters("A2", "Матовая", true, 0, "000002");
        Posters threePoster = new Posters("A3", "Бархат", true, 154, "000003");
        Posters fourPoster = new Posters("A1", "Матовая", true, 2, "000004");
        Posters fivePoster = new Posters("A3", "Глянцевая", true, 1, "000005");

        fourPoster.printing();
    }
}
