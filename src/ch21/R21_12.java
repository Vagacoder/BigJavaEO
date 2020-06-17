package ch21;

import java.io.RandomAccessFile;

/*
 * R21.12 How do you move the file pointer to the first byte of a file? To the 
 * last byte? To the exact middle of the file?
 * 
 * R21.13 What happens if you try to move the file pointer past the end of a file? 
 * Try it out and report your result.
 
 ! we can pointer beyond EOF.

 * 
*/
public class R21_12 {

    public static void main(String[] args) {

        try (RandomAccessFile file = new RandomAccessFile("data/bank.dat", "r")) {
            file.seek(0);
            System.out.println(file.readInt());
            file.seek(file.length()/2);
            System.out.println(file.readInt());
            file.seek(file.length()-1);
            System.out.println(file.readByte());
            file.seek(file.length());
            System.out.println(file.readByte());
            file.seek(file.length()+1);
            file.seek(file.length()+10);
            
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}