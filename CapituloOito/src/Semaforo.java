public enum Semaforo {

        VERDE(2), AMARELO(1), VERMELHO(4);

         private Semaforo(int tempo){ //construtor
            this.tempo = tempo;
        }
       private final int tempo;


    public int getTempo() {
        return tempo;
    }
}
