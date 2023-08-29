public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setYearsTeaching(int yearsTeaching) {
        this.yearsTeaching = yearsTeaching;
    }

    public String getFirstName() {
        return getFirstName();
    }
    public String getLastName() {
        return getLastName();
    }
    public String getSubject() {
        return getSubject();
    }
    public int getYearsTeaching() {
        return getYearsTeaching();
    }

    //Constructor
    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName =firstName;
        this.lastName =lastName;
        this.subject =subject;
        this.yearsTeaching =yearsTeaching;
    }
}


