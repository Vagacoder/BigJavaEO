package BigJavaCh08;

public class Student {
    private String name;
    private int id;

    public Student(int anId) {
	id = anId;
    }

    public int getId() {
	return id;
    }
    // No setId method

    public String getName() {
	return name;
    }

    public void setName(String newName) {
	if (newName.length() > 0) {
	    name = newName;
	}
    }

    public boolean addScore(double nextDouble) {
	// TODO Auto-generated method stub
	return false;
    }

    public double sum() {
	// TODO Auto-generated method stub
	return 0;
    }

    public double minimum() {
	// TODO Auto-generated method stub
	return 0;
    }

    public String finalScore() {
	// TODO Auto-generated method stub
	return null;
    }
}
