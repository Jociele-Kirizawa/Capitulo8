package ImpostodeRenda;



public class IRTesta {
    public static void main(String[] args) {



        PessoaFisica[] pessoaFisicas = new PessoaFisica[3];
        PessoaJuridica[] pessoaJuridicas = new PessoaJuridica[3];
        System.out.println(" ");

        pessoaFisicas[0]= new PessoaFisica("Lucas",1400);
        System.out.println(pessoaFisicas[0].impostoFisica(1400));
        System.out.println(" ");

        pessoaFisicas[1]= new PessoaFisica("Bia", 2900);
        System.out.println(pessoaFisicas[1].impostoFisica(2900));
        System.out.println(" ");

        pessoaFisicas[2]= new PessoaFisica("Carlos",3600.01);
        System.out.println(pessoaFisicas[2].impostoFisica(3600.01));
        System.out.println(" ");

        pessoaJuridicas[0]= new PessoaJuridica("Fran", 1000000);
        System.out.println(pessoaJuridicas[0].impostoJuridico(1000000));
        System.out.println(" ");

        pessoaJuridicas[1]= new PessoaJuridica("Jr", 2000000);
        System.out.println(pessoaJuridicas[1].impostoJuridico(2000000));
        System.out.println(" ");

        pessoaJuridicas[2]= new PessoaJuridica("Gustavo", 3000000);
        System.out.println(pessoaJuridicas[0].impostoJuridico(3000000));
        System.out.println(" ");

        }
    }

