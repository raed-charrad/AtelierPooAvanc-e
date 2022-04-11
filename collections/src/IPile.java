public interface IPile<A>{
    boolean estVide();
    void empiler(A a);
    A depiler();
    int nbElements();
    A sommet();
}
