import java.util.ArrayList;
import java.util.List;

public abstract class Forme {
    private static List<Forme> formes = new ArrayList<>();

    public static List<Forme> getFormes() {
        return formes;
    }

    public static void addForme(Forme forme) {
        formes.add(forme);
    }

    abstract double aire();
    abstract double perimetre();

    @Override
    public String toString() {
        return "Forme : ";
    }
}
