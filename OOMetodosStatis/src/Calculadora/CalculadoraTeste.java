package Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.multiplicar(3,5));
        System.out.println(calculadora.somar(3,5));
        System.out.println(calculadora.dividir(3,5));
        System.out.println(calculadora.potencia(3,2));
        System.out.println(calculadora.fatorial(5));
    }


}

/*Escreva	uma	classe	Calculadora	que	tenha	os seguintes	métodos:	somar,
subtrair,	multiplicar,	dividir (dois	números),	elevar	à	potência	n.
Desenvolva	um	programa	para	testar	essa	classe.
3. Escreva	um	método	para	calcular	factorial	de	um	número	na	classe*/