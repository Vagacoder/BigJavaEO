package ch17;

import java.util.ArrayList;

/*
 * E17.12 Modify the implementation of the MinHeap class so that the parent and 
 * child index positions and elements are computed directly, without calling 
 * helper methods.

 * 
 */

public class MaxHeap {

    private ArrayList<Comparable> heap;

    public MaxHeap(){
        this.heap = new ArrayList<>();
        // ! 1-based heap
        this.heap.add(null);
    }

    public void add(Comparable newKey){
        // * add an empty leaf
        heap.add(null);
        int i = heap.size() - 1;

        while ( i > 1 && heap.get(i/2).compareTo(newKey) < 0){
            heap.set(i, heap.get(i/2));
            i = i/2;
        }
        heap.set(i, newKey);
    }

    public Comparable getMax(){
        return heap.get(1);
    }
    
    public Comparable removeMax(){
        Comparable max = heap.get(1);

        int i = heap.size()-1;
        if(i > 1){
            heap.set(1, heap.remove(i));
        }else{
            return heap.remove(1);
        }

        i = 1;
        while(i*2 < heap.size()){
            int j = i*2;
            if(j < heap.size()-1 && heap.get(j).compareTo(heap.get(j+1)) < 0){
                j++;
            }
            if(heap.get(i).compareTo(heap.get(j)) > 0){
                break;
            }
            swap(i, j);
            i = j;
        }
        return max;
    }

    private void swap(int i, int j){
        Comparable temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public boolean isEmpty(){
        return this.heap.size() == 1;
    }
}