public class Student {
    private String fName;
    private String lName;

    public Student(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(fName).append(" ");
        sb.append(lName);
        return sb.toString();
    }
}
