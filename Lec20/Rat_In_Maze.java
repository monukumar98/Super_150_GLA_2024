package Lec20;

import java.util.Scanner;

public class Rat_In_Maze {
	static boolean f = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < maze.length; i++) {
			String str = sc.next();
			for (int j = 0; j < str.length(); j++) {
				maze[i][j] = str.charAt(j);
			}

		}
		int[][] ans = new int[n][m];
		HasPath(maze, 0, 0, ans);
		if (f == false) {
			System.out.println("NO PATH FOUND");
		}

	}

	public static void HasPath(char[][] maze, int cc, int cr, int[][] ans) {

		if (cr == maze.length - 1 && cc == maze[0].length - 1 && maze[cr][cc] != 'X') {
			ans[cr][cc] = 1;
			Display(ans);
			f = true;
			return;
		}

		if (cr < 0 || cc < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {

			return;
		}
		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
		int r[] = { -1, 1, 0, 0 };
		int c[] = { 0, 0, -1, 1 };

		for (int i = 0; i < c.length; i++) {
			HasPath(maze, cc + c[i], cr + r[i], ans);
		}
//		HasPath(maze, cc, cr - 1, ans);// up
//		HasPath(maze, cc, cr + 1, ans);// down
//		HasPath(maze, cc - 1, cr, ans);// left
//		HasPath(maze, cc + 1, cr, ans);// right
		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;

	}

	public static void Display(int[][] ans) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}

	}

}
