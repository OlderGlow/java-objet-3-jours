import java.util.ArrayList;
import java.util.List;

public abstract class Forme {

    public String getNom() {
        return this.getClass().getSimpleName();
    }

    abstract double aire();

    abstract double perimetre();

    @Override
    public String toString() {
        return "Forme : ";
    }
}
