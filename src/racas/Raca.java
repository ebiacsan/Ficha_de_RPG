package racas;

public class Raca {
    private String nome;
    private String descricao;
    private Integer idadeMaxima;
    private BeneficiosDeRaca beneficios;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getIdadeMaxima() {
        return idadeMaxima;
    }

    public void setIdadeMaxima(Integer idadeMaxima) {
        this.idadeMaxima = idadeMaxima;
    }

    public BeneficiosDeRaca getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(BeneficiosDeRaca beneficios) {
        this.beneficios = beneficios;
    }
}
