package hangman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;



public class Player {
	
	Scanner scan = new Scanner(System.in);

	public Player() throws UnknownHostException, IOException {
		
		Socket playerSocket = new Socket("localhost", 3005);	
		
		BufferedReader in = new BufferedReader(new InputStreamReader(playerSocket.getInputStream()));

		PrintWriter out = new PrintWriter(playerSocket.getOutputStream(), true);
		
		String answer;		
		String restart = "yes";
		String PlayerAnswer;
	
		
		do {
			
		System.out.println("==============");
		System.out.println("Waiting for server to choose a word");
		in.readLine();
		
		System.out.println("WELCOME TO HANGMAN");
		System.out.println("BEST OF LUCK AND HAVE FUN!");
		
		for(int i = 0; i < 5; i++) {
			System.out.println("==============");
			
			System.out.println("Please enter your guess");
			
			answer = scan.nextLine();
				
			out.println(answer);
			PlayerAnswer = in.readLine();
			System.out.println(PlayerAnswer);
			System.out.println("You have " + (4 - i) + " guesses remaining choose them wisely");
			System.out.println("==============");
			
			
		}
			
		
		System.out.println("You are out of guesses. Please guess the word.");
		PlayerAnswer = scan.nextLine();
		out.println(PlayerAnswer);
		String congratsMessage = in.readLine();
		System.out.println(congratsMessage);
		String endMessage = in.readLine();
		System.out.println(endMessage);
		
				System.out.println("==============");
				System.out.println("Would you like to play again?");
				//scan.nextLine();
				restart = scan.nextLine();
				out.println(restart);
		}while (restart.equals("yes"));
		
			
				
		
		
		
			
		
			
			
	
		
		
		
		
	}
	public static void main (String [] agrs) throws UnknownHostException, IOException, SocketException
	{
		new Player();
	}
	
				
	
	
}


