package com.chessgame.chess;

public class ChessException extends RuntimeException{
    private final long serialVersionUID = 1L;

    public ChessException(String msg){
        super(msg);
    }
}
