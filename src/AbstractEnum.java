import java.util.List;

public interface AbstractEnum {

    static AbstractEnum getEnumById(Integer id, AbstractEnum[] listaValores){
        for (AbstractEnum value : listaValores) {
            if(value.getId().equals(id)){
                return value;
            }
        }
        return null;
    }

    Integer getId();
}
