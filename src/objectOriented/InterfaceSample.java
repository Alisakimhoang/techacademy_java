package objectOriented;

    public class InterfaceSample {

        public static void main(String[] args) {
            EmployeeSalesInterface emp01 = new EmployeeSalesInterface();
            EmployeeSystemInterface emp02 = new EmployeeSystemInterface();

            emp01.greeting();
            emp02.greeting();
        }

    }
