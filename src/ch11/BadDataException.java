package ch11;


import java.io.IOException;

/**
   This class reports bad input data.
*/
public class BadDataException extends IOException
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public BadDataException() {}
   public BadDataException(String message)
   {
      super(message);
   }
}
