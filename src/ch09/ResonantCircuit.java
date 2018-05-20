package ch09;

/**
 * P9.6 superclass
 */
public class ResonantCircuit {

    private double w;
    private double B;
    private double k;

    public double getW() {
	return w;
    }

    public void setW(double w) {
	this.w = w;
    }

    public double getB() {
	return B;
    }

    public void setB(double b) {
	B = b;
    }

    public double getK() {
	return k;
    }

    public void setK(double k) {
	this.k = k;
    }

    public void display() {
	System.out.println("w0: " + w);
	System.out.println("B: " + B);
	System.out.println("k: " + k);
    }
}
