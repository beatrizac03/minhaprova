public class Jogador {
    private String nome;
    private int votos;

    public Jogador(String nome) {
        this.nome = nome;
    }
    public Jogador(String nome, int votos) {
        this.nome = nome;
        this.votos = votos;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public void incrementaUmVoto() {
        this.votos = getVotos() + 1;
    }

    @Override
    public String toString() {
        return "Jogador: " + "nome='" + nome;
    }

}
