package ch21;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

/**
   This class encrypts files using the Caesar cipher.
   For decryption, use an encryptor whose key is the 
   negative of the encryption key.
*/
public class CaesarCipher
{
   private int key;

   /**
      Constructs a cipher object with a given key.
      @param aKey the encryption key
   */
   public CaesarCipher(int aKey)
   {
      key = aKey;
   }

   /**
      Encrypts the contents of an input stream.
      @param in the input stream
      @param out the output stream
   */      
   public void encryptStream(InputStream in, OutputStream out)
         throws IOException
   {
      boolean done = false;
      while (!done)
      {
         int next = in.read();
         if (next == -1) 
         { 
            done = true; 
         }
         else
         {
            int encrypted = encrypt(next);
            out.write(encrypted);
         }
      }
   }

   /**
      Encrypts a value.
      @param b the value to encrypt (between 0 and 255)
      @return the encrypted value
   */
   public int encrypt(int b)
   {
      return (b + key) % 256;
   }
}
