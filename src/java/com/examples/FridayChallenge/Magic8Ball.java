package com.examples.FridayChallenge;

import java.util.Scanner;
import java.util.Random;

public class Magic8Ball {

    public static void main(String[] args)
    {
        String donePlay;

        //call the shakeBall method to ask Magic 8 Ball a question
        donePlay = shakeBall();

        //output the end of asking Magic 8 Ball questions
        System.out.println(donePlay);
    }

    public static String shakeBall()
    {
        //set scanner
        Scanner input = new Scanner(System.in);

        //set variables
        String question, answer;
        String playAgain = "y";

        //start while loop
        while (playAgain.equals("y"))
        {
            //ask question and store in variable
            System.out.println("Enter your question: ");
            question = input.nextLine();

            //call ballAnswer and store in variable
            answer = ballAnswer();

            //print question and answer
            System.out.println("YOU ASKED: " + question);
            System.out.println("MAGIC 8-BALL SAYS: " + answer);

            //ask if they have another question
            System.out.println("Do you have another question for the Magic 8-Ball? (y/n)");
            playAgain = input.nextLine();
        }

        //once the loops breaks
        //return "Thank you for playing!" to donePlay in main
        return "Thank you for playing!";
    }

    public static String ballAnswer()
    {
        //set random number variable
        Random r = new Random();

        //set random generator output to caseNum
        int caseNum = (1 + r.nextInt(20));

        //set variable to hold switch case response return
        String respRet = null;

        //switch case
        //each caseNum is an 8 ball response
        switch (caseNum)
        {
            case 1:
                respRet = "It is certain";
                break;
            case 2:
                respRet = "It is decidedly so";
                break;
            case 3:
                respRet = "Without a doubt";
                break;
            case 4:
                respRet = "Yes definitely";
                break;
            case 5:
                respRet = "You may rely on it";
                break;
            case 6:
                respRet = "As I see it, yes";
                break;
            case 7:
                respRet = "Most likely";
                break;
            case 8:
                respRet = "Outlook good";
                break;
            case 9:
                respRet = "Yes";
                break;
            case 10:
                respRet = "Signs point to yes";
                break;
            case 11:
                respRet = "Reply hazy try again";
                break;
            case 12:
                respRet = "Ask again later";
                break;
            case 13:
                respRet = "Better not tell you now";
                break;
            case 14:
                respRet = "Cannot predict now";
                break;
            case 15:
                respRet = "Concentrate and ask again";
                break;
            case 16:
                respRet = "Don't count on it";
                break;
            case 17:
                respRet = "My reply is no";
                break;
            case 18:
                respRet = "My sources say no";
                break;
            case 19:
                respRet = "Outlook not so good";
                break;
            case 20:
                respRet = "Very doubtful";
                break;


        }

        //return respRet to answer variable in shakeBall
        return respRet;
    }
}
