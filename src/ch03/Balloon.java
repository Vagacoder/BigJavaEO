
package ch03;

public class Balloon {

    private double radius;
    private double volumn;

    public Balloon(double radius) {

	this.radius = radius;
	volumn = Math.PI * this.radius * this.radius * this.radius;

    }

    public void inflat(double amount) {
	this.radius = this.radius + amount;
	volumn = Math.PI * radius * radius * radius;

    }

    public double getVolumn() {

	return volumn;

    }

}
