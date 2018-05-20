package ch09;

/**
 * P9.7 superclass
 */
public class Circuit {

    private double resistance;

    public void setResistance(double resistance) {
	this.resistance = resistance;
    }

    public double getResistance() {
	return resistance;
    }

    // Tester
    public static void main(String[] args) {
	Resistor r1 = new Resistor();
	r1.setResistance(3);
	Resistor r2 = new Resistor();
	r2.setResistance(4);
	Resistor r3 = new Resistor();
	r3.setResistance(5);
	Serial s1 = new Serial();
	s1.addCircuit(r1);
	s1.addCircuit(r2);
	Parallel p1 = new Parallel();
	p1.addCircuit(s1);
	p1.addCircuit(r3);
	System.out.println(p1.getResistance());
    }

}
