import java.util.Locale;
import java.util.Scanner;

public class LogicaCondicionadores{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        boolean b1 = true;
        boolean b2 = false;

        if(i1==i2){
            System.out.println("Não é verdadeiro");
        }
        if (i1 != i2){
            System.out.println("É verdadeiro, são diferentes");
        }
        if (i1 > i2){
            System.out.println("Não é maior");
        }
        if (i1 <= i2){
            System.out.println("É maior!");
        }
    }
}