import java.util.ArrayList;

public class TacheComplexe implements Tache{
    public String nom;
    public ArrayList<Tache> taches;
    public TacheComplexe(String nom) {
        this.nom = nom;
        this.taches = new ArrayList<Tache>();
    }
    public void add(Tache t){
        this.taches.add(t);
    }
    public Tache remove(){
        return this.taches.remove(taches.size()-1);
    }
    public String getNom(){
        return this.nom;
    }
   public void setNom(String nom){
       this.nom = nom;
    }
    public int getCout(){
        int cout = 0;
        for (Tache t : taches){
            cout += t.getCout();
        }
        return cout;
    }
    public static void main(String[] args){
        TacheComplexe tacheComplexe = new TacheComplexe("TacheComplexe");
        TacheElementaire tacheElementaire1 = new TacheElementaire("TacheElementaire1", 1);
        TacheElementaire tacheElementaire2 = new TacheElementaire("TacheElementaire2", 100);
        tacheComplexe.add(tacheElementaire1);
        tacheComplexe.add(tacheElementaire2);
        System.out.println(tacheComplexe);
        System.out.println(tacheComplexe.getCout());
    }
}
