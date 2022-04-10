public class Fiche {
    public String nom;
    public String adresse;  
    public int numero;
    public Fiche(String nom, String adresse, int numero) {
        this.nom = nom;
        this.adresse = adresse;
        this.numero = numero;
    }
    public Fiche(String nom){
        this.nom = nom;
        this.adresse =null;
        this.numero =-1;
    }
    public String getNom() {
        return nom;
    }
    public String getAdresse() {
        return adresse;
    }
    public int getNumero() {
        return numero;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String toString(){
        return "Fiche [nom=" + nom + ", adresse=" + adresse + ", numero=" + numero + "]";
    }

}
