public class Student1 implements ObjectStudent, ObjectTeacher{

    private Long studentId;

    private String firstName;

    private String lastName;

    private String middleName;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public int compareTo(Student1 o) {
        // TODO Auto-generated method stub
        return this.studentId.compareTo(o.studentId);
    }


}