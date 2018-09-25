
public class Methode5 extends Methode {
	public Methode5(int nbTirages) {
		super(nbTirages, Math.PI/6, (6*Math.PI-Math.PI*Math.PI)/36);
		double total = 0;
		double totalCarré = 0;
		double x;
		double y;
		for(int i = 0; i<nbTirages;i++) {
			x = Math.random()-(double)1/2;
			y = Math.random()*2;
			if(y < (double)1 / Math.sqrt(1-x*x)) {
				total+=1;
				totalCarré += 1;
			}
		}
		this.setTotal(total);
		this.setSommeCarre(totalCarré);
	}

	@Override
	public double getPI() {
		// TODO Auto-generated method stub
		return this.getMoyenne()*6;
	}
	
}
