public class Main {
    public static void main(String[] args) {
        for (ClassesEnum a :ClassesEnum.values()){
            System.out.println("["+ a.getId()+"] - "+a.getNomeClasse());
        }

        for (RacasEnum b : RacasEnum.values()){
            System.out.println("["+ b.getId()+"] - "+b.getNomeRaca());
        }
    }
}
