
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nabeel Qureshi
 */
public class Question1 {
    static int max = 26;
     
    
    static boolean twoStrings(String s1, String s2)
    {
        
        boolean v[]=new boolean[max];
        Arrays.fill(v,false);

        for (int i = 0; i < s1.length(); i++)
            v[s1.charAt(i) - 'A'] = true;
         
        for (int i = 0; i < s2.length(); i++)
            if (v[s2.charAt(i) - 'A'])
            return true;
         
        return false; 
}
    public static void main(String[] args) {
        String str1= "HELLO";
        String str2 = "WORLD";
        if(twoStrings(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
}
