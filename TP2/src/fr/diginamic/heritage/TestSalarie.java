package fr.diginamic.heritage;

public class TestSalarie {
    public static void main(String[] args) {
        Individu am = new Individu("Aurélien", "Martineau");
        System.out.println("Individu =" + am);
        Salarie ak = new Salarie("Alain", "Kerlero", 5000);
        System.out.println("Individu : " + am);
        System.out.println("Salarie : " + ak);
    }
}
