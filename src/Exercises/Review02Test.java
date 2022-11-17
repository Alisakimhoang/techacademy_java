package Exercises;

public class Review02Test {

//         public static void main(String[] args) {
//            for ( int i = 1; i < 100; i ++) {
//                if(i % 3 == 0)  {
//                    System.out.println("Fizz");
//                    
//                } else if (i % 5 == 0) {
//                        System.out.println("Buzz");
//                        
//                    }  
//                
//                if (( i % 3 == 0) && (i % 5 == 0)) {
//                      System.out.println("FizzBuzz");
//                      
//                } else {
//                    System.out.println(i);
//                }
//            }

//         }
//}
         
         
        public static void main(String[] args) {
             int i = 15;
             
             if(i % 3 == 0)  {
                 System.out.println("Fizz");
                 
             } else if (i % 5 == 0) {
                     System.out.println("Buzz");
                     
                 } else if (( i % 3 == 0) && (i % 5 == 0)) {
                   System.out.println("FizzBuzz");
                  
             } else {
                 System.out.println(i);
             }
             
         }
}


