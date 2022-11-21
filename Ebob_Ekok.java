package Giris;
import java.util.Scanner;

public class Ebob_Ekok {
    public static void main(String[] args) {
        Scanner kedi = new Scanner(System.in);

        System.out.print("a1 sayısını girin :");
        int a1 = kedi.nextInt();

        System.out.print("a2 sayısını girin :");
        int a2 = kedi.nextInt();


        int i = 1;
        int ebob = 1;
        int bs = Math.max(a1, a2);


        while(i <= bs){
            if (a1 % i == 0 && a2 % i == 0){
                ebob = i;
            }
            i++;
        }

        System.out.println("ebob: " + ebob);


        int k = 1;
        int ekok = 1;

        while(k <= (a1*a2)){
            if (k % a1 == 0 && k % a2 == 0){
                ekok = k;
                break;
            }
            k++;
        }

        System.out.println("ekok: " + ekok);

    }
}
