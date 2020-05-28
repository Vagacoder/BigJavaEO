package ch15;

/*
* 
*/

public class BankSimulationRunner {
   public static void main(String[] args) {
      final double START_TIME = 9 * 60; // 9 a.m.
      final double END_TIME = 17 * 60; // 5 p.m.

      final int NTELLERS = 5;

      Simulation sim = new BankSimulation(NTELLERS);
      sim.addEvent(new Arrival(START_TIME));
      sim.run(START_TIME, END_TIME);
   }
}
