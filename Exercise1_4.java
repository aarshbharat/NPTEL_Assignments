//Armstrong Number Testing
import java.util.Scanner;
class Exercise1_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result=0;
        int a,b,c=0;
        b = n;
    
        while(n>0){
            a = n%10;
            c=c+(a*a*a);  
            n = n/10;
           
        }
        if (c != b) {
          
            System.out.println(result);

        }
        else{
          result = 1;
            System.out.println(result);
        }
    }

}