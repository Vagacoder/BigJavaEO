package ch22;

/*
* E22.3 Implement a Queue class whose add and remove methods are synchronized. 

Supply one thread, called the producer, which keeps inserting strings into the 
queue as long as there are fewer than ten elements in it. When the queue gets too 
full, the thread waits. As sample strings, simply use time stamps new Date().toString(). 

Supply a sec­ond thread, called the consumer, that keeps removing and printing 
strings from the queue as long as the queue is not empty. When the queue is empty, 
the thread waits. 

Both the consumer and producer threads should run for 100 iterations.

! This is classic problem of CPU process synchronization: Producer-Consumer, or
! Bounded buffer. The queue here, is a buffer with size limit, one producer keeps 
! adding items to buffer, one consumer keeps consume items from buffer.
! See details in Operating System textbook or tutorial
*/

public class Queue{

    

    public static void main(String[] args){
    
    }
}