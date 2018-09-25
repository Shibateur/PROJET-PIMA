
public class Methode3 extends Methode {

	public Methode3(int nbTirages) {
		super(nbTirages, (Math.PI/4) - 0.5, (Math.PI/4)-(Math.PI*Math.PI/16)-((double)1/12));
		double total = 0;
		double totalCarré = 0;
		double x;
		double y;
		for(int i = 0; i<nbTirages;i++) {
			x = Math.random();
			y = Math.random()*x+1-x;
			if(x*x+y*y <1) {
				total+=x;
				totalCarré += x*x;
			}
		}
		this.setTotal(total);
		this.setSommeCarre(totalCarré);
	}

	@Override
	public double getPI() {
		// TODO Auto-generated method stub
		return (this.getMoyenne()+0.5)*4;
	}
	
}
