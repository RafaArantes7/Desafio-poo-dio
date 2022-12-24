import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudoIncritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluis = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
    }

    public void progredir() {
    }

    public void calcularTotalXp() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoIncritos() {
        return conteudoIncritos;
    }

    public void setConteudoIncritos(Set<Conteudo> conteudoIncritos) {
        this.conteudoIncritos = conteudoIncritos;
    }

    public Set<Conteudo> getConteudoConcluis() {
        return conteudoConcluis;
    }

    public void setConteudoConcluis(Set<Conteudo> conteudoConcluis) {
        this.conteudoConcluis = conteudoConcluis;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((conteudoIncritos == null) ? 0 : conteudoIncritos.hashCode());
        result = prime * result + ((conteudoConcluis == null) ? 0 : conteudoConcluis.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (conteudoIncritos == null) {
            if (other.conteudoIncritos != null)
                return false;
        } else if (!conteudoIncritos.equals(other.conteudoIncritos))
            return false;
        if (conteudoConcluis == null) {
            if (other.conteudoConcluis != null)
                return false;
        } else if (!conteudoConcluis.equals(other.conteudoConcluis))
            return false;
        return true;
    }

}
