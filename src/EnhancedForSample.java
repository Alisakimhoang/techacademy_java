
public class EnhancedForSample {

    public static void main(String[] args) {
        int [] score = {47, 55, 88, 100, 74};
        int sum = 0;
        double average = 0.0;

        //for(int i = 0; i < score.lenght; i ++) {
        // sum = sum + score[i];
        for (int data : score) {
            sum = sum + data;
            
        }

        // casting
        average =(double)sum/(score.length);

        System.out.println("合計点は、" + sum + "点、平均点は、" + average + "点です。");

    }

}
