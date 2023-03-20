public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        
        System.out.println(nomeCompleto);

        int numero = 5;

        numero = - numero;

        System.out.println(- numero);

        System.out.println(numero);

        numero = numero* -1;

        System.out.println(numero);

        numero++;
        System.out.println(numero);

        boolean variavel = true;

        System.out.println(!variavel);

        System.out.println(variavel);
        variavel = !variavel;

        System.out.println(variavel);
    
        int a, b;

        a=6;
        b=6;

        String resultado = "";
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        
        System.out.println(resultado);

        String resultadoo = a==b ? "verdadeiro" : "false";

        System.out.println(resultadoo);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 != numero2;

        System.out.println("numeroUm é igual a numeroDois?" + simNao);

        String nomeUm = "Patrick";
        String nomeDois = "Patrick";

        System.out.println(nomeUm == nomeDois);

        System.out.println(nomeUm.equals(nomeDois));

        boolean condicao1 = true;

        boolean condicao2 = true;

        if(condicao1 && (7 > 4) ){
            System.out.println("As duas condições são verdadeiras");
        
        if(condicao1 || condicao2){
            System.out.println("Uma das condicções é verdadeira");
        }
        
        }

    }
    

    

}
