public enum ClassesEnum {

    Mago(1, "Mago"),
    Barbaro(2, "Bárbaro"),
    Bardo(3, "Bardo");

    private int id;
    private String nomeClasse;

    ClassesEnum(int id, String nome){
        this.id=id;
        this.nomeClasse=nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeClasse() {
        return nomeClasse;
    }

    public void setNomeClasse(String nomeClasse) {
        this.nomeClasse = nomeClasse;
    }
}
