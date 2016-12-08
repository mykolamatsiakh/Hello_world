import devcat.Cat;
import devcat.Parachuter;
import people.People;

public class Main {


    static Cat cat;
    static People people ;


      public static void main(String[] args) {
          cat = new Cat(12, "Бульдог", "Бровко");
          people = new People(17, "Mykola", "Matsyakh", cat);
           people.getCat().setName("Брівко");

          people.sayGoodbye();

          Parachuter parachuter = new Parachuter(17, "Mykola", "Matsyakh",null);
          parachuter.setTypeOfParachute("Wingsuit");
          parachuter.sayGoodbye();
        }
    }








