package employeetest;

public class Employee {

    // define variable or employee attributes
    private String id;
    private String name;
    private int age;
    private double salary;
    public String department;
    
    //define two constractor
    //default constractor 
    public Employee(){        
    }
    // constractor with parameters

    public Employee(String id, String name,int age, double salary ,String department){
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        
        
    }
    
    // set and get methods
     public String getId() {
        return id;
    }
 
    public void setId(String id) {
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
    
     public String getDepartment() {
        return department;
    }
 
    public void setDepartment(String department) {
        this.department = department;
    }
    
    
    public double getSalary() {
        return salary;
    }
 
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    // method that contain all employee information 
    public String toString(){
    
    String employee_data = "\nThe Employee_ID: "+getId()+"\nEmployee name: "+getName()+"\nEmployee age: "+getAge()+"\nEmployee department: "
            + getDepartment()+"\nEmployee Salary: "+getSalary();
    
    return employee_data;
    }
    
}
    


