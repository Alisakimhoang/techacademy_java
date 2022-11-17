/*
a == b || b == c || c == a なら二等辺三角形
a == b && b == c && c == a なら正三角形
残るは不等辺三角形
*/

public class Triangle {

    public static void main(String[] args) {

        int a = 5;
        int b = 5;
        int c = 5;

        if (a == b && b == c && c == a) {
            System.out.println("正三角形");
        } else if (a == b || b == c || c == a) {
            System.out.println("正三角形");
        } else {
            System.out.println("不等辺三角形");
        }

    }

}
