
public class Methode7 extends Methode {
	public Methode7(int nbTirages) {
		super(nbTirages, (Math.PI/2)-1, (Math.PI/2)-1 - ((Math.PI/2)-1)*((Math.PI/2)-1));
		double total = 0;
		double totalCarré = 0;
		double x;
		double y;
		for(int i = 0; i<nbTirages;i++) {
			x = Math.random();
			y = Math.random()*((double)1/2) + (double)1/2;
			if(y < (double)1 / (1+x*x)) {
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
		return (this.getMoyenne()+1)*2;
	}
}
