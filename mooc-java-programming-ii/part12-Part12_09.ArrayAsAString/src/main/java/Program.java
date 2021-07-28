
public class Program {

    public static void main(String[] args) {
        // Test your method here
        int[][] matrix = {
    {3, 2, 7, 6},
    {2, 4, 1, 0},
    {3, 2, 1, 0}
};

System.out.println(arrayAsString(matrix));
    }
    
    public static String arrayAsString(int[][] array) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                result.append(array[i][k]);
            }
            result.append("\n");
        }
        
        return result.toString();
    }

}
