public class TestaSemaforo {
    public static void main(String[] args) {
        for (Semaforo x : Semaforo.values()){
            System.out.println(x + " comprimento e luz " + x.getTempo());
        }
    }
}
