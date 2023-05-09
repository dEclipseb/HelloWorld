import java.util.Scanner;

public class HelloWorld {

    static int add(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello World");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(add(a,b));
    }
}