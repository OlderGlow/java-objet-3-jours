public class AucuneVoitureExisteException extends Exception {
    public AucuneVoitureExisteException() {
        super("Cette voiture n'existe pas, veuillez recommencer.");
    }
}
