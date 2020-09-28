public enum RacasEnum {
    Humano(1, "Humano"),
    MeioElfo(2, "Meio Elfo");

    private int id;
    private String nomeRaca;

    RacasEnum(int id, String nome){
        this.id=id;
        this.nomeRaca=nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeRaca() {
        return nomeRaca;
    }

    public void setNomeRaca(String nomeRaca) {
        this.nomeRaca = nomeRaca;
    }
}
