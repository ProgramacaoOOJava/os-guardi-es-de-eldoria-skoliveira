public class Main {
    public static void main(String[] args) {
        // Criando personagens
        Guerreiro arthus = new Guerreiro("Arthus", 5, 150, 12.0, 8.0);
        Mago morgana = new Mago("Morgana", 7, 100, 15.0, 10.0);
        Guerreiro borin = new Guerreiro("Borin", 3, 120, 10.0, 6.0);
        Mago elara = new Mago("Elara", 6, 90, 14.0, 9.0) ;
        
        // Criando grupos
        Grupo grupoA = new Grupo("Os Vingadores");
        grupoA.adicionarMembro(arthus);
        grupoA.adicionarMembro(elara);
        Grupo grupoB = new Grupo("Os Destemidos");
        grupoB.adicionarMembro(morgana);
        grupoB.adicionarMembro(borin);

        // Listando membros dos grupos
        grupoA.listarMembros();
        grupoB.listarMembros();

        // Ordenar membros por nível
        grupoA.ordenarMembrosPorNivel();
        grupoB.ordenarMembrosPorNivel();

        // Listando membros dos grupos
        grupoA.listarMembros();
        grupoB.listarMembros();

        // Simulação de batalhas
        System.out.println("\n--- Batalha ---");
        grupoA.batalhar(grupoA.getMembros().get(0), grupoB.getMembros().get(0));
        grupoA.batalhar(grupoA.getMembros().get(1), grupoB.getMembros().get(1));
    }
}
