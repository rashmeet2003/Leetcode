class Solution {
    public void dfs(int[][] image, int row, int col, int oldcol, int newcol){
        if(row<0 || col<0 || row>=image.length || col>=image[0].length) return;

        if(image[row][col] != oldcol) return;

        image[row][col] = newcol;
        dfs(image, row-1, col, oldcol, newcol);
        dfs(image, row+1, col, oldcol, newcol);
        dfs(image, row, col-1, oldcol, newcol);
        dfs(image, row, col+1, oldcol, newcol);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldcol = image[sr][sc];
        if(oldcol == color){
            return image;
        }
        dfs(image,sr,sc,oldcol,color);
        return image;
    }
}