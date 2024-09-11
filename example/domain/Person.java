package example.domain;

public class Person {
    private String fullName;
    private String address;

    public Person(String fullName, String address) {
        this.fullName = sanitizedString(fullName);
        this.address = sanitizedString(address);
    }

    public Person() {
        this("", "");
    }

    private String sanitizedString(String string) {
        if (string == null) {
            string = "";
        }
        return string.trim();
    }

    @Override
    public String toString() {
        return "[" + this.fullName + ", " + this.address + "]";
    }

}
