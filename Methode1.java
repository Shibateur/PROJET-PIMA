
public class Methode1 extends Methode {
	public Methode1(int nbTirages) {
		super(nbTirages,Math.PI/4,((4*Math.PI)-(Math.PI*Math.PI))/16);
		int total = 0;
		double x;
		double y;
		for(int i = 0; i<nbTirages;i++) {
			x = Math.random()*2-1;
			y = Math.random()*2-1;
			if(x*x+y*y <1) {
				total++;
			}
		}
		this.setTotal(total);
		this.setSommeCarre(total); //car cette VA vaut 1 ou 0
	}

	@Override
	public double getPI() {
		// TODO Auto-generated method stub
		return this.getMoyenne()*4;
	}
}
