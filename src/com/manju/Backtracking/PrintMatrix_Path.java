package com.manju.Backtracking;

import java.util.Arrays;

public class PrintMatrix_Path {
    static void main() {
        boolean[][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path=new int[board.length][board[0].length];
        path("",board,0,0,path,1);
    }
    static void path(String p,boolean[][] maze,int r,int c,int[][] path,int step){
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;

        if(r==maze.length-1&&c==maze[0].length-1){
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            maze[r][c] = true;
            path[r][c] = 0;
            return;
        }

        if(r<maze.length-1) {

            path(p + 'D', maze,r + 1, c,path,step+1);
        }
        if(c<maze[0].length-1){
            path(p + 'R', maze,r, c + 1,path,step+1);
        }
        if(r>0) {

            path(p + 'U', maze,r - 1, c,path,step+1);
        }
        if(c>0){
            path(p + 'L', maze,r, c - 1,path,step+1);
        }
        maze[r][c]=true;
        path[r][c]=0;
    }
}
