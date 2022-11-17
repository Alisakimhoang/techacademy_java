package objectOriented;

public class EmployeeRun {

    public static void main(String[ ] args) {
        Employee_1 emp = new Employee_1();
        
        emp.employeeName = "Tanaka";
        emp.divisionName ="Marketing";
        emp.introduce();
        emp.greeting();
        emp.vitality = 150;
        emp.showVitality();
        
        Employee_1 emp02 = new Employee_1();
        emp02.employeeName = "原川";
        emp02.divisionName = "営業部";
        emp02.vitality = 250;
        emp02.introduce();
        emp02.greeting();
        emp02.report();
        emp02.showVitality();
 
    }

}
