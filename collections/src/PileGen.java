import java.util.ArrayList;
public class PileGen<T> {
    ArrayList<T> tab;
    public PileGen(){
        tab = new ArrayList<T>();
    }
    public void add(T e){
        tab.add(e);
    }
    public T remove(){
        return tab.remove(tab.size()-1);
    }
    public boolean estVide(){
        return tab.size() == 0;
    }
    public int size(){
        return tab.size();
    }
    public void affiche(){
        for (int i = 0; i<tab.size(); i++){
            System.out.println(tab.get(i));
        }
    }
    public T getSommet(){
        return tab.get(tab.size()-1);
    }
    public static void main(String[] args) {
        PileGen<Integer> p = new PileGen<Integer>();
        p.add(1);
        p.add(2);
        p.add(3);
        p.affiche();
        System.out.println(p.size());
        System.out.println(p.getSommet());
        System.out.println(p.remove());
        p.affiche();
    }
}
