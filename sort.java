// VLAD JIRNOV

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

 public class sort {

     /* a function for checking uniqueness of characters in a word */
     private static boolean isUniqueChar(String str) {


         // If at any time we encounter 2 same
         // characters, return false
         for (int i = 0; i < str.length(); i++)
             for (int j = i + 1; j < str.length(); j++)
                 if (str.charAt(i) == str.charAt(j))
                     return false;

         // If no duplicate characters encountered,
         // return true
         return true;
     }


     /* a function for sorting an input word */
     private static String sortWord(String s) {
         String low;
         char[] c = s.toCharArray();
         insertionSort(c);
         return low = new String(c).toLowerCase();

         //return new String(c);

     }

     /* insertion sort algorithm. It should return a string type */
     public static void insertionSort(char[] word) {
         if (word == null || word.length == 0)
             return; // empty array have nothing to sort

         for (int i = 0; i < word.length; i++) {
             char temp = word[i];
             int j = i;
             while (j > 0 && word[j - 1] > temp) {
                 word[j] = word[j - 1];
                 j--;
             }
             word[j] = temp;

         }

         return;
     }

     public static void main(String[] args) throws FileNotFoundException {


         //scanner that reads the input file
         File file = new File("C:\\Users\\M16\\Desktop\\input.txt");
         Scanner scanner = new Scanner(file);


             while (scanner.hasNextLine()) {
                 String s = scanner.nextLine();
                 boolean unique = isUniqueChar(s);
                 String sorted = sortWord(s);
                System.out.printf("%-18s %-18s %-18s", unique, sorted, s);
                 System.out.println("");

             }
             scanner.close();

         }
     }





