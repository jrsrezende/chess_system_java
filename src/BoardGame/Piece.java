package BoardGame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) { // a posição de uma peça recem criada será null, por que não foi colocada no tabuleiro ainda
        this.board = board;
    }

    protected Board getBoard(){
        return board;
    }
}
