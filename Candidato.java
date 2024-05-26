package processoSeletivo;
public class Candidato {
	    private String nome;
	    private int idade;
	    private String email;
	    private boolean experiencia;

	    public Candidato(String nome, int idade, String email, boolean experiencia) {
	        this.nome = nome;
	        this.idade = idade;
	        this.email = email;
	        this.experiencia = experiencia;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public int getIdade() {
	        return idade;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public boolean temExperiencia() {
	        return experiencia;
	    }

	    @Override
	    public String toString() {
	        return "Candidato{" +
	                "nome='" + nome + '\'' +
	                ", idade=" + idade +
	                ", email='" + email + '\'' +
	                ", experiencia=" + experiencia +
	                '}';
	    }
	}

