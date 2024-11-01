import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int min = Math.min(n, m);

        int a = 1, b;
        for(int i = 2; i <= min; i++){
            while(n % i == 0 && m % i == 0){
                a *= i;
                n /= i;
                m /= i;
            }
        }
        b = a * m * n;
        System.out.println(a);
        System.out.println(b);
    }
}
