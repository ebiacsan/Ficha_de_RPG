import classes.Classe;
import racas.Raca;

public class Player {
    private Classe classePlayer;
    private Raca racaPlayer;

    public Raca getRacaPlayer() {
        return racaPlayer;
    }

    public void setRacaPlayer(Raca racaPlayer) {
        this.racaPlayer = racaPlayer;
    }

    public Classe getClassePlayer() {
        return classePlayer;
    }

    public void setClassePlayer(Classe classePlayer) {
        this.classePlayer = classePlayer;
    }
}
