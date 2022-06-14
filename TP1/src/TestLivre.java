import java.time.LocalDate;
import java.time.Month;

public class TestLivre {
    public static void main(String[] args) {
        Livre livre = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 9.99f, 320, 978747543628L, LocalDate.of(1942, Month.JANUARY, 1));
        System.out.println(livre);
    }
}