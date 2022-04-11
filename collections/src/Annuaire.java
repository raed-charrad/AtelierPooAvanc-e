import java.util.HashMap;

public class Annuaire {
    HashMap<String,Fiche> Tab;
    public Annuaire(){
        this.Tab = new HashMap<String,Fiche>();
    }
    public int getNBconttacts(){
        return this.Tab.size();
    }
    public void addContact(Fiche f){
        this.Tab.put(f.getNom(),f);
    }
    public void addContact(String s, int n, String a){
        this.Tab.put(s,new Fiche(s,a,n));
    }
    public void addContact(String s){
        this.Tab.put(s,new Fiche(s));
    }
    public int getnumero(String name){
        return this.Tab.get(name).getNumero();
    }
    public void affiche(){
        for (String s : this.Tab.keySet()){
            System.out.println(this.Tab.get(s));
        }
    }
    public static void main(String[] args) {
        Annuaire a = new Annuaire();
        a.addContact("aaa",1,"bbb");
        a.addContact("ccc",2,"ddd");
        a.addContact("eee",3,"fff");
        a.affiche();
        System.out.println(a.getnumero("aaa"));
    }
}
