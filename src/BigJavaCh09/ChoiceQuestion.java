<<<<<<< HEAD
package BigJavaCh09;

import java.util.ArrayList;

/**
   A question with multiple choices.
*/
public class ChoiceQuestion extends Question
{
   private ArrayList<String> choices;

   /**
      Constructs a choice question with no choices.
   */
   public ChoiceQuestion()
   {
      choices = new ArrayList<String>();
   }

   /**
      Adds an answer choice to this question.
      @param choice the choice to add
      @param correct true if this is the correct choice, false otherwise
   */
   public void addChoice(String choice, boolean correct)
   {
      choices.add(choice);
      if (correct) 
      {
         // Convert choices.size() to string
         String choiceString = "" + choices.size();
         setAnswer(choiceString);
      }
   }
   
   public void display()
   {
      // Display the question text
      super.display();
      // Display the answer choices
      for (int i = 0; i < choices.size(); i++)
      {
         int choiceNumber = i + 1;
         System.out.println(choiceNumber + ": " + choices.get(i));     
      }
   }
}

=======
package BigJavaCh09;

import java.util.*;

/**
 * A question with multiple choices.
 */
public class ChoiceQuestion extends Question {
    private ArrayList<String> choices;

    /**
     * Constructs a choice question with no choices.
     */
    public ChoiceQuestion() {
	choices = new ArrayList<String>();
    }

    /**
     * Adds an answer choice to this question.
     * 
     * @param choice
     *            the choice to add
     * @param correct
     *            true if this is the correct choice, false otherwise
     */
    public void addChoice(String choice, boolean correct) {
	choices.add(choice);
	if (correct) {
	    // Convert choices.size() to string
	    String choiceString = "" + choices.size();
	    setAnswer(choiceString);
	}
    }

    public void display() {
	// Display the question text
	super.display();
	// Display the answer choices
	for (int i = 0; i < choices.size(); i++) {
	    int choiceNumber = i + 1;
	    System.out.println(choiceNumber + ": " + choices.get(i));
	}
    }

    public boolean checkOneOfAnswers(String response) {
	// TODO Auto-generated method stub
	return false;
    }
}
>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
