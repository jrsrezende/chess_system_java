package Chess;

import BoardGame.Board;
import BoardGame.BoardException;
import BoardGame.Piece;
import BoardGame.Position;

public abstract class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position);
    }

    protected boolean isThereOpponentPiece(Position position){
        if (!board.positionExists(position)) {
            throw new BoardException("Position not on the board");
        }
        ChessPiece p = (ChessPiece) board.piece(position);
        return p != null && p.getColor() != color;
    }
}
