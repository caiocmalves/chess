package chess;

import boardgame.BoardExcepetion;

public class ChessException extends BoardExcepetion {
    private static final long serialVersionUID = 1L;

    public ChessException(String smg){
        super(smg);
    }
}
