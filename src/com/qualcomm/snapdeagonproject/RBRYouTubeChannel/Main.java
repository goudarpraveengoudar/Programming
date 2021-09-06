package com.qualcomm.snapdeagonproject.RBRYouTubeChannel;
class Sum {
    public int sum (int a, int b ) {
        return a + b;
    }
        public int multi (int q, int r , int s){

        return q*r*s;
    }

}
public class Main {
    public static void main (String [] args){

        Sum sumObj = new Sum();
        int sum =sumObj.sum(999,859);
        System.out.println("Sum is :\t\t\t\t\t " + sum);

        Sum mulObj = new Sum();
        int multi = mulObj.multi(5,9,10);
        System.out.println("Multiplication of three:\t"  +   multi);

  Double d = new Double();
  d.x = 10;
  doubleNumber(d);
        System.out.println(d.x);

        }
    private static void doubleNumber (Double d){
        d.x = 2*d.x;

    }

}
