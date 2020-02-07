package PigLatin;
import java.util.Scanner;

/**
 * You have two friends who are speaking Pig Latin to each other! Pig Latin is the same words in the same order except that you take the first letter of each word and put it on the end, then you add 'ay' to the end of that. ("road" = "oadray")
 *
 * Task
 * Your task is to take a sentence in English and turn it into the same sentence in Pig Latin!
 *
 * Input Format
 * A string of the sentence in English that you need to translate into Pig Latin. (no punctuation or capitalization)
 *
 * Output Format
 * A string of the same sentence in Pig Latin.
 *
 * Sample Input
 * "nevermind youve got them"
 *
 * Sample Output
 * "evermindnay ouveyay otgay hemtay"
 */
public class PigLatin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String engStr=input.nextLine();

        //Split String from space
        String[] engStrList=engStr.split(" ");
        StringBuilder pigLatin= new StringBuilder();
        for(int i=0;i<engStrList.length;i++){
            String word=engStrList[i].substring(1);
            word += engStrList[i].charAt(0)+"ay";
            pigLatin.append(word).append(" ");
        }

        System.out.println(pigLatin);
    }
}
