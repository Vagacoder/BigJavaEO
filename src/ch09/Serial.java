package ch09;

import java.util.*;

/*
 * P9.7
 */
public class Serial extends Circuit {
    ArrayList<Circuit> circuits = new ArrayList<>();

    public void addCircuit(Circuit circuit) {
	circuits.add(circuit);
    }

    public double getResistance() {
	double resistance = 0;
	for (Circuit circuit : circuits) {
	    resistance += circuit.getResistance();
	}
	return resistance;
    }

}
