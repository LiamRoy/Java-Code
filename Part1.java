
/**
 * Write a description of class Part1 here.
 * 
 * @author (Liam Roy) 
 * @version (21/10/16)
 */
import java.util.Scanner;
public class Part1

{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);       

        System.out.print("\f");                      

        double score = 0;
        double totalScore = 0;
        int times = 0;
        String repeat = "yes";
        String answer = "b";
        while (repeat.equals("yes"))
        {
            System.out.println("GEOGRAPHY QUIZ");
            System.out.println("==============");
            System.out.println("Answer these three questions on capital countries of the world.");
            System.out.println("Correct answers give you 3 points while incorrect answers give you -1 point.");
            System.out.println("Type 'h' to get a hint if you are stuck. Get answer right with hint and you get 0.5 points.");
            System.out.println("See how many points you can get out of nine.");
            System.out.println("==============");
            System.out.println("GOODLUCK!");
            System.out.println("==============");

            score = 0;
            System.out.println("Question 1:");
            System.out.println("What is the capital of Spain?:");
            System.out.println("a)Barcelona  b)Madrid  c)Lisbon");
            System.out.println("Type h for hint");
            answer = scan.nextLine();

            while (!answer.equals("a") && (!answer.equals("b"))  && (!answer.equals("c")) && (!answer.equals("h")))
            {
                System.out.println("Error, please retype value");
                answer = scan.nextLine();
            }

            if (answer.equals("b"))
            { 
                System.out.println("Correct 3 points!");
                score = score + 3;
            }
            else if (answer.equals("h"))
            {
                System.out.println("It begins with 'M'");
                answer = scan.nextLine();
                while (!answer.equals("a") && (!answer.equals("b"))  && (!answer.equals("c")) && (!answer.equals("h")))
                {
                    System.out.println("Error, please retype value");
                    answer = scan.nextLine();
                }
                System.out.println("Correct 0.5 points");
                score = score + 0.5;
            }
            else 
            {
                System.out.println("Incorrect - 1 points");
                System.out.println("The answer is b) Madrid");
                score = score - 1;
            }

            System.out.println("==============");
            System.out.println("Question 2:");
            System.out.println("What is the Capital of Germany?:");
            System.out.println("a)Munich  b)Paris  c)Berlin");
            System.out.println("Type 'h' for a hint");
            answer = scan.nextLine();
            while (!answer.equals("a") && (!answer.equals("b"))  && (!answer.equals("c")) && (!answer.equals("h")))
            {
                System.out.println("Error, please retype value");
                answer = scan.nextLine();
            }

            if (answer.equals("c"))
            { 
                System.out.println("Correct 3 points!");
                score = score + 3;
            }
            else if (answer.equals("h"))
            {
                System.out.println("A famous wall was knocked down here in 1989");
                answer = scan.nextLine();
                while (!answer.equals("a") && (!answer.equals("b"))  && (!answer.equals("c")) && (!answer.equals("h")))
                {
                    System.out.println("Error, please retype value");
                    answer = scan.nextLine();
                }
                System.out.println("Correct 0.5 points");
                score = score + 0.5;
            }
            else 
            {
                System.out.println("Incorrect - 1 points");
                System.out.println("The answer is c), Berlin");
                score = score - 1;
            }

            System.out.println("==============");
            System.out.println("Question 3:");
            System.out.println("What is the Capital of Australia?:");
            System.out.println("a)Canberra  b)Sydney  c)Dublin");
            System.out.println("Type 'h' for a hint");
            answer = scan.nextLine();
            while (!answer.equals("a") && (!answer.equals("b"))  && (!answer.equals("c")) && (!answer.equals("h")))
            {
                System.out.println("Error, please retype value");
                answer = scan.nextLine();
            }

            if (answer.equals("a"))
            { 
                System.out.println("Correct 3 points!");
                score = score + 3;
            }
            else if (answer.equals("h"))
            {
                System.out.println("It has the letter 'r' twice in it");
                answer = scan.nextLine();
                while (!answer.equals("a") && (!answer.equals("b"))  && (!answer.equals("c")) && (!answer.equals("h")))
                {
                    System.out.println("Error, please retype value");
                    answer = scan.nextLine();
                }
                System.out.println("Correct 0.5 points");
                score = score + 0.5;
            }
            else 
            {
                System.out.println("Incorrect - 1 points");
                System.out.println("The answer was a), Canberra");
                score = score - 1;
            }
            System.out.println("Your score is "+ score +" points");
            System.out.println("Would you like to do the quiz again, yes/no?");
            repeat = scan.nextLine();

            while (!repeat.equals("yes") && (!repeat.equals("no")))

            {
                System.out.println("Error, please retype value");
                repeat = scan.nextLine();

            }
            times ++;

            System.out.print("\f");  
        }   
        totalScore = score;
        System.out.println("You have taken this quiz: " + times + " times");
        System.out.println("You have scored " + totalScore + " points altogether");
        System.out.println("Congratulations, you have finished the quiz");
    }   
}
