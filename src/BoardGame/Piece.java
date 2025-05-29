package BoardGame;

public class Piece {

    protected Position position; // não tem valor nenhum dentro da matriz pieces[][](tabuleiro), só serve de referencia
    private Board board;

    public Piece(Board board) { // a posicao da peça é null por que não foi colocada no tabuleiro ainda,
        this.board = board; // a peça conhece o tabuleiro onde ela está, é instanciada com o board do ChessMatch (8 x 8)
    }

    protected Board getBoard(){
        return board;
    }
}
