import java.util.Objects;

public class Instruments {
    String name;


    public Instruments(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name=" + name;
    }

}
