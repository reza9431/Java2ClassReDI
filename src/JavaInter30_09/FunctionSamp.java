package JavaInter30_09;

 class FunctionSamp {

int a = 10;
int b = 15;
void test(FunctionSamp num1 , FunctionSamp num2){  // Function Class

    num1.a=num1.a*5;
    num2.b= num2.b*num1.a;
}

     public static void main(String[] args) {

         FunctionSamp num1=new FunctionSamp();      // Constructio of Class
         System.out.println(num1.a);                //return the first content od a

         FunctionSamp num2= new FunctionSamp();
         System.out.println(num2.b);

         num1.test(num1 , num2);

         System.out.print((num1.a));
         System.out.println();
         System.out.println((num2.b));

     }


     }






