package ch15;

import java.util.*;

/**
 * This program demonstrates a priority queue of work orders. The most important
 * work orders are removed first.
 */
public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<WorkOrder> q = new PriorityQueue<>();
		q.add(new WorkOrder(3, "Shampoo carpets"));
		q.add(new WorkOrder(7, "Empty trash"));
		q.add(new WorkOrder(8, "Water plants"));
		q.add(new WorkOrder(10, "Remove pencil sharpener shavings"));
		q.add(new WorkOrder(6, "Replace light bulb"));
		q.add(new WorkOrder(1, "Fix broken sink"));
		q.add(new WorkOrder(9, "Clean coffee maker"));
		q.add(new WorkOrder(2, "Order cleaning supplies"));

		while (q.size() > 0) {
			System.out.println(q.remove());
		}
	}
}
