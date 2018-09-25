
public class Methode6 extends Methode {
	public Methode6(int nbTirages) {
		super(nbTirages, ((Math.PI/3)-1)/(((double)2/Math.sqrt(3))-1), ((Math.PI/3)-1)/(((double)2/Math.sqrt(3))-1) - ((Math.PI/3)-1)/(((double)2/Math.sqrt(3))-1)*((Math.PI/3)-1)/(((double)2/Math.sqrt(3))-1));
		double total = 0;
		double totalCarré = 0;
		double x;
		double y;
		for(int i = 0; i<nbTirages;i++) {
			x = Math.random()-(double)1/2;
			y = Math.random()*(((double)2/Math.sqrt(3))-1)+1;
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
		return ((this.getMoyenne()*(((double)2/Math.sqrt(3))-1))+1)*3;
	}
}
