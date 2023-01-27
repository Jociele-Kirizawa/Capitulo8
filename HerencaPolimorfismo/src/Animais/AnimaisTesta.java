package Animais;

public class AnimaisTesta {
    public static void main(String[] args) {


        Peixe tubarao = new Peixe("tubarão", 300, 0, "Cinza", "mar", 1.5, "Cauda e basbatanas");
        System.out.println(tubarao.toString());
        System.out.println();

        Mamifero urso = new Mamifero("Urso", 180, 4, "vermelho", "Terra", 0.5, "mel");
        System.out.println(urso.toString());
        System.out.println();

        Animal camelo = new Animal("Camelo", 150, 4, "Amarelo", "terra", 2.0);
        System.out.println(camelo.toString());

        Animal teste = new Mamifero();
        teste.se

    }
}
