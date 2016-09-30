package Beginning;

/**
 * Created by ovo on 19.09.2016.
 */
public class Questions {
    public static void question2(){
        int i=2;
        if (i<1) {
            System.out.println("A");
        } else if (i<2) {
            System.out.println("B");
        } else if (i<3) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }

    public static void question3(){
        double i=1.1;
        System.out.print(i);
        while (i<1) {
            System.out.print(" " + i);
            i=i+1;
        }
    }

    public static void question4(){
        double i=1.1;
        System.out.print(i);
        do {
            System.out.print(" " + i);
            i=i+1;
        } while (i<1);

    }

    public static void question5(){
        for (int i=0; i<5; i++) {
            System.out.print((i+1) + " ");
        }

    }

    public static void question6(){
        int i=2;
        System.out.print(i++);
        System.out.print(" " + ++i);

    }

    public static void question7(){
        int i=2;
        label1:
        {
            if (i == 0) {
                System.out.println(" 0");
                break label1;
            }

            if (i > 0) {
                System.out.println(" " + i--);
                break label1;
            }
        }

    }

    private static void question8(){}

    public void question9(){}

    public static void question10(){
        int i=10;
        int j=4;
        System.out.print(i/j);
        System.out.print(" " + (double)(i/j));
        System.out.print(" " + 1.0*i/j);

    }

    public static void question11(){
        String s1="abc";
        String s2= new String("abc");
        System.out.print((s1 == s2));
        System.out.print(" " + s1.equals(s2));

    }

    public static void question12(){
        String s1="abcdefgh";
        String s2= s1.substring(1,2);
        System.out.print(s2);

    }

    public static void question13(){
        String s1="abcdefgh";
        System.out.print(s1.charAt(2));

    }

    public static void question14(){
        int[] a = {1, 2, 3, 4, 5};
        //System.out.print(a[1]+a[2]);
        //System.out.print(a[1]);
        //System.out.print(a[2]);
        String x = Integer.toString(a[1]);
        String y = Integer.toString(a[2]);
        System.out.println(x+y);

    }



}
