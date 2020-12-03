// import java.io.*;
// import java.util.*;

public class Main {
    public static void getAllSubString(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // select and remove first charactor from main string and append that character
        // to ans
        getAllSubString(str.substring(1), (ans + str.charAt(0)));
        // don't select any character from main string
        getAllSubString(str.substring(1), ans);
    }

    static void printValidParenthesis(char str[], int pos, int n, int open, int close) 
    { 
        if(close == n)  
        { 
            // print the possible combinations 
            for(int i=0;i<str.length;i++) 
                System.out.print(str[i]); 
            System.out.println(); 
            return; 
        } 
        else
        { 
            if(open > close) { 
                str[pos] = '}'; 
                printValidParenthesis(str, pos+1, n, open, close+1); 
            } 
            if(open < n) { 
                str[pos] = '{'; 
                printValidParenthesis(str, pos+1, n, open+1, close); 
            } 
        } 
    } 
    public static void main(String args[]) {
        // String s="abc";
        // getAllSubString(s,"");
        int n=5;
        char arr[]=new char[2*n];
        //n should be greater than 0
        printValidParenthesis(arr, 0, n, 0, 0);

    }

}
