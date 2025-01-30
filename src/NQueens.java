import java.util.*;
// ps:https://practice.geeksforgeeks.org/problems/n-queen-problem-1587115621/1
// time complexity O(n!)
// space complexity O(n)
public class NQueens {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        if (n == 0) {
            return res;
        }
        ArrayList<Integer> board = new ArrayList<>(); // Represents the current configuration
        recur(board, 0, n);
        return res;
    }
    public void recur(ArrayList<Integer> board, int col, int n) {
        if (col == n) {
            // Add a deep copy of the current configuration to the result
            res.add(new ArrayList<>(board));
            return;
        }
        for (int row = 1; row <= n; row++) {
            if (isValid(board, row, col)) {
                // Place the queen
                board.add(row);

                // Recur for the next column
                recur(board, col + 1, n);

                // Backtrack: remove the queen
                board.remove(board.size() - 1);
            }
        }
    }
    public boolean isValid(List<Integer> board, int row, int col) {
        // Check if the current row conflicts with any previously placed queens
        for (int i = 0; i < col; i++) {
            int prevRow = board.get(i);
            // Same row or same diagonal
            if (prevRow == row || Math.abs(prevRow - row) == Math.abs(i - col)) {
                return false;
            }
        }
        return true;
    }
}
