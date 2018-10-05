import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String[][] statesCapitals={{"Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connectitut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indinia","Iowa","Kansas"},{"Montgomery","Junuau","Phoenix","Litthe rock","Sacremonto","Denver","Hartford","Dover","Tallahesse","Atlanta","Honolulu","Boise","Springfield","Indianopolis","Des moines","Topeka"}};
        int lenghtOfTheArray=statesCapitals.length();
        Random randomNumber=new Random();
        int randomNumberInt=randomNumber.nextInt(lenghtOfTheArray)+0;
        Scanner inputFromConsole=new Scanner();
        System.out.println("What is the capital of: "+statesCapitals[randomNumberInt]);
        String inputFromConsoleString=inputFromConsole.next();
        if(statesCapitals[][randomNumber]=inputFromConsole)
        {
            System.out.println("Du har gættet rigtigt");
        }
        else
        {
            System.out.println("Du har gættet forkert");
        }



    }
}
