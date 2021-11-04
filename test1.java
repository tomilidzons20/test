import java.util.Scanner;

//zad1

public class test1 {

    public static void showPrimes(int[] list){
        for(int i = 0; i < list.length; i++){
            if(list[i] > 1){
                for(int j = 2; j < list[i]; j++){
                    if(list[i] % j == 0){
                        break;
                    }
                }
                System.out.print(list[i] + ", ");
            }
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe naturalna n");
        int n = in.nextInt();
        int[] tab = new int[n];
        System.out.println("Podawaj liczby naturalne");
        for(int i = 0; i < n; i++){
            tab[i] = in.nextInt();
        }
        showPrimes(tab);
        in.close();
    }
}

//zad2

import java.util.Scanner;
import java.util.Random;

public class test2 {

    public static void max(int[] tab){
        int max = tab[0];
        int count = 0;
        for(int i = 1; i < tab.length; i++){
            if(tab[i] > max){
                count = 0;
                max = tab[i];
            }
            if(tab[i] == max){
                count++;
            }
        }
        System.out.println("\nNajwiekszy element: " + max);
        System.out.println("Ilosc jego wystapien: " + count);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe naturalna n");
        int n = in.nextInt();
        int[] tab = new int[n];
        for(int i = 0; i < n; i++){
            tab[i] = new Random().nextInt(100) - 50;
            System.out.print(tab[i] + " ");
        }
        max(tab);
        in.close();
    }
}

//zad3

import java.util.Scanner;

public class test3 {

    public static String delete(String str, char c){
        int count = 1;
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(count != 1 && arr[i] == c){
                arr[i] = 0;
                //arr[i] = ' ';
            }
            if(count == 1 && arr[i] == c){
                count++;
            }
        }
        String str2 = new String(arr);
        // str2 = str2.replace(" ", "");
        return str2;
    }
    public static void main(String[] args){
        System.out.println("Podaj napis");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println("Podaj znak");
        char c = in.next().charAt(0);
        System.out.println(delete(str, c));
        in.close();
    }
}

