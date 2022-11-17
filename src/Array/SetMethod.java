package Array;

import java.util.ArrayList;
import java.util.List;

public class SetMethod {

    public static void main(String[] args) {
        // Stringの要素を格納するためのリストを用意
        List<String> strList2 = new ArrayList<String>(3);

        strList2.add("カナダ");
        strList2.add("アメリカ");
        strList2.add("メキシコ");

        // 追加した順にリストに入る
        System.out.println("更新前" + strList2);

        // 1番目の要素を"日本"に上書きする
        strList2.set(1, "日本");

        // 上書き後のリスト("アメリカ"→"日本"になっている)
        System.out.println("更新後" + strList2);

    }

}
