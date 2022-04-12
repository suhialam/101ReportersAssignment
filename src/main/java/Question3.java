/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nabeel Qureshi
 */
public class Question3 {
    static long sum(int n)
    {
 
        
        if (n == 1)
            return 1;
        else
 
            
            return ((long)Math.pow(n, n) + sum(n - 1));
    }
 
    
    public static void main(String args[])
    {
        for(int n =1; n<=6; n++)
        System.out.println(sum(n));
    }
}
