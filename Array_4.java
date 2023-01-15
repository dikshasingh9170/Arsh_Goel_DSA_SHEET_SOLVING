class Array_4 {
    public void setZeroes(int[][] matrix) {
        boolean[][] res=new boolean[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    res[i][j]=true;
                }
            }        
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(res[i][j]==true){
                    makeRowZero(matrix,i);
                    makeColumnZero(matrix,j);
                }
            }        
        }
    }
    public void makeRowZero(int[][] matrix, int row) {
        for (int i = 0; i < matrix[row].length; i++) {
            matrix[row][i] = 0;
        }
    }

    public void makeColumnZero(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }
}
