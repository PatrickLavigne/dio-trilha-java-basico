import java.util.Locale;
import java.util.Scanner;

public class LogicaCondicionadores{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        int i1 = 10;
        int i2 = 20;

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

        float salarioMinimo = 1.200f;
        float salarioFuncionario = 1.500f;

        if ((salarioMinimo > salarioFuncionario) && (salarioMinimo > salarioFuncionario) ){
            System.out.println("Vai receber bolsa auxilio");
        }
        if ((salarioMinimo < salarioFuncionario) && (salarioMinimo < salarioFuncionario)){
            System.out.println("Não vai receber auxilio");
        }
        }
        int dia = 28;

        if ((dia >= 1) && ( dia <= 10)){
            System.out.println("Está longe do aniversário da Ísis. ");
        } else if ((dia >=11 )&&(dia <= 20 )){
            System.out.println("Está longe do aniversário da Ísis!");
        } else if ((dia >=21) && (dia <=31)){
            System.out.println(" ALEGRIA Estamos na semana do aniversário da Ísis!");
        }
        
        switch (dia){
            
            case 10:
                System.out.println("Dia 10, não é aniversário da Ísis!");
                break;
            case 20:
                System.out.println("Dia 20, estamso perto do aniversário da Ísis!");
                break;
            case 28:
                System.out.println("Parabéns filha, 1 aninho já");
                break;
        }

        }
    }