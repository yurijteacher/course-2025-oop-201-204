package ua.com.kneu.unit2;

public class First {

    static int a = 10;
    static int b = 20;


    public static void main(String[] args) {
//        int a = 5;
//        int b = 7;

        int c = a + b;

//        First.a =
//        this.a =

        System.out.println(c);

        int d = sum(4,5);
        print(d);

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void print(int a){
        System.out.println(a);
    }


}
