public class Main {
    public static void main(String[] args) {
        Person person = new Person("Nafas", 17);

        person.display();
        person.Adult();

        person.setName("Reshad");
        person.setAge(21);

        person.display();
        person.Adult();
    }
}