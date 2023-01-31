class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldcolor=image[sr][sc];
        color(image,sr,sc,color,oldcolor);
        return image;
    }
    public void color(int[][] image,int sr,int sc,int color,int oldcolor){
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc]==color || image[sr][sc]!=oldcolor)return;
        image[sr][sc]=color;
        color(image,sr+1,sc,color,oldcolor);
        color(image,sr-1,sc,color,oldcolor);
        color(image,sr,sc+1,color,oldcolor);
        color(image,sr,sc-1,color,oldcolor);
    }
}
