package fr.diginamic.exercice2;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

public class TestStagiaire {
    public static void main(String[] args) {
        Matiere matiere1 = new Matiere("Java", LocalDate.of(2020, 1, 1), 13, "Bonne note");
        Matiere matiere2 = new Matiere("Php", LocalDate.of(2022, 10, 12), 8, "Mauvaise note");
        Matiere matiere3 = new Matiere("C++", LocalDate.of(2021, 1, 1), 19, "Très bonne note");
        Stagiaire stagiaire1 = new Stagiaire("Dupont", "Jean", List.of(matiere1, matiere2, matiere3));

        File file = new File("stagiaire.txt");
        Path path = file.toPath();
        try {
            Files.write(path, stagiaire1.toString().getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
