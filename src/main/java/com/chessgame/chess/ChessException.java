package com.chessgame.chess;

import com.chessgame.boardgame.BoardException;

public class ChessException extends BoardException {
    private final long serialVersionUID = 1L;

    public ChessException(String msg){
        super(msg);
    }
}
