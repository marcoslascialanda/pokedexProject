package com.pokedex.pokedex.model;

public class Move {

    private MoveData move;

    public MoveData getMove() {
        return move;
    }

    public void setMove(MoveData move) {
        this.move = move;
    }

    public class MoveData{

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
