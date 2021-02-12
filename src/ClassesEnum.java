import classes.Barbaro;
import classes.Bardo;
import classes.Classe;
import classes.Mago;

import java.lang.reflect.InvocationTargetException;

public enum ClassesEnum implements AbstractEnum{

    Mago(1, "Mago", classes.Mago.class),
    Barbaro(2, "Bárbaro", classes.Barbaro.class),
    Bardo(3, "Bardo", classes.Bardo.class);

    private Integer id;
    private String nomeClasse;
    private Class type;

    ClassesEnum(Integer id, String nome, Class type ){
        this.id=id;
        this.nomeClasse=nome;
        this.type=type;
    }

    @Override
    public String toString() {
        return this.getNomeClasse();
    }

    public Integer getId() {
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

    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }

    public static Classe buscarClassePorEnum(ClassesEnum enumm) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        return (Classe) enumm.getType().getDeclaredConstructor().newInstance();
    }
    public static ClassesEnum buscarEnumPorId(Integer valor){
        return (ClassesEnum) AbstractEnum.getEnumById(valor, ClassesEnum.values());
    }
}
