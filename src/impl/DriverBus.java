package impl;


import people.People;

public class DriverBus implements Driver, Transport {


    People people;
    int speed=70;
    String category;
    public void setCategory(String c) {
        this.category = c;
        people = new People(17,"Andrew", "Chernetsky", null);
    }

    public void go() {
        if(people!=null){
            System.out.println("Let's go");
        }else
        {
            System.out.println("Stop you are not driver");
        }
    }

    public int getSpeed() {
    return speed;
    }
}
