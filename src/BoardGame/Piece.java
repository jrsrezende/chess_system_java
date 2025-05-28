package BoardGame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) { // a posicao da peça é null por que não foi colocada no tabuleiro ainda,
        this.board = board; // a peça conhece o tabuleiro onde ela está
    }

    protected Board getBoard(){
        return board;
    }
}
