import java.util.Comparator;

public class TitreComparator implements Comparator<chanson> {

    public int compare(chanson o1, chanson o2) {
        return o1.getTitre().compareTo(o2.getTitre());
    }

}
