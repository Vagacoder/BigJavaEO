package BigJavaCh07;

import java.util.*;

/**
 * The Student class from How To 7.1, reimplemented with an array list. Note
 * that most of the code is the same, with the [] replaced by calls to the
 * get/set methods. However, the code for adding a score is simpler since we
 * don't have to worry about running out of space. Also note the use of the
 * enhanced for loop in the sum method.
 */

public class Student {
	private ArrayList<Double> scores;

	public Student() {
		scores = new ArrayList<Double>();
	}

	/**
	 * Adds a score for this student.
	 * 
	 * @param score
	 *            the score to add
	 */
	public void addScore(double score) {
		scores.add(score);
	}

	/**
	 * Gets the position of the minimum score.
	 * 
	 * @return the position of the smallest element of values, or -1 if there are no
	 *         scores.
	 */
	public int minimumPosition() {
		if (scores.size() == 0)
			{
				return -1;
			}
		int smallestPosition = 0;
		for (int i = 1; i < scores.size(); i++)
			{
				if (scores.get(i) < scores.get(smallestPosition))
					{
						smallestPosition = i;
					}
			}
		return smallestPosition;
	}

	/**
	 * Computes the sum of the scores
	 * 
	 * @return the total score
	 */
	public double sum() {
		double total = 0;
		for (double score : scores)
			{
				total = total + score;
			}
		return total;
	}

	/**
	 * Removes a score at a given position.
	 * 
	 * @param pos
	 *            the position of the score to remove
	 */
	public void removeScore(int pos) {
		scores.remove(pos);
		/*
		 * Alternatively, for a more efficient implementation, follow Section 7.3.6: int
		 * lastPosition = scores.size() - 1; scores.set(pos, scores.get(lastPosition));
		 * scores.remove(lastPosition);
		 */
	}
}
