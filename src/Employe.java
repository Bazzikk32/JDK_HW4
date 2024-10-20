import java.util.Objects;

public class Employe {

    private String name;
    private int phoneNumber;
    private int id;
    private int workYear;


    public Employe(String name, int phoneNumber, int id, int workYear) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.workYear = workYear;

    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getId() {
        return id;
    }

    public int getWorkYear() {
        return workYear;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", id=" + id +
                ", workYear=" + workYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employe employe)) return false;
        return id == employe.id && workYear == employe.workYear && Objects.equals(name, employe.name) && Objects.equals(phoneNumber, employe.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber, id, workYear);
    }
}