package JavaInter30_09;

import java.util.Scanner;

public class HappyNumber {
    //return sum of squar n
//    public static class HappyNumber {
        static  int numSquqarSum(int n){
            int squarSum=0;
            while (n!=0){

                squarSum +=(Math.pow((n%10),2));
                n /= 10 ;

            }
            return  squarSum;
        }
//Rrturn if n Is Happy

        static boolean isHappy(int n){
            int yes ,no ;
            yes = no = n;
            do {
                yes = numSquqarSum(yes);
                no = numSquqarSum(numSquqarSum(no));

            }while (yes != no);

            return (yes==1);
        }


        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter a Number to Checking: ");
            int nummer = input.nextInt();





            if(isHappy(nummer)) // If isHappy True is.
                System.out.println(nummer+" Is a Happy Number");

            else
                System.out.println(nummer +" Is a Un Happy Number");


        }
    }

//}
