package JavaInter30_09;

public class FuncSamp02 {
    public static void main(String[] args) {
        int a = 20;
        int b = 35;

        System.out.println("main a is :" + a + "\nmain b is :" + b);


        function01(a, b);
        arrfunction();
    }

    private static void arrfunction() {         // First Function
        int array;
        int arr[] = new int[]{5, 8, 4, 7};
        for (int i = 0; i < arr.length; i++) {
            array = arr[i];
            System.out.println(array);
        }
    }


    public static void function01(int a, int b) {       //Second Function

        System.out.println("Func a is :" + a + "  Func b is :" + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("Swaped Func a is  :" + a + " \nSwaped Func b is :" + b);

    }


}


