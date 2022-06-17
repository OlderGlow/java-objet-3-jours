import java.awt.*;

public class Couleur {
    private static Color couleur;

    static Color getColorByString(String col) {
        switch (col.toLowerCase()) {
            case "noir" -> couleur = Color.BLACK;
            case "bleu" -> couleur = Color.BLUE;
            case "cyan" -> couleur = Color.CYAN;
            case "gris fonce" -> couleur = Color.DARK_GRAY;
            case "gris" -> couleur = Color.GRAY;
            case "vert" -> couleur = Color.GREEN;
            case "jaune" -> couleur = Color.YELLOW;
            case "gris clair" -> couleur = Color.LIGHT_GRAY;
            case "magneta" -> couleur = Color.MAGENTA;
            case "orange" -> couleur = Color.ORANGE;
            case "rose" -> couleur = Color.PINK;
            case "rouge" -> couleur = Color.RED;
            case "blanc" -> couleur = Color.WHITE;
        }
        return couleur;
    }

    static String getStringByColor(Color col) {
        String couleur = "";
        if (Color.BLACK.equals(col)) {
            couleur = "noir";
        } else if (Color.BLUE.equals(col)) {
            couleur = "bleu";
        } else if (Color.CYAN.equals(col)) {
            couleur = "cyan";
        } else if (Color.DARK_GRAY.equals(col)) {
            couleur = "gris fonce";
        } else if (Color.GRAY.equals(col)) {
            couleur = "gris";
        } else if (Color.GREEN.equals(col)) {
            couleur = "vert";
        } else if (Color.YELLOW.equals(col)) {
            couleur = "jaune";
        } else if (Color.LIGHT_GRAY.equals(col)) {
            couleur = "gris clair";
        } else if (Color.MAGENTA.equals(col)) {
            couleur = "magneta";
        } else if (Color.ORANGE.equals(col)) {
            couleur = "orange";
        } else if (Color.PINK.equals(col)) {
            couleur = "rose";
        } else if (Color.RED.equals(col)) {
            couleur = "rouge";
        } else if (Color.WHITE.equals(col)) {
            couleur = "blanc";
        }
        return couleur;
    }

    static int getBrightness(Color col) {
        int brightness;
        int r = col.getRed();
        int g = col.getGreen();
        int b = col.getBlue();
        brightness = (int) Math.sqrt(0.241 * r * r + 0.691 * g * g + 0.068 * b * b);
        return brightness;
    }
}
