public class EntierNaturel {
    private int val;
    
    // Constructeur
    public EntierNaturel(int val) throws NombreNegatifException {
        if (val < 0) {
            throw new NombreNegatifException(val);
        }
        this.val = val;
    }
    
    // Accesseur en lecture
    public int getVal() {
        return val;
    }
    
    // Accesseur en écriture
    public void setVal(int val) throws NombreNegatifException {
        if (val < 0) {
            throw new NombreNegatifException(val);
        }
        this.val = val;
    }
    
    // Méthode de décrémentation
    public void decrementer() throws NombreNegatifException {
        if (val - 1 < 0) {
            throw new NombreNegatifException(val - 1);
        }
        val--;
    }
    
    @Override
    public String toString() {
        return "EntierNaturel{" + "val=" + val + '}';
    }
}
