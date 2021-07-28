
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int startIndex = (size / 2) + 1;
        int row = 0;
        int column = startIndex - 1;
        int value = 1;

        square.placeValue(column, 0, value);

        for (int i = 1; i < (size * size); i++) {

            if (row - 1 >= 0) {
                row -= 1;
            } else {
                row = size - 1;
            }

            if (column + 1 <= (size - 1)) {
                column += 1;
            } else {
                column = 0;
            }

            value++;

            if (square.readValue(column, row) != 0) {

                if (column - 1 < 0) {
                    column = size - 1;
                } else {
                    column -= 1;
                }

                if (row + 1 > size - 1) {
                    row = 1;
                } else {
                    row += 2;
                }
            }
            square.placeValue(column, row, value);
        }

        return square;
    }

}
