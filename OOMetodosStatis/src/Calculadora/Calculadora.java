package Calculadora;

public class Calculadora {

       public static int somar(int a, int b){
        return a+b;
    }
   public static int multiplicar (int a, int b){
          return a*b;

    }
   public static int dividir (int a, int b){
          return a/b;
    }
    public static int potencia (int a, int b){
           int total=1;
           for (int i = 1; i <= b; i++){
               total*=a;
           }
          return total;
    }
    public static int fatorial (int a){

           int resposta=1;
           for (int i = a; i > 1; i--) {
               resposta *=i;
           }
           return resposta;


    }

}
