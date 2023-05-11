class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) {
            return image;
        }
        changeColor(image, sr, sc, image[sr][sc], color);
        return image;
    }

    public void changeColor(int[][] image, int sr, int sc, int prevColor, int color) {
        if(image[sr][sc] == prevColor) {
            image[sr][sc] = color;
            if(sr > 0) changeColor(image, sr-1, sc, prevColor, color);
            if(sr < image.length-1) changeColor(image, sr+1, sc, prevColor, color);
            if(sc > 0) changeColor(image, sr, sc-1, prevColor, color);
            if(sc < image[0].length-1) changeColor(image, sr, sc+1, prevColor, color);
        }
        return;
    }
}