
package betaexam;

import java.util.Scanner;

public class ArrayMerge {
        
        
    public void Merge()
    {
        Scanner sc=new Scanner(System.in);
        Scanner sd=new Scanner(System.in);
        System.out.print(" Enter the Size of the First Array : ");
        int s1=sc.nextInt();
        System.out.println(" Enter the First Array : ");
        char [] ch1=new char[s1];
        
        System.out.print(" Enter the Size of the Second Array : ");
        int s2=sc.nextInt();
        System.out.println(" Enter the Second Array : ");
         char [] ch2=new char[s2];
        
        for(int i=0;i<s1;i++)
        {
            System.out.println(ch1[i]);
        }
    
        
    }   
    
}
