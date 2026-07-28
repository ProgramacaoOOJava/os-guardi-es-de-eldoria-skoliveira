public abstract class Personagem implements Comparable<Personagem> {
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    // Construtor da classe Personagem
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // Método exibirStatus()
    public void exibirStatus() {
        System.out.println("--- Status do Personagem ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Classe: " + this.classe);
        System.out.println("Nível: " + this.nivel);
        System.out.println("Pontos de Vida: " + this.pontosDeVida);
        System.out.println("Poder Base: " + this.poderBase);
    }

    public abstract void usarHabilidadeEspecial();

    @Override
    public int compareTo(Personagem outro) {
        return Integer.compare(this.nivel, outro.nivel);
    }

    @Override
    public String toString() {
        return nome + " - " + nivel;
    }
}
