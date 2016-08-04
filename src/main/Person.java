package main;


public class Person {
    int id;
    private String surname;
    private String name;
    private String secondName;
    private String adress;
    private int card;
    private int bank;

    public Person(int id, String surname, String name, String secondName, String adress, int card, int bank) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.adress = adress;
        this.card = card;
        this.bank = bank;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public int getBank() {
        return bank;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        if (card != person.card) return false;
        if (bank != person.bank) return false;
        if (surname != null ? !surname.equals(person.surname) : person.surname != null) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (secondName != null ? !secondName.equals(person.secondName) : person.secondName != null) return false;
        return adress != null ? adress.equals(person.adress) : person.adress == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        result = 31 * result + card;
        result = 31 * result + bank;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", adress='" + adress + '\'' +
                ", card=" + card +
                ", bank=" + bank +
                '}';
    }
}
