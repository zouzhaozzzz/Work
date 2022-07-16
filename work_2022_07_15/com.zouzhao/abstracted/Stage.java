package abstracted;

public class Stage {
    private  Person person;

    public Stage(Person person) {
        this.person = person;
    }

    public void run(){
        person.show();
    }

    public static void main(String[] args) {
        Person person1=new blueCollar();
        Person person2=new softwareEngineer();
        Person person3=new farmer();
        Stage stage = new Stage(person1);
        stage.run();
    }
}

abstract class Person{
    abstract void show();
}

class blueCollar extends Person{
    @Override
    void show() {
        System.out.println("Blue collar showtime");
    }
}
class softwareEngineer extends Person
{
    @Override
    void show() {
        System.out.println("software engineer showtime");
    }
}
class farmer extends Person{
    @Override
    void show() {
        System.out.println("farmer showtime");
    }
}