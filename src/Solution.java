public class Solution {
    public int Calculate(int[][] matrix){
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - i - 1; j++) {
                if (minimum > matrix[i][j]){
                    minimum = matrix[i][j];
                }
            }
        }
        System.out.println(minimum + " " + "- Это результат из Solution");
        return minimum;
    }
}
