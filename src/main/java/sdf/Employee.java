package sdf;

public class Employee {

    private Integer id;
    private String firstName;
    private String  lastname;
    private Integer salary;

    public Employee(Integer id, String firstName, String lastname, Integer salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastname=" + lastname + ", salary=" + salary
                + "]";
    }
    
}
