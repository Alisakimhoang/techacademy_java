package objectOriented;

public class Employee_03Runner {

    public static void main(String[] args) {
        Employee_03 emp01 = new Employee_03();
        //emp01.employeeName = "大島";
        //emp01.divisionName = "営業部";
        //emp01.vitality = 150;
        emp01.introduce();
        emp01.showVitality();

        Employee_03 emp02= new Employee_03("原川", "営業部", 250);
        emp02.introduce();
        emp02.greeting();
        /*
        emp02.report();
        emp02.showVitality();
        */
    }

}
