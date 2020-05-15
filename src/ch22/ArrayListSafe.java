package ch22;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
* E22.6 Modify the ArrayList implementation of Section 16.2 so that all methods 
can be safely accessed from multiple threads.

*/

public class ArrayListSafe<Key> {
    
    private ArrayList<Key> list;
    private Lock listLock;

    public ArrayListSafe(){
        list = new ArrayList<>();
        listLock = new ReentrantLock();
    }

    public void add(Key key){
        listLock.lock();
        try{
            this.list.add(key);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            listLock.unlock();
        }
    }

    public Key get(int i){
        listLock.lock();
        Key result = null;
        try{
            result = this.list.get(i);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            listLock.unlock();
        }
        return result;
    }

    public void remove(int i){
        listLock.lock();
        try{
            this.list.remove(i);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            listLock.unlock();
        }
    }

    public int size(){
        listLock.lock();
        int result = -1;
        try{
            result = this.list.size();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            listLock.unlock();
        }
        return result;
    }

}