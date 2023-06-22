import java.util.List;

public class Result {
    public static int flippingMatrix(List<List<Integer>> matrix) {
        int sum = 0;
        int quadrantSize = matrix.size()/2;
        for(int row = 0; row < quadrantSize; row++) {
            for(int column = 0; column < quadrantSize; column++) {
                sum += Math.max(matrix.get(row).get((2*quadrantSize) - column - 1),
                        Math.max(matrix.get(row).get(column),
                                Math.max(matrix.get((2*quadrantSize) - row - 1).get(column), matrix.get((2*quadrantSize) - row - 1).get((2*quadrantSize) - column - 1))));
            }
        }
        return sum;
    }
}
