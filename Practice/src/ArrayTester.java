public class ArrayTester {
    public static int[] getColumn(int[][] arr2D, int c){
        int[] column = new int[arr2D[0].length];

        for (int r = 0; r < arr2D.length; r++) {
            column[r] = arr2D[r][c];
        }

        return column;
    }

    public static boolean hasAllValues(int[] arr1, int[] arr2){
        return false;
    }

    public static boolean containsDuplicates(int[] arr){
        return false;
    }

    public static boolean isLatin(int[][] square){
        if (containsDuplicates(square[0]))
            return false;

        for (int r = 1; r < square.length; r++) {
            if (!hasAllValues(square[0], square[r]))
                return false;
        }
        
        for (int c = 0; c < square[0].length; c++) {
            if (!hasAllValues(square[0], getColumn(square,c)))
                return false;
        }

        return true;
    }
}
