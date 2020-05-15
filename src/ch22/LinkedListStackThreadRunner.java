package ch22;

/*
* E22.2 Implement a stack as a linked list in which the push, pop, and isEmpty 
methods can be safely accessed from multiple threads.

*/

public class LinkedListStackThreadRunner {
    
    static int repeat = 100;

    static class PushNode extends Thread{
        private LinkedListStackSafe<String> stack;

        public PushNode(LinkedListStackSafe<String> stack){
            this.stack = stack;
        }

        public void run(){
            for(int i = 0; i < repeat; i++){
                stack.push("A");
                System.out.println("Push a new Node");
            }
            System.out.println(stack.size());
        }
    }

    static class PopNode extends Thread{
        private LinkedListStackSafe<String> stack;

        public PopNode(LinkedListStackSafe<String> stack){
            this.stack = stack;
        }

        public void run(){
            for(int i = 0; i < repeat; i++){
                stack.pop();
                System.out.println("Pop a Node");
            }
            System.out.println(stack.size());
        }
    }

    public static void main(String[] args){

        LinkedListStackSafe<String> stack = new LinkedListStackSafe<>();

        for(int i = 0; i < 10000; i++){
            stack.push("B");
        }
        System.out.println("Init size is: " + stack.size());

        for(int i = 0; i < repeat; i++){
            Thread push = new PushNode(stack);
            Thread pop = new PopNode(stack);

            push.start();
            pop.start();
        }

    }


}