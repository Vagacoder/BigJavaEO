package ch09;

import java.util.*;

/*
 * P9.7
 */
public class Parallel extends Circuit {
    ArrayList<Circuit> circuits = new ArrayList<>();

    public void addCircuit(Circuit circuit) {
	circuits.add(circuit);
    }

    public double getResistance() {
	double oneOverResistance = 0;
	for (Circuit circuit : circuits) {
	    oneOverResistance += 1 / (circuit.getResistance());
	}
	return 1 / oneOverResistance;
    }
}
