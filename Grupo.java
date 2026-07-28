import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Grupo {
    private String nomeDoGrupo;
    private List<Personagem> membros;

    public Grupo(String nomeDoGrupo) {
        this.nomeDoGrupo = nomeDoGrupo;
        this.membros = new ArrayList<>();
    }

    public String getNomeDoGrupo() {
        return this.nomeDoGrupo;
    }

    public void adicionarMembro(Personagem personagem) {
        this.membros.add(personagem);
    }

    public void listarMembros() {
        System.out.println("\n--- Membros do Grupo " + nomeDoGrupo + " ---");
        for(Personagem p : membros) {
            System.out.println(p);
        }
        System.out.println("---------------------------");
    }

    public void batalhar(Personagem p1, Personagem p2) {
        System.out.println("\n--- INICIO DA BATALHA ---");
        double poderTotalP1 = p1.nivel * p1.poderBase;
        double poderTotalP2 = p2.nivel * p2.poderBase;

        System.out.println(p1.nome + " Poder Total: " + String.format("%.2f", poderTotalP1));
        System.out.println(p2.nome + " Poder Total: " + String.format("%.2f", poderTotalP2));

        if(poderTotalP1 > poderTotalP2) {
            System.out.println(p1.nome + " venceu!");
        }
        else if(poderTotalP1 < poderTotalP2) {
            System.out.println(p2.nome + " venceu!");
        }
        else {
            System.out.println("Empatou!");
        }
        System.out.println("--- FIM DA BATALHA ---");
    }

    public void ordenarMembrosPorNivel() {
        Collections.sort(membros);
        System.out.println("Membros do grupo " + nomeDoGrupo + " ordenados por nível");
    }

    public List<Personagem> getMembros() {
        return membros;
    }

}
