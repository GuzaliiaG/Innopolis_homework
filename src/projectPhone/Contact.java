package projectPhone;

public class Contact {
    private final String name;
   private final String value;

    public Contact(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public void print () {
        System.out.println(name + " " + value);
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}


