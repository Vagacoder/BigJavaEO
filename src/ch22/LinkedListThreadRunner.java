package ch22;

import java.util.LinkedList;

/*
* E22.1 Write a program in which multiple threads add and remove elements from a
java.util.LinkedList. Demonstrate that the list is being corrupted.

*/

public class LinkedListThreadRunner {
    
    static int REPEAT = 100;
    

    static class AddNode extends Thread{
        private LinkedList<String> list;

        public AddNode(LinkedList<String> list){
            this.list = list;
        }

        public void run(){
            for(int i = 0 ; i < REPEAT; i++){
                list.add("A");
                System.out.println("Add a new Node");
            }
            System.out.println(list.size());
        }
    }

    static class DelNode extends Thread{
        private LinkedList<String> list;

        public DelNode(LinkedList<String> list){
            this.list = list;
        }

        public void run(){
            for(int i = 0 ; i < REPEAT; i++){
                list.removeFirst();
                System.out.println("Remove a Node");
            }
            System.out.println(list.size());
        }
    }

    public static void main(String[] args){
        
        LinkedList<String> list = new LinkedList<>();

        for(int i = 0; i < 10000; i++){
            list.add("B");
        }
        System.out.println("Init size is: " + list.size());

        for(int i = 0; i < REPEAT; i++ ){
            Thread at = new AddNode(list);
            Thread dt = new DelNode(list);

            at.start();
            dt.start();
        }
    }
}