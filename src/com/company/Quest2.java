package com.company;


public class Quest2 {

    public void power (int a, int n) // parameters: n - num of iteration, a - degree of
    {
        System.out.println("-------1-------");
        int pow = 1;
        for (int i = 1; i <= n; i++)
        {
            pow *= a;
            System.out.println(a + "^" + i + " = " + pow);
        }
    }

    public int fact(int n) {
        System.out.println("-------2-------");
        int factorial = 1;
        if ( n < 1 )
            System.out.println("zero or negative. Error!");
        else
            for (int i = 1; i <= n; i++)
                factorial = factorial*i;

        return factorial;
    }


    public void sumDifMulti (int a, int b) {
        System.out.println("-------3-------");
        int sum, dif, multi;
        sum = a + b;
        dif = a - b;
        multi = a * b;
        System.out.println("Sum = " + sum +
                "\nDifference = " + dif +
                "\nMultiply = " + multi);
    }

    public void timeHight (int h) {
        System.out.println("-------4-------");
        final int g = 10;  // g = 9.81 м/с - ускорение свободного падение тела
        int t = 0;
        t = Math.sqrt(2*h/g);
        System.out.println("Free fall time is " + t);
    }

    public void lengthCatet (int c, int a) {
        System.out.println("-------5-------");
        int b = 0;
        if (c < 0 && a < 0)
            System.out.println("Sorry, but this is negative number.");
        else
        {
            b = Math.abs(a*a + c*c);
            System.out.println("length is " + b);
        }

    }


    public static void main (String[] args) {
        Quest2 myQuest2 = new Quest2();

        myQuest2.power(2, 9);
        System.out.println(myQuest2.fact(10));
        myQuest2.timeHight(100);
        myQuest2.sumDifMulti(2,2);
        myQuest2.lengthCatet(2,3);
    }
}
