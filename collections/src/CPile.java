import java.util.LinkedList;

public class CPile<T> implements IPile<T> {
   
    LinkedList<T>  list;
    public CPile(){
        list = new LinkedList<T>();
    }
    public void empiler(T a){
        list.addFirst(a);
    }
    public T depiler(){
        return list.removeFirst();
    }
    public int nbElements(){
        return list.size();
    }
    public T sommet(){
        return list.getFirst();
    }
    public boolean estVide(){
        return list.size() == 0;
    }
    public void affiche(){
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    public static void main(String[] args) {
        CPile<Integer> p = new CPile<Integer>();
        CPile<String> p1 = new CPile<String>();
        p.empiler(1);
        p.empiler(2);
        p.empiler(3);
        p.affiche();
        System.out.println(p.nbElements());
        System.out.println(p.sommet());
        System.out.println(p.depiler());
        p.affiche();
        System.out.println(p.nbElements());
        p1.empiler("sqd");
        p1.empiler("ze");
        p1.empiler("sdsqd");
        p1.affiche();
        System.out.println(p1.nbElements());
        System.out.println(p1.sommet());
        System.out.println(p1.depiler());
        p1.affiche();
        System.out.println(p1.nbElements());

    }
    
}
