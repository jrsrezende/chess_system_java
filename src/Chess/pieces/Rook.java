package Chess.pieces;

import BoardGame.Board;
import BoardGame.Position;
import Chess.ChessPiece;
import Chess.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[board.getRows()][board.getColumns()];
        Position p = new Position(0, 0);

        //acima
        p.setValues(position.getRow() - 1, position.getColumn());
        while (board.positionExists(p) && !board.thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() - 1);
        }
        if (board.positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //abaixo
        p.setValues(position.getRow() + 1, position.getColumn());
        while (board.positionExists(p) && !board.thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() + 1);
        }
        if (board.positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //esquerda
        p.setValues(position.getRow(), position.getColumn() - 1);
        while (board.positionExists(p) && !board.thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() - 1);
        }
        if (board.positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //direita
        p.setValues(position.getRow(), position.getColumn() + 1);
        while (board.positionExists(p) && !board.thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() + 1);
        }
        if (board.positionExists(p) && isThereOpponentPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        return mat;
    }
}
