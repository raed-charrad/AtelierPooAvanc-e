import java.util.Scanner;

public class chanson {
    private String titre;
	private int durée;
		
	public chanson() {
		this.saisirChanson();
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getDurée() {
		return durée;
	}
	public void setDurée(int durée) {
		this.durée = durée;
	}
	
	@Override
	public String toString() {
	return "Chanson [titre=" + titre + ", durée=" + durée + "]";
	}
	public int lireDuree() throws InvalidDureeException{
		Scanner clavier = new Scanner(System.in);
		int d = clavier.nextInt();
		if (d<0){
			throw new InvalidDureeException("Durée négative");
		}
		else return d;
	}
	public String lireTitre()throws InvalidTitreException{
		Scanner clavier = new Scanner(System.in);
		String t = clavier.nextLine();
		if (t.length()>20){
			throw new InvalidTitreException("Titre tros long ");
		}
		else return t;
	}
	public void saisirChanson(){
		do{
			try{
				System.out.println("Saisir le titre de la chanson");
				this.titre = this.lireTitre();
				System.out.println("Saisir la durée de la chanson");
				this.durée = this.lireDuree();
			}
			catch (InvalidTitreException e){
				System.out.println(e.getMessage());
			}
			catch (InvalidDureeException e){
				System.out.println(e.getMessage());
			}
		}while(this.titre.length()>20 || this.durée<0);
	}
}
