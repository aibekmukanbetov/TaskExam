package person.model;


//        Car(id, name, model, year)
public class Car {
    private static Long counter=1L;
    private Long id;
    private String name;
    private int year;

    public Car(String name, int year) {
        this.id=counter++;
        this.name = name;
        this.year = year;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
