import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Album{
    private String nom;
    ArrayList<chanson> tab;
    public Album(String nom) {
        this.nom = nom;
        tab = new ArrayList<chanson>();
    }
    public void ajouterChanson(chanson chanson) {
        tab.add(chanson);
    } 
    public void supprimerChanson(String titre){
        for (int i=0 ;i<tab.size();i++){
            if (tab.get(i).getTitre().equals(titre)){
                tab.remove(i);
            }
        }
    }
    public void afficherChansons(){
        Iterator<chanson> it = tab.iterator();
        while (it.hasNext()){
            chanson chanson = it.next();
            System.out.println(chanson);
        }
    }
    public void afficherTitres(){
        for (chanson chanson : tab){
            System.out.println(chanson.getTitre());
        }
    }
    public double dureeTotalAlbum(){
        double duree = 0;
        for (chanson chanson : tab){
            duree += chanson.getDurée();
        }
        return duree;
    }
    public void trierParPiste(){
        Collections.sort(this.tab,new DuréeComparator());
    }
    public void trieParTitre(){
        Collections.sort(this.tab,new TitreComparator());
    }
    public static void main(String[] args) {
        Album album = new Album("Album");
        album.ajouterChanson(new chanson());
        album.ajouterChanson(new chanson());
        album.ajouterChanson(new chanson());
        album.afficherChansons();
        System.out.println(" ");
        album.trierParPiste();
        album.afficherChansons();
        System.out.println(" ");

        album.trieParTitre();
        album.afficherChansons();
        System.out.println(album.dureeTotalAlbum());
    }
}
