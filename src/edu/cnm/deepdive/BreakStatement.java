package edu.cnm.deepdive;

public class BreakStatement {

  public static void main(String[] args) {
     myLabel:
     {
       int[] myArray = {1, 2, 3};//myArray is only accessible inside the curly braces so this is
       //not good practice to work with labels.
     }

     String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};
    for (String animal : animals) {
      System.out.println(animal);
    }

    MY_LOOP: for (String animal : animals) {
      if (animal.equals("Cat")) {
        break MY_LOOP;
      }
      System.out.println(animal);//prints only Dog
    }

    animal: for (String animal : animals) {
      if (animal.equals("Cat")) {
        break animal;//will compile and run but is not good practice because of change of confusion.
        //first animal is a label, then animal is a String within the animals[].
      }
      System.out.println(animal);//prints only Dog
    }

    for (String animal : animals) {
      if (animal.equals("Lizard")) {
        break;//break statement without a label.
      }
      System.out.println(animal);//prints Dog and Cat.
    }

    int index = 0;
    while (index < animals.length) {
      String animal = animals[index];

      if (animal.equals("Lizard")) {
        break;
      }
      System.out.println(animal);
      index++;
    }
  }
}
