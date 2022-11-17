package objectOriented;

public class Human {
    
    String name = "Yev";
    int age = 41;
    Company company;
    String perfecture = "Tokyo";
    
    void introduce () {
        System.out.println("わたしの名前は" + name + "です。");
    }
    
    void talk () {
        System.out.println("Welcome");
    }
    

}
