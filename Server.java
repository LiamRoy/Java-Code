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

public class Server {
	
	private Socket serveSock;
	private String word;
	private ServerSocket server;
	private String answer;
	private String restart = "yes";
	
		public Server() throws UnknownHostException, IOException {
			server = new ServerSocket(3005);
			
			Scanner scan = new Scanner(System.in);	
			
				do {
					
				System.out.println("Please enter word to start the game: ");
				word = scan.next();
				System.out.println("==============");
				System.out.println("Waiting another player");		
				serveSock  = server.accept();
			
			
				PrintWriter out = new PrintWriter(serveSock.getOutputStream(), true);
				BufferedReader in = new BufferedReader(new InputStreamReader(serveSock.getInputStream()));
				out.println("");
				for(int i = 0; i < 5; i++)
				{
				answer = in.readLine();
					
				if(word.contains(answer))
				{
					int n = word.indexOf(answer);
					out.println("The answer is correct at " + n + " position");
					System.out.println("The answer is correct at " + n + " position");
					System.out.println("==============");
				}
				
				else if(!word.contains(answer)){
					out.println("Sorry the letter "  + answer + " is incorrect");
					System.out.println("Sorry the letter "  + answer + " is incorrect");
					System.out.println("==============");
				}
				

				}
				String finalAns = in.readLine();
				if(finalAns.equals(word))
				{
					
					out.println("Congrats you have guessed the word!!");
					out.println("the game will end");
					
				}
				else
				{
					out.println("You guessed wrong, the word was " + word);
					out.println("The game will end");
				}
				
				
				
				restart = in.readLine();
				}while(restart.equals("yes"));
					if(restart.equals ("no")) {
						serveSock.close();
					}
				}
				
				

		public static void main (String [] agrs) throws UnknownHostException, IOException, SocketException
		{
			new Server();
		}

}