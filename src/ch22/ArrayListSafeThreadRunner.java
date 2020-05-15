package ch22;

/*
* E22.6 Modify the ArrayList implementation of Section 16.2 so that all methods 
can be safely accessed from multiple threads.

*/

public class ArrayListSafeThreadRunner {

    static int repeat = 100;

    static class AddNode extends Thread {

        private ArrayListSafe<String> list;

        public AddNode(ArrayListSafe<String> list) {
            this.list = list;
        }

        public void run() {
            for (int i = 0; i < repeat; i++) {
                list.add("A");
                System.out.println("Add a node");
            }
            System.out.println(list.size());
        }
    }

    static class RemoveNode extends Thread {

        private ArrayListSafe<String> list;

        public RemoveNode(ArrayListSafe<String> list) {
            this.list = list;
        }

        public void run() {
            for (int i = 0; i < repeat; i++) {
                list.remove(0);
                System.out.println("remove a node");
            }
            System.out.println(list.size());
        }
    }

    public static void main(String[] args) {
        ArrayListSafe<String> list = new ArrayListSafe<>();

        for (int i = 0; i < 10000; i++) {
            list.add("B");
        }

        for (int i = 0; i < repeat; i++) {
            Thread at = new AddNode(list);
            Thread rt = new RemoveNode(list);

            at.start();
            rt.start();
        }
    }
}