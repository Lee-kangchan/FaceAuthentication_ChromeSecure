package com.project.dsu.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class MyTest {
    public int solution(int m, int n, String[] board) {
        int answer = 0 ;

        while(true){
            boolean check = false;
            boolean[][] board2 = new boolean[m][n];

            for(int i= 0 ; i < m - 1; i++){
                for(int j = 0 ; j < n-1; j++){
                    if(board[i].charAt[j] != '?'){
                        char data = board[i].charAt(j);
                        if(data == board[i+1].charAt(j) && data == board[i+1].charAt(j+1) && data == board[i].charAt(j+1)){board2[i][j] = board2[i][j+1] = board2[i+1][j] = board2[i+1][j+1] = check = true;}
                    }
                }
            }
            if(!check){
                break;
            }
            for(int i = 0 ; i < m ; i ++){
                for(int j = 0 ; j < n ; j++){
                    if(board2[i][j]){
                        board[i] = board[i].subString(0,j) + "?"+ board[i].subString(j+1);
                        answer++;
                    }
                }
            }
            for(int i = 0 ; i < m; i++){
                for(int j = n-1 ; j >= 0 ; j--){
                    if(board[i].charAt(j) == '?'){
                        for(int k = i ; k > 0 ; k--){
                            String a = board[k-1].charAt(j)+"";
                            String b = board[k].charAt(j) + "";
                            board[k] = board[k].substring(0,j) + a + board[k].substring(j+1);
                            board[k-1] = board[k-1].substring(0, j ) + b + board[k-1].substring(j+1);
                        }
                    }
                }
            }
        }
        return answer;
    }
}
