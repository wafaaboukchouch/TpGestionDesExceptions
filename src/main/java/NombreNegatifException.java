public class NombreNegatifException extends Exception {
    private int valeurErronee;
    
    // Constructeur avec message et valeur erronée
    public NombreNegatifException(String message, int valeur) {
        super(message);
        this.valeurErronee = valeur;
    }
    
    // Constructeur simple
    public NombreNegatifException(int valeur) {
        super("Erreur : nombre négatif interdit ! Valeur : " + valeur);
        this.valeurErronee = valeur;
    }
    
    // Méthode pour consulter la valeur erronée
    public int getValeurErronee() {
        return valeurErronee;
    }
}
