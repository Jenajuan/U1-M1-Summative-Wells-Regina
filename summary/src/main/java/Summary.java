public class Summary {
    public static void main(String[] args) {
        int sum1 = total5(1, 2, 3, 4, 5);
        System.out.println(sum1);

        double avg1 = average5(1, 3, 5, 7, 9);
        System.out.println(avg1);

        double lrg1 = largest5(42.0, 35.1, 2.3, 40.2, 15.6);
        System.out.println(lrg1);
    }

    public static int total5(int a, int b, int c, int d, int e) {
        int sum1 = (a + b + c + d + e);
        return sum1;
    }

    public static double average5(double a, double b, double c, double d, double e) {
        double avg1 = ((a + b + c + d + e) / 5);
        return avg1;
    }

    public static double largest5(double a, double b, double c, double d, double e) {
        double lrg1 =a;
        if(a > lrg1)
            lrg1 = a;
        if(b > lrg1)
            lrg1 = b;
        if(c > lrg1)
            lrg1 = c;
        if (d > lrg1)
            lrg1 = d;
        return lrg1;


    }
}


// public static double largest5(double k, double l, double m, double n, double o){
//       double largest5 = k;
//           if(l > largest5)
//               largest5 = l;
//           if(m > largest5)
//               largest5 = m;
//           if(n > largest5)
//               largest5 = n;
//           if (o > largest5)
//               largest5 = o;