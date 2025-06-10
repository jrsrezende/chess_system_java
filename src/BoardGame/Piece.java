package BoardGame;

public abstract class Piece {

    protected Position position; // não tem valor nenhum dentro da matriz pieces[][](tabuleiro), só serve de referencia
    protected Board board;

    public Piece(Board board) { // a posicao da peça é null por que não foi colocada no tabuleiro ainda,
        this.board = board; // a peça conhece o tabuleiro onde ela está, é instanciada com o board do ChessMatch (8 x 8)
    }

    protected Board getBoard(){
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possiblemove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
