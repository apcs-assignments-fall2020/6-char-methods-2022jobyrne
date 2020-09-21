//Jen OByrne Char Practice HW

import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch < 'A') || (ch >= 91 && ch <= 96)) {
            return ch;
        }
        
        else {
        char charr = (char) (ch + 32);
        return charr;
        }
        // REPLACE WITH YOUR CODE
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        int i = 0;
        char c1 = ' ';
        char charr = ' ';
        String str2 = "";
        while (i < str.length()) {
            c1 = str.charAt(i);
            if (c1 >= 'A' && c1 <= 'Z') {
            charr = (char) (c1 + 32);
            }

             else {
                charr = c1;
            }

            if (c1 == ' ') {
                charr = ' ';
            } 
        
           
            str2 = str2 + charr;
            i++;
                
        }
            

        
        return str2;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch < 'A') || (ch >= 91 && ch <= 96)) {
            return ch;
        }
        else {
            char charr = (char) (ch - 32);
            return charr;
        }
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        int i = 0;
        char c1 = 'h';
        char charr = 'e';
        String str2 = "";
        
        while (i < str.length()) {

            c1 = str.charAt(i);
            if (c1 >= 'a' && c1 <= 'z') {
            charr = (char) (c1 - 32);
            }
            else {
                charr = c1;
            }
            if (c1 == ' ') {
                charr = ' ';
            }
            str2 = str2 + charr;
            i++;
            

        }
        return str2;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to change 1) a string or 2) character?");
        //Double val = scan.nextDouble();
        System.out.println("Please enter a string to change:");
        String name = scan.nextLine();
        System.out.println("Do you want that in 1) lowercase or 2) uppercase?");
        Double uporlow = scan.nextDouble();
        if (uporlow == 1) {
            //String name2 = name.toUpperCase();
            System.out.println("Here is your string in lowercase:" + myToLowerCase(name));
        }
        else {
            //String name3 = name.toLowerCase();
            System.out.println("Here is your string in uppercase:" + myToUpperCase(name));
        }
        System.out.println("Here are also two chars that can be printed out, any value on the");
        System.out.println("ASCII table can be printed out and any letter can be uppercase/lowercased:");
        System.out.println(toLower('A'));
        //System.out.println(myToLowerCase("HELLO"));
        System.out.println(toUpper('b'));
        //System.out.println(myToUpperCase("hello"));
        scan.close();
    }
}
