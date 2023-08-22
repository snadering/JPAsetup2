import jakarta.persistence.*;

@Entity
public class Unicorn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    //@Column(name = power_strength)
    private int powerStrength;

    public Unicorn() {

    }

    public Unicorn(String name, int age, int powerStrength) {
        this.name = name;
        this.age = age;
        this.powerStrength = powerStrength;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPowerStrength() {
        return powerStrength;
    }

    public void setPowerStrength(int powerStrength) {
        this.powerStrength = powerStrength;
    }
}
