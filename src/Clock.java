
public class Clock {
    //1日の中での経過秒数を計算する という名前のメソッドを作成しましょう。
    //    それをメインメソッドで実行して、結果を表示するプログラムを作成してください。
    //    たとえば、18時32分47秒は 66767 秒 となります。ClockgetSeconds

    public static void main(String[] args) {
        getSecond(18, 32, 47);
        int result =   getSecond(18, 32, 47);
        System.out.println("ClockgetSeconds: " + result);
    }

    public static int getSecond(int h, int m, int s) {
        int result = h * 3600 + m * 60 + s;
        return result;
    }

}
