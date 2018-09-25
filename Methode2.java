
public class Methode2 extends Methode {

	public Methode2(int nbTirages) {
		super(nbTirages,Math.log(2),Math.log(2)*(1-Math.log(2)));
		int total = 0;
		double x;
		double y;
		for(int i = 0; i<nbTirages;i++) {
			x = Math.random();
			y = Math.random()*x+1-x;
			if(x*x+y*y <1) {
				total++;
			}
		}
		this.setTotal(total);
		this.setSommeCarre(total);
	}

	@Override
	public double getPI() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
