// **********************************************************
//   Author:  Jorge Villarreal
// 
//   Count.java
//
//   This program reads a string (phrase) and counts the 
//   number of space characters and certain other letters
//   in the phrase.
// **********************************************************
package project7;
import java.util.Scanner; 

public class Count {

    public static void main(String[] args) {
        String phrase;  // a string of characters
        int blankCount; // the number of blanks (spaces) in the phrase 
        int aCount;  // The number of a and A in a phrase
        int eCount;  // The number of e and E in a phrase
        int sCount;  // The number of s and S in a phrase
        int tCount;  // The number of t and T in a phrase
        int length;  // the length of the phrase
        char ch;     // an individual character in the string

        Scanner scanner = new Scanner(System.in);
        
        // Print a program header
        System.out.println ();
        System.out.println ("Character Counter");
        System.out.println ();
        
        //Outer loop so the program continues to run unless the user types quit
        do
        {
            // Read in a string and find its length
            System.out.print ("Enter a sentence or phrase: ");
            phrase = scanner.nextLine();
            length = phrase.length();

            // Initialize counts
            blankCount = 0;
            aCount = 0;
            eCount = 0;
            sCount = 0;
            tCount = 0;

            // Add a "for" loop here to go through the string 
            // character by character and count the space characters.
            //Switch case to ount the number of a's, e's, s's and t's including
            //their capital letters. 
            for(int i=0;i<length;i++)
            {
                ch = phrase.charAt(i);
                switch(ch)
                {
                    case ' ':
                    blankCount++;
                    break;
                
                    case 'a': 
                    case 'A':
                    aCount++;
                    break;
                
                    case 'e':
                    case 'E':
                    eCount++;
                    break;
                
                    case 's':
                    case 'S':
                    sCount++;
                    break;
                
                    case 't':
                    case 'T':
                    tCount++;
                    break;
            
                }
            }

            // Print the results
            System.out.println ();
            System.out.println ("Number of space characters: " + blankCount);
            System.out.println("Number of a's " + aCount);
            System.out.println("Number of e's " + eCount);
            System.out.println("Number of s's " + sCount);
            System.out.println("Number of t's " + tCount);
            System.out.println ();
            System.out.println("To continue enter another phrase, to finish "
                    + "type quit");
        }while(!"quit".equals(phrase));
   }
}
