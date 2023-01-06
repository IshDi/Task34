public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        Person person = new Person(name, surname, age);
        if (age < 0) {
            throw new IllegalStateException("Возраст введен некорректно!");
        }
        if (name == null || surname == null) {
            throw new IllegalStateException("Не все данные были представлены!");
        }
        if (address != null) {
            person.setAddress(address);
        }
        return person;
    }
}
