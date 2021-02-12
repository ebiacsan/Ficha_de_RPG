import classes.Barbaro;
import classes.Bardo;
import classes.Classe;
import classes.Mago;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {
    static Scanner e = new Scanner(System.in);
    public static void main(String[] args) {
        Player player = new Player();
        Integer valorRecebido ;
        while(true){
            try {
                System.out.println("Com qual classe gostaria de jogar?");
                for (ClassesEnum a :ClassesEnum.values()){
                    System.out.println("["+ a.getId()+"] - "+a.getNomeClasse());
                }
                valorRecebido =  e.nextInt();
                player.setClassePlayer(ClassesEnum.buscarClassePorEnum(ClassesEnum.buscarEnumPorId(valorRecebido)));
                break;
            }catch (Exception exception){
                continue;
            }
        }
        while (true){
            try {
                System.out.println("Com qual classe gostaria de jogar?");
                for (RacasEnum b : RacasEnum.values()){
                    System.out.println("["+ b.getId()+"] - "+b.getNomeRaca());
                }
                valorRecebido =  e.nextInt();
                player.setRacaPlayer(RacasEnum.buscarRacaPorEnum(RacasEnum.buscarEnumPorId(valorRecebido)));
                break;
            }
            catch(Exception exception){
                continue;
            }
        }
        System.out.println(player);
    }
}
