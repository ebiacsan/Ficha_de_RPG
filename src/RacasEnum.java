import racas.Raca;

import java.lang.reflect.InvocationTargetException;

public enum RacasEnum implements AbstractEnum {
    Humano(1, "Humano", racas.Humano.class),
    MeioElfo(2, "Meio Elfo", racas.MeioElfo.class);

    private int id;
    private String nomeRaca;
    private Class type;

    RacasEnum(int id, String nome, Class type){
        this.id=id;
        this.nomeRaca=nome;
        this.type=type;
    }

    public Integer getId() {
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

    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }

    public static RacasEnum buscarEnumPorId(Integer value){
        return (RacasEnum) AbstractEnum.getEnumById(value, RacasEnum.values());
    }

    public static Raca buscarRacaPorEnum(RacasEnum enumm) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return (Raca) enumm.getType().getDeclaredConstructor().newInstance();
    }
}
