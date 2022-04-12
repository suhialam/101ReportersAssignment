/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nabeel Qureshi
 */
public class Question2a {
    static boolean isFibbinaryNum(int n) {
     
        
        if ((n & (n >> 1)) == 0)
            return true;
       
        return false;
    }
   
    public static void main(String[] args) {
 
        int n = 10;
 
        if (isFibbinaryNum(n) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
