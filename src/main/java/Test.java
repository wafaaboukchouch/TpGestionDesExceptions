
public class Test {
    public static void main(String[] args) {
        System.out.println("=== Test de la classe EntierNaturel ===\n");
        
        // Test 1: Création avec une valeur valide
        try {
            EntierNaturel en = new EntierNaturel(10);
            System.out.println("Création réussie : " + en.getVal());
            
            // Test de décrémentation
            en.decrementer();
            System.out.println("Après décrémentation : " + en.getVal());
            
            // Test de modification
            en.setVal(5);
            System.out.println("Après modification : " + en.getVal());
            
        } catch (NombreNegatifException e) {
            System.out.println("Exception : " + e.getMessage());
            System.out.println("Valeur erronée : " + e.getValeurErronee());
        }
        
        System.out.println("\n--- Test avec valeur négative à la création ---");
        try {
            EntierNaturel en2 = new EntierNaturel(-5);
        } catch (NombreNegatifException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
            System.out.println("Valeur erronée mémorisée : " + e.getValeurErronee());
        }
        
        System.out.println("\n--- Test avec setVal négatif ---");
        try {
            EntierNaturel en3 = new EntierNaturel(20);
            System.out.println("Valeur initiale : " + en3.getVal());
            en3.setVal(-3);
        } catch (NombreNegatifException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
            System.out.println("Valeur erronée mémorisée : " + e.getValeurErronee());
        }
        
        System.out.println("\n--- Test de décrémentation jusqu'à négatif ---");
        try {
            EntierNaturel en4 = new EntierNaturel(1);
            System.out.println("Valeur initiale : " + en4.getVal());
            en4.decrementer();
            System.out.println("Après 1ère décrémentation : " + en4.getVal());
            en4.decrementer(); // Devrait générer une exception
        } catch (NombreNegatifException e) {
            System.out.println("Exception attrapée : " + e.getMessage());
            System.out.println("Valeur erronée mémorisée : " + e.getValeurErronee());
        }
    }
}
