package processoSeletivo;
import java.util.ArrayList;
import java.util.List;

public class ProcessoSeletivo {
    private List<Candidato> candidatos;

    public ProcessoSeletivo() {
        this.candidatos = new ArrayList<>();
    }

    public void adicionarCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }

    public List<Candidato> validarCandidatos() {
        List<Candidato> candidatosValidos = new ArrayList<>();
        for (Candidato candidato : candidatos) {
            if (validarCandidato(candidato)) {
                candidatosValidos.add(candidato);
            }
        }
        return candidatosValidos;
    }

    private boolean validarCandidato(Candidato candidato) {
        return candidato.getIdade() >= 18 && candidato.temExperiencia();
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }
}