package Exercises;

public class BaseBallTeam {
    // フィールド
    String name;
    int win;
    int lose;
    int draw;

    // 引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    // report メソッド
    public void report() {
        double rate = getRate();
        System.out.println(name + "の2020年の成績は " + win + "勝" + lose + "敗" + draw + "分、勝率は " + rate + "です。");

    }

    // getRate メソッド// 戻り値
    //  (double) キャストあり // 勝率は「勝ち数/(勝ち数+負け数)」の計算/
    public double getRate() {
        double rate = (double) win / (win + lose);
        return rate;
    }
}
