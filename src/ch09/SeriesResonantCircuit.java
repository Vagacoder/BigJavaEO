package ch09;

public class SeriesResonantCircuit extends ResonantCircuit {

    @Override
    public void display() {
	super.display();
	System.out.println("R: " + getK());
	System.out.println("C: " + 1 / (getB() * getK()));
	System.out.println("L: " + (getB() * getK()) / (getW() * getW()));

    }

}
