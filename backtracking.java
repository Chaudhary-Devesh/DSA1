public class backtracking {
    public static void printarr(int[] arr){
        for(int i=0;i<arr.length;i++){ 
            System.out.println(arr[i]);
        }
    }
    public static void change(int arr[],int i, int val){
        if(i==arr.length){
            printarr(arr);
            return;
        }

        arr[i]=val;
        change(arr, i+1, val+1);
        arr[i]=arr[i]-2;

    }

    public static void findSubsets(String str,int i,String ans){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        findSubsets(str, i+1, ans+str.charAt(i));
        findSubsets(str, i+1, ans);
        
    }
    public static void permutation(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String newstr= str.substring(0, i)+str.substring(i+1);
            permutation(newstr, ans+curr);
        }


    }
    public static void printBoard(char board[][]){
        System.out.println("----------chess board-------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char board[][],int row,int col){
        // horizontal
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }
        // vertical
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // upper left
        int r=row;
        for(int c=col;c>=0 && r>=0;c--,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        // upper right
        r=row;
        for(int c=col;c<board.length && r>=0;r--,c++ ){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        // lower left
        r=row;
        for(int c=col;c>=0 && r<board.length;r++,c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        // lower right
        for(int c=col;c<board.length && r<board.length; c++,r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        return true;


    }
    public static void nQeens(char board[][],int row){
        if(row==board.length){
            printBoard(board);
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQeens(board, row+1);
                board[row][j]='x';
            }
        }
    }
    public static void main(String[] args) {
        // int arr[] = new int[5];
        // change(arr, 0, 1);
        // printarr(arr);
        // String str = "abc";
        // findSubsets(str, 0, "");
        // permutation(str, "");
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        nQeens(board, 0);
        

    }
    
}
