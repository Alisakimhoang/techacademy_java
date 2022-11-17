public class SwitchSample {
    public static void main(String[] args) {
                int score = 90; // 成績

                int rank = score / 10; // ランクの算出

                switch(rank){
                case 0 :
                case 1 :
                case 2 :
                case 3 :
                case 4 :
                case 5 :
                    System.out.println("赤点です...補講を行います");
                    break;
                case 6 :
                case 7 :
                    System.out.println("合格です！");
                    break;
                case 8 :
                case 9 :
                    System.out.println("よくできました！");
                    break;
                case 10:
                    System.out.println("満点です！ご褒美をあげます！");
                    break;
                }
            }

    }


