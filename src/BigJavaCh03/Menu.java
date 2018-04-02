<<<<<<< HEAD
package BigJavaCh03;

import java.util.Scanner;

/**
   A menu that is displayed on a console.
*/
public class Menu
{
   private String menuText;
   private int optionCount;

   /**
      Constructs a menu with no options.
   */
   public Menu()
   {
      menuText = "";
      optionCount = 0;
   }

   /**
      Adds an option to the end of this menu.
      @param option the option to add
   */
   public void addOption(String option)
   {
      optionCount = optionCount + 1;
      menuText = menuText + optionCount + ") " + option + "\n";
   }
   
   /**
      Displays the menu on the console.
   */
   public void display()
   {
      System.out.println(menuText);
   }
}


=======
package BigJavaCh03;

import java.util.Scanner;

/**
   A menu that is displayed on a console.
*/
public class Menu
{
   private String menuText;
   private int optionCount;

   /**
      Constructs a menu with no options.
   */
   public Menu()
   {
      menuText = "";
      optionCount = 0;
   }

   /**
      Adds an option to the end of this menu.
      @param option the option to add
   */
   public void addOption(String option)
   {
      optionCount = optionCount + 1;
      menuText = menuText + optionCount + ") " + option + "\n";
   }
   
   /**
      Displays the menu on the console.
   */
   public void display()
   {
      System.out.println(menuText);
   }
}


>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
