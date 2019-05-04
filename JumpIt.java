import java.util.Scanner;
import java.util.Arrays;

public class JumpIt {

    public static void main(String[] args) 
    {
    	Scanner n = new Scanner(System.in);
    	System.out.println("Enter the length of the board: ");
      	int length = n.nextInt();
      	System.out.println("You have enterd " + length);
      	int[] board = new int[length];
      	board[0] = 0;
      	
      	for (int i = 1; i < length; i++)
      	{
      		System.out.print("Please enter the " );
      		System.out.print(i + 1);
      		System.out.println(" element for the board");
      		board[i] = n.nextInt();
      	}
      		System.out.println(Arrays.toString(board) );
      		System.out.println(cheapest(board,0) );
    }
    
    public static int cheapest(int[] board, int n)
    {
    	if(board.length - 1  == n)
    	 return board[n];
    	
    	else if(board.length - 2 == n)    	
    		return board[0] + board[board.length - 1];
    		
		  else if(cheapest(board, n + 1) < cheapest(board, n + 2))
    		return board[n] + cheapest(board, n + 1);
    		
    	else
    		return board[n] + cheapest(board, n + 2);	 	
     }
    }
