package sample;

import static sample.Back.*;
import static sample.Gui.*;

class Judgement {
	private int x=49,y=56;
	protected static int isTurn=0;					//0 1 为黑子 2 3为白子
	private double i[] = new double[19];
	private double j[] = new double[19];
	private static boolean theFirst = true;
	private double x1 = 3;
	private double x2 = 2;
	private double y1 = 30.5;

	/*初始化棋盘 0无子 1黑子 2白子*/
	public Judgement(){
		for(int i = 0; i < 19; i++){
			for(int j = 0; j < 19; j++){
				board[i][j] = 0;
			}
		}
		xy();
		isTurn = 0;
	}

	/*判断是否有子*/
	public static boolean isDone(int x, int y){
		if(board[x][y] != 0) return true;
		else return false;
	}

	/*判断是否先手*/
	public static boolean isFirst(){
		for(int i = 0; i < 19; i++){
			for(int j = 0; j < 19; j++){
//				System.out.println(board[i][j]);
				if(board[i][j] != 0){
					theFirst = false;
					return theFirst;
				}
			}
		}
		return theFirst;
	}

	/*棋盘与坐标对应*/
	public void xy(){
		i[0] = x;
		j[0] = y;
		int m;
		for(m = 1; m < 19; m++){
			i[m] = i[m-1] + 28;
			j[m] = j[m-1] + 28;
		}
	}

	public double getI(int x){
		return i[x];
	}

	public double getJ(int y){
		return j[y];
	}

	/*落子颜色*/
	public static void setBoard(int x, int y) {
		if(isTurn == 0 || isTurn == 1){
			board[x][y] = 1;
			isTurn++;
		}
		else if(isTurn == 2 || isTurn == 3){
			board[x][y] = 2;
			if(isTurn == 3) isTurn = 0;
			else isTurn++;
		}
	}

	/*悔棋*/
	public void setBack(int x, int y){
		board[x][y] = 0;
	}


	/*判断回合*/
	public static void getIsTurn() {
		if(isTurn == 0 || isTurn == 1){
			tips.setText("黑方回合");
		}
		else if(isTurn == 2 || isTurn == 3){
			tips.setText("白方回合");
		}
	}

	public void setIsTurn(int isTurn) {
		if(isTurn < 0)
			this.isTurn = 3;
		else
			this.isTurn = isTurn;
	}

	/*返回已经下了多少子*/
	public int getNumber(){
		int t = 0;
		for(int i = 0; i < 19; i++){
			for(int j = 0; j < 19; j++){
				if(isDone(i, j)){
					t += 1;
				}
			}
		}
		return t;
	}

	/*停止下棋*/
	public void isWin(){
		for(int i = 0; i < 19; i++){
			for(int j = 0;j < 19; j++){
				if(board[i][j] == 0)
					board[i][j] = 3;
			}
		}
	}


	/**
	 * 先判断棋盘是否满了
	 * 再判断是否六连子
	 * 判断输赢
	 * */

	public int Win(int x, int y){
		/*0为棋盘未满 1为黑win 2为白win 3为平局或棋盘已满*/
		int t = 3;
		int count1 = 0, count3 = 0, count5 = 0, count7 = 0;
		int countb1 = 0,countb3 = 0, countb5 = 0, countb7 = 0;

		for(int i = 0; i < 19; i++){
			for(int j =0; j < 19; j++){
				if(board[i][j] == 0){
					t = 0;
				}
			}
			if(t == 0) break;
			else if(t == 3) return t;
		}

		if(board[x][y] == 1){
			for(int k = 1; k <= 5 && x+k < 19; k++){
				if(board[x+k][y] == 1){count1 += 1;}
				else break;
			}
			for(int k = 1; k <= 5 && x-k >= 0; k++){
				if(board[x-k][y] == 1){count1 += 1;}
				else break;
			}
			for(int k = 1; k <= 5 && y+k < 19 && x+k < 19; k++){
				if(board[x+k][y+k] == 1){count3 += 1;}
				else break;
			}
			for(int k = 1; k <= 5 && x-k >= 0 && y-k >= 0; k++){
				if(board[x-k][y-k] == 1){count3 += 1;}
				else break;
			}
			for(int k = 1; k <= 5 && y-k >= 0 && x+k < 19; k++){
				if(board[x+k][y-k] == 1){count5 += 1;}
				else break;
			}
			for(int k = 1; k <= 5 && x-k >= 0 && y+k <19; k++){
				if(board[x-k][y+k] == 1){count5 += 1;}
				else break;
			}
			for(int k = 1; k <= 5 && y+k < 19; k++){
				if(board[x][y+k] == 1){count7 += 1;}
				else break;
			}
			for(int k = 1; k <= 5 && y-k >= 0; k++){
				if(board[x][y-k] == 1){count7 += 1;}
				else break;
			}
		}


		/*==========================================*/

		if(board[x][y] == 2){
			for(int k = 1; k <= 5 && x+k < 19; k++){
				if(board[x+k][y] == 2){countb1 += 1;}
				else break;
			}
			for(int k = 1; k <= 5 && x-k >= 0; k++){
				if(board[x-k][y] == 2){countb1 += 1;}
				else break;
			}
			for(int k = 1; k <= 5 && y+k < 19 && x+k < 19; k++){
				if(board[x+k][y+k] == 2){countb3 += 1;}
				else break;
			}
			for(int k = 1; k <= 5 && x-k >= 0 && y-k >= 0; k++){
				if(board[x-k][y-k] == 2){countb3 += 1;}
				else break;
			}
			for(int k = 1; k <= 5 && y-k >= 0 && x+k < 19; k++){
				if(board[x+k][y-k] == 2){countb5 += 1;}
				else break;
			}
			for(int k = 1; k <= 5 && x-k >= 0 && y+k < 19; k++){
				if(board[x-k][y+k] == 2){countb5 += 1;}
				else break;
			}
			for(int k = 1; k <= 5 && y+k < 19; k++){
				if(board[x][y+k] == 2){countb7 += 1;}
				else break;
			}
			for(int k = 1; k <= 5 && y-k >= 0; k++){
				if(board[x][y-k] == 2){countb7 += 1;}
				else break;
			}
		}

		if(count1 >= 5 || count3 >= 5 || count5 >= 5 || count7 >= 5){
			t = 1;
		}

		if(countb1 >= 5 || countb3 >= 5 || countb5 >= 5 || countb7 >= 5){
			t = 2;
		}
		return t;
	}
}
