import java.util.Comparator;

public class DuréeComparator implements Comparator<chanson> {

    public int compare(chanson o1, chanson o2) {
        return o1.getDurée() - o2.getDurée();
    }
}
