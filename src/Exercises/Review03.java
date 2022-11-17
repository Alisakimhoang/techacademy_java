package Exercises;

public class Review03 {

    public static void main(String[] args) {
        // インスタンスを6個生成 それぞれのチームの名前、勝ち数、負け数、引き分け数
        BaseBallTeam team1 = new BaseBallTeam("読売ジャイアンツ", 67, 45, 8);
        BaseBallTeam team2 = new BaseBallTeam("阪神タイガース", 60, 53, 7);
        BaseBallTeam team3 = new BaseBallTeam("中日ドラゴンズ", 60, 55, 5);
        BaseBallTeam team4 = new BaseBallTeam("横浜DeNAベイスターズ", 56, 58, 6);
        BaseBallTeam team5 = new BaseBallTeam("広島東洋カープ", 52, 56, 12);
        BaseBallTeam team6 = new BaseBallTeam("東京ヤクルトスワローズ", 41, 69, 10);

        //report メソッドを呼び出 // カプセル化
        team1.report();
        team2.report();
        team3.report();
        team4.report();
        team5.report();
        team6.report();

    }

}
