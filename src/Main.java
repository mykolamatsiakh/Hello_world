import devcat.Cat;
import people.People;

public class Main {

    static Cat cat = new Cat();

    static People people = new People();
      public static void main(String[] args) {
          cat.setName("James");
          cat.setPoroda("Meow");
          cat.setAge(17);


          people.setName("Mykola");
          people.setLastName("Matsyakh");
          people.setAge(17);
          people.setCat(cat);

          System.out.println(people);
          cat.say();
          people.getCat().say();
        }
    }








