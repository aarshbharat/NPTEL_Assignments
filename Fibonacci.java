import java.util.Scanner; //This package for reading input
public class Fibonacci { 
    
    public static void main(String args[]) { 
	 Scanner sc = new Scanner(System.in);
	 int n=sc.nextInt(); //Read an integer
        System.out.println(fib(n)); //Generate and print the n-th Fibonacci                
                                     //number
    } 
 static int fib(int n) {
     int a = 0;
     int b = 1; 
     int c=0;
     int i;
        if (n==1)
            return 0;
        
        else if (n==2) 
            return 1;
        
        else{
            for(i=0;i<n-2;i++){
                c = a + b;
                a=b;   
                b=c;
            }
       }
       return c; 
    }
}