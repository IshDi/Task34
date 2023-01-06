import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age = -1;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this(name, surname);
        this.age = age;
    }


    public boolean hasAge() {
        if (age == -1) {
            return false;
        }
        return true;
    }

    public boolean hasAddress() {
        if (address == null) {
            return false;
        }
        return true;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        int result = age;
        if (result == -1) {
            return OptionalInt.empty();
        } else {
            return OptionalInt.of(result);
        }
    }

    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (age == -1) {
            System.out.println("Возраст не определен");
        } else {
            age = age + 1;
        }
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setAddress(address).setAge(age - 25);
    }

    @Override
    public String toString() {
        return "Меня зовут: " + name + "\n" +
                "Моя фамилия: " + surname + "\n" +
                "Мой возраст: " + age + "\n" +
                "Мой город: " + address;
    }
}
