public class TacheElementaire implements Tache {
    private String nom;
    private int cout;
    
    public TacheElementaire(String nom, int cout) {
        this.nom = nom;
        this.cout = cout;
    }
    
    public String getNom() {
        return nom;
    }
    
    public int getCout() {
        return cout;
    }
    public void setCout(int cout) {
        this.cout = cout;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String toString() {
        return "TacheElementaire [nom=" + nom + ", cout=" + cout + "]";
    }

    
}
