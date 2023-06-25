package demo_git_hub;

import java.util.Scanner;

public class test1 {

	public static  void main(String[] arg)
	{
	
	int i;
	int n;
	System.out.println("Enter the value of n");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	
	for (i = 1; i <= n; i++) 
    {
        for (int j = 1; j <= i; j++)
        {
            System.out.print("*"+" ");
        }
         
        System.out.println();
    }
     			
	}
}
