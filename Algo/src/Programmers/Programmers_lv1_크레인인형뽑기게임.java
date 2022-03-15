package Programmers;

import java.util.Stack;

public class Programmers_lv1_크레인인형뽑기게임 {
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		System.out.println(solution(board,moves));
	}
	
	
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>(); 
        for(int i=0; i<moves.length; i++) {
        	for(int j=0; j<board.length; j++) {
        		if(board[j][moves[i]-1]!=0) {
//        			System.out.printf("moves :%d icon : %d\n",moves[i]-1,board[j][moves[i]-1]);
        			if(stack.size()>0&&board[j][moves[i]-1]==stack.peek()) {
        				board[j][moves[i]-1]=0;
        				stack.pop();
        				answer+=2;
        				break;
        			}
        			stack.add(board[j][moves[i]-1]);
        			board[j][moves[i]-1]=0;
        			break;
        		}
        	}
        }
        return answer;
    }
}
