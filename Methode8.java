
public class Methode8 extends Methode {
	public Methode8(int nbTirages) {
		super(nbTirages, (Math.PI/3) , (Math.log(3))-Math.PI*Math.PI/9);
		double total = 0;
		double totalCarré = 0;
		double x;
		for(int i = 0; i<nbTirages;i++) {
			x = Math.random()-(double)1/2;
			x = 1/Math.sqrt(1 - x*x);
			total += x;
			totalCarré+= x*x;
		}
		this.setTotal(total);
		this.setSommeCarre(totalCarré);
	}

	@Override
	public double getPI() {
		// TODO Auto-generated method stub
		return this.getMoyenne()*3;
	}
}
