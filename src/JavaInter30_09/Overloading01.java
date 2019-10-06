package JavaInter30_09;

public class Overloading01 {
    public static void main(String[] args) {

        int x = 10;
        int y = 15;
        int t = 75;
        double z = 15.5;
        double w = 175.37;

        int result = minfunc(x ,y);
        System.out.println(result);

        double result2 = minfunc(z , w);
        System.out.println(result2);

        int resultmax = minfunc(x , y , t);
        System.out.println(resultmax);




    }

    public static int minfunc(int a , int b) {
        int min ;

        if (a < b) {
             min = a;

        } else {
             min = b;

        }
        return min;

    }

public  static double minfunc(double a , double b){
        double min;

        if (a<b){
            min = a;

        }else {
             min = b;

        }
    return min;
}

    public  static  int minfunc(int a , int b , int c){
        int max;
        if (a > b && a > c){
            max = a;
        }else if (b > a && b > c){
            max = b;
        }else {
            max = c;
        }
        return max;
    }

}




