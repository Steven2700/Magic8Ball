/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic8ball;

import java.util.Scanner;

/**
 *
 * @author Steven Navarrete
 */
public class Magic8Ball {

    public static void main(String[] args) {
       String question;
        int random;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hello, I am the Magical 8 Ball. What is your question? ");
        question = scanner.nextLine();
        
        System.out.println("Your question was: " + question);
        
        random = (int)(Math.random() * 20);
        
        switch (random) {
            case 0: System.out.println("My answer is : It is certain");
            break;
            case 1: System.out.println("My answer is: It is decidely so");
            break;
            case 2: System.out.println("My answer is: Without a doubt");
            break;
            case 3: System.out.println("My answer is: Yes defintely");
            break;
            case 4: System.out.println("My answer is: You may rely on it");
            break;
            case 5: System.out.println("My answer is: As I see it, yes");
            break;
            case 6: System.out.println("My answer is: Most likely");
            break;
            case 7: System.out.println("My answer is: Outlook is good");
            break;
            case 8: System.out.println("My answer is: yes");
            break;
            case 9: System.out.println("My answer is: Signs point to yes");
            break;
            case 10: System.out.println("My answer is: Reply is hazy try again");
            break;
            case 11: System.out.println("My answer is: Better not tell you now");
            break;
            case 12: System.out.println("My answer is: Cannot predict now");
            break;
            case 13: System.out.println("My answer is: Concentrate and ask again");
            break;
            case 14: System.out.println("My answer is: Don't count on it");
            break;
            case 15: System.out.println("My answer is: My reply is no");
            break;
            case 16: System.out.println("My answer is: My source say no");
            break;
            case 17: System.out.println("My answer is: Outlook not so good");
            break;
            case 18: System.out.println("My answer is: Very doubtful ");
            break;
            case 19: System.out.println("My answer is: Ask again later ");
            break;
    }
        
        
    }
    

    }
    

