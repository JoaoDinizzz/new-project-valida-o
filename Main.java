package processoSeletivo;
public class Main {
    public static void main(String[] args) {
        ProcessoSeletivo processo = new ProcessoSeletivo();

        Candidato candidato1 = new Candidato("Alice", 25, "alice@example.com", true);
        Candidato candidato2 = new Candidato("Bob", 17, "bob@example.com", false);
        Candidato candidato3 = new Candidato("Carlos", 30, "carlos@example.com", true);
        Candidato candidato4 = new Candidato("Diana", 22, "diana@example.com", false);

        processo.adicionarCandidato(candidato1);
        processo.adicionarCandidato(candidato2);
        processo.adicionarCandidato(candidato3);
        processo.adicionarCandidato(candidato4);

        System.out.println("Todos os candidatos:");
        for (Candidato candidato : processo.getCandidatos()) {
            System.out.println(candidato);
        }

        System.out.println("\nCandidatos válidos:");
        for (Candidato candidato : processo.validarCandidatos()) {
            System.out.println(candidato);
        }
    }
}