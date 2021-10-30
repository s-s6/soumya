1)Infinite loop using for loop

class usingforloop {
    public static void main(String args[]){
         for(int i=1; i>=1; i++){
              System.out.println("The value of i is: "+i);
         }
    }
}



2)Infinite loop using while loop

class usingwhileloop {
   public static void main(String args[]){
         int i=5;
         while(i>=1)
    {
      System.out.println(i);
      i++;
    }
     }
      }


3)Infinite loop using do while loop

  class usingdowhileloop {
    public static void main(String args[]){
             int i=1;
          do{
              System.out.println(i);
                i--;
            }(i<=1);
           }
          }



  -------using break statement----------
     class Main {
    public static void main(String args[]){
         for(int i=1; i>=1; i++){
             if(i==500)
             {
                 break;
             }
              System.out.println("The value of i is: "+i);
         }
    }
}



 ----------using continue statement-----------
class Main {
    public static void main(String args[]){
         for(int i=0; i<=15; i++){
             if(i%2==0)
             {
                 continue;
             }
              System.out.println("Numbers are: "+i);
         }
    }
}

exercise programs of 26th:-
1)sum of n numbers

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int n,i,sum;
		System.out.println("enter n value:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		sum=0;
		for(i=1;i<=n;i++)
		{
		    sum=sum+i;
		}
		System.out.println("SUM="+sum);
	}
}


// Pgm to check for palindrome

import java.util.*;
public class Main{
    public static void main (String[] args) {
        System.out.println("Enter your number - ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int temp = num;
        int sum = 0 , remainder;
        while (num!=0){
            remainder = num%10;
            sum = sum*10 + remainder;
            num = num/10;
        }
        if (temp == sum) 
            System.out.println("The number entered is a palindrome");
        else
            System.out.println("The number entered is not a palindrome");
    }
}



   // Pgm to print all the numbers divisble by 10 b/w 0 to 1000
 
public class Main{
    public static void main(String args[]){
        for (int i=0; i<=1000 ; i++ )
        {
            if (i%10 == 0){
                System.out.println(i);
            } 
        }
    }
}
