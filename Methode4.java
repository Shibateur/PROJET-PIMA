
public class Methode4 extends Methode {
	public Methode4(int nbTirages) {
		super(nbTirages, (Math.PI/4) , ((double)2/3)-Math.PI*Math.PI/16);
		double total = 0;
		double totalCarr� = 0;
		double x;
		for(int i = 0; i<nbTirages;i++) {
			x = Math.random();
			x = Math.sqrt(1 - x*x);
			total += x;
			totalCarr�+= x*x;
		}
		this.setTotal(total);
		this.setSommeCarre(totalCarr�);
	}

	@Override
	public double getPI() {
		// TODO Auto-generated method stub
		return this.getMoyenne()*4;
	}
}
