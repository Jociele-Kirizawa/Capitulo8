package Agenda;

public class Agenda {
    private String nome;
    private Contato[] contatos;

    public String Status(){
        if (contatos != null) {

            for (Contato c: contatos){
                nome += c.Status();
            }
        }
        return  "Nome: "+ nome;
    }

    public Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public Agenda(String nome) {
        this.nome = nome;
    }
    public Agenda(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

