package devcat;

import people.People;

public class Parachuter extends People {
    private String typeOfParachute;


    public Parachuter(int age, String name, String lastName, Cat cat) {
        super(age, name, lastName, cat);
    }

    public String getTypeOfParachute() {
        return typeOfParachute;
    }

    public void setTypeOfParachute(String typeOfParachute) {
        this.typeOfParachute = typeOfParachute;
    }
}
