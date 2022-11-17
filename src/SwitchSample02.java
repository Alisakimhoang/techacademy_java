
public class SwitchSample02 {

    public static void main(String[] args) {
        int day = 7;
        String dayString;

        switch (day) {
        case 1:
            dayString = "Monday";
            break;
            
        case 2:
            dayString = "Tuesday";
            break;
            
        case 3:
            dayString = "Wednesday";
            break;
            
        case 4:
            dayString = "Thursday";
            break;
            
        case 5:
            dayString = "Friday";
            break;
            
        case 6:
            dayString = "Saturday";
            break;
      
            default:
                dayString = "Sunday";
                break;
        }
                System.out.println(dayString);

        }

    }

