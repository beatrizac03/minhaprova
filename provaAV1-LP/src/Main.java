import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scn = new Scanner(System.in);
        int opcao = 1;

        ArrayList<Jogador> arrayJogadores = new ArrayList<Jogador>();
        System.out.println("BEM VINDO AO SISTEMA BBB");
        do {
            System.out.println(" 1 - Listar jogadores BBB");
            System.out.println(" 2 - Votação BBB");
            System.out.println(" 3 - Apuração votos BBB");
            System.out.println(" 0 - Sair");
            System.out.print("Opção: ");
            opcao = scn.nextInt();


                cadastrarJogador(arrayJogadores);
            if (opcao == 1) {
                listarJogadores(arrayJogadores);
            } else if (opcao == 2) {
                votacao(arrayJogadores);
            } else if (opcao == 3) {
                resultadoVotacao(arrayJogadores);
            }

        } while (opcao != 0);


    }

    public static void cadastrarJogador(ArrayList<Jogador> arrayJogadores) {
//        Scanner s = new Scanner(System.in);
//
//        String nome;
//
//        System.out.print("Nome: ");
//        nome = s.nextLine();
//
//        Jogador objJogador = new Jogador(nome);
//        arrayJogadores.add(objJogador);

        arrayJogadores.add(new Jogador("Beatriz Reis"));
        arrayJogadores.add(new Jogador("Alane Dias"));
        arrayJogadores.add(new Jogador("Davi Brito"));
        arrayJogadores.add(new Jogador("Deniziane Ferreira"));
        arrayJogadores.add(new Jogador("Fernanda Bande"));
    }

    public static void listarJogadores(ArrayList<Jogador> arrayJogadores) {
//        System.out.println(arrayJogadores.toString());

        for (Jogador obj : arrayJogadores) {
            System.out.println(obj.toString());
        }
    }

    public static void votacao(ArrayList<Jogador> arrayJogadores) {
        Scanner read = new Scanner(System.in);
        System.out.println("Em quem você vota pra sair da casa?");
        String jogadorEscolhido = read.nextLine();
        int n = arrayJogadores.size();

//        for(int i = 0; i < n; i++) {
//            if (arrayJogadores.get(i).nome == jogadorEscolhido) {
//                arrayJogadores.get(i).incrementaUmVoto();
//            }
//        }
        for (Jogador obj : arrayJogadores) {
            if(obj.getNome().equals(jogadorEscolhido)) {
                obj.incrementaUmVoto();
                System.out.println("INCREMENTOU");
            }
        }
    }

    public static void resultadoVotacao(ArrayList<Jogador> arrayJogadores) {
        System.out.println("RESULTADO DA VOTAÇÃO");
        int maiorQtdeDeVotos = arrayJogadores.get(0).getVotos();

        int n = arrayJogadores.size();
//        for(int i = 0; i < n; i++) {
//            if (arrayJogadores.get(i).votos > maiorQtdeDeVotos) {
//                maiorQtdeDeVotos = arrayJogadores.get(i).votos;
//            }
//        }
        for (Jogador obj : arrayJogadores) {
            if(obj.getVotos() > maiorQtdeDeVotos) {
                maiorQtdeDeVotos = obj.getVotos();
            }
        }

        String jogadorQueSaira = "";

        for (Jogador obj : arrayJogadores) {
            if(obj.getVotos() == maiorQtdeDeVotos) {
                jogadorQueSaira = obj.getNome();
            }
        }
        System.out.println(jogadorQueSaira);

        System.out.println("Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami, se eu conseguir\n" +
                "domar o sol, se eu conseguir fazer o mar virar sertão, e o sertão virar mar, se eu\n" +
                "conseguir dizer o que eu nunca vou conseguir dizer, aí terá chegado o dia em que eu\n" +
                "vou conseguir te eliminar com alegria. Com **X** votos, é você quem sai: " + jogadorQueSaira);
    }
}