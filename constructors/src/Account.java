public class Account {
    private String firstName;

    public Account(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Account() {
        this.firstName = "Ehsan";
        this.lastName = "Bababack";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String lastName;

}
