
public class Methode9 extends Methode {
	public Methode9(int nbTirages) {
		super(nbTirages, (Math.PI/4) , ((double)1/4)+Math.PI/8-Math.PI*Math.PI/16);
		double total = 0;
		double totalCarré = 0;
		double x;
		for(int i = 0; i<nbTirages;i++) {
			x = Math.random();
			x = 1/(1 + x*x);
			total += x;
			totalCarré+= x*x;
		}
		this.setTotal(total);
		this.setSommeCarre(totalCarré);
	}

	@Override
	public double getPI() {
		// TODO Auto-generated method stub
		return this.getMoyenne()*4;
	}
}
