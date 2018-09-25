
public class Methode1bis extends Methode {
	public Methode1bis(int nbTirages) {
		super(nbTirages,2*(Math.PI/4-(double)1/2),2*(Math.PI/4-(double)1/2)-(2*(Math.PI/4-(double)1/2))*2*(Math.PI/4-(double)1/2));
		int total = 0;
		double x;
		double y;
		double buffer;
		for(int i = 0; i<nbTirages;i++) {
			x = Math.random();
			y = Math.random();
			if(x+y<1) {
				buffer=x;
				x = 1-y;
				y = 1-buffer;
			}
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
		return ((this.getMoyenne()/2)+0.5)*4;
	}
}
