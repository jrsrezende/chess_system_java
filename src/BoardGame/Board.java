package BoardGame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Piece piece(int row, int column) { // retorna a Piece que está nessa row e column
        return pieces[row][column];
    }

    public Piece piece(Position position) { // retorna a Piece que está nessa position
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position){
        pieces[position.getRow()][position.getColumn()] = piece; // coloca a piece no board
        piece.position = position; //indica que essa piece esta nessa position
    }

}
