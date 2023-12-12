package ch06;

import java.util.Stack;


public class Robot{

	public static int NUMDIRECTIONS =  4;
	public static int WIDTH = 8;
	public static int HEIGHT = 8;
	
	Stack<Move> stack = new Stack<Move>();
	Move Move;
	Maze maze = new Maze();
	
}