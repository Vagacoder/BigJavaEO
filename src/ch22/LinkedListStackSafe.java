package ch22;

/*
* E22.2 Implement a stack as a linked list in which the push, pop, and isEmpty 
methods can be safely accessed from multiple threads.
*/ 

import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LinkedListStackSafe<Key> {

    private LinkedList<Key> list;
    private Lock stackLock;

    public LinkedListStackSafe(){
        list = new LinkedList<>();
        stackLock = new ReentrantLock();
    }

    public void push(Key key){
        stackLock.lock();
        try{
            this.list.push(key);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            stackLock.unlock();
        }
    }

    public Key pop(){
        stackLock.lock();
        Key result = null;
        try{
            result = this.list.pop();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            stackLock.unlock();
        }
        return result;
    }

    public int size(){
        stackLock.lock();
        int result = -1;
        try{
            result = this.list.size();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            stackLock.unlock();
        }
        return result;
    }

}