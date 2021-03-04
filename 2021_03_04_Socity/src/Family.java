
public class Family {
    Person[] persons; // не очень удачный выбор контейнера
    Address address;

    public Family(Person... persons) {
        this.persons = persons;
    }

    void addPerson(){
        //
    }

    void addFamily(){
        // бизнес

    }
}
