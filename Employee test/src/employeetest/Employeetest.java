package employeetest;

public class Employeetest {

    public static void main(String[] args) {
        
        Employee e1= new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee("e-1234","Ahmed Ali",30,8000.00,"Accounting"); 
        
        // invoke two employee private vairable by using set and get Methods 
        e1.setId("e-5555") ;
        String empName  = e3.getName();
        e2.setName("Huda");
        
        //invoke Public variable without set and get methods
        e1.department = "Network Department";
        
        // invoke getId method
        System.out.println("Employee object e1 has Employee Id= "+ e1.getId());
        
        // invoke toString Method
        System.out.println(e3.toString());
        
        
        
    }
    
}


