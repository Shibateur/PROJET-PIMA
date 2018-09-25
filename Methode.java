
public abstract class Methode {
	private double total;
	private int nbTirages;
	private double sommeCarre;
	private double varianceTheorique;
	private double moyenneTheorique;
	public Methode(int nbTirages, double moyenneTheorique,double varianceTheorique) {
		this.nbTirages = nbTirages;
		this.moyenneTheorique=moyenneTheorique;
		this.varianceTheorique=varianceTheorique;
	}
	public void afficherValeurTheorique() {
		System.out.println("VALEURS THEORIQUES:\nMoyenne:"+moyenneTheorique+"\nVariance:"+varianceTheorique+"\n");
		
	}
	public double getMoyenne() {
		return total/nbTirages;
	}
	public double getVariance() {
		double moyenne = this.getMoyenne();
		return sommeCarre/nbTirages - moyenne*moyenne;  
	}
	public void setTotal(double nb) {
		total = nb;
	}
	public void setSommeCarre(double nb) {
		sommeCarre =nb;
	}
	public void afficherResultat() {
		System.out.println("Total :"+total+"\nMoyenne : "+this.getMoyenne()+"\nVariance : "+this.getVariance()+"\n");
	}
	public void afficher() {
		this.afficherResultat();
		this.afficherValeurTheorique();
	}
	public abstract double getPI();
}
