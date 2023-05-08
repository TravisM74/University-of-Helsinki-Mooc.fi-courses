
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
          
        int[][] mSquare = new int[size][size];

        int row_size = size-1;
        int col_size = size/2;
        mSquare[row_size][col_size] = 1;

        for (int i = 2; i <= size*size; i++) {
            if (mSquare[(row_size + 1) % size][(col_size + 1) % size] == 0) {
                row_size = (row_size + 1) % size;
                col_size = (col_size + 1) % size;
            }
            else {
                row_size = (row_size - 1 + size) % size;                
            }
            mSquare[row_size][col_size] = i;
        }
        
            
        return square;
    }
    
}
