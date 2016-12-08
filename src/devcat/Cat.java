package devcat;

public class Cat extends Pilot {
    private int age;
    private String poroda;
    private String name;

    public Cat(int age, String poroda, String name)
    {
        this.age = age;
        this.poroda = poroda;
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void say(){
        System.out.println("Мяу");
    }

    @Override
    public String toString() {
        return ("devcat.Cat: "+name+"(Poroda:"+poroda+", Age"+age+")");
    }

    void fly() {
        System.out.println("If i could fly");
    }

    void dream() {
        System.out.println("I would be a king of the sky");
    }
}
