package Array;

import java.util.ArrayList;
import java.util.List;

public class RemoveMethod {

    public static void main(String[] args) {
        // Stringの要素を格納するためのリストを用意
        List<String> strList4 = new ArrayList<String>(3);

        strList4.add("サウジアラビア");
        strList4.add("エチオピア");
        strList4.add("南アフリカ共和国");

        // 削除前のリストを出力 
        System.out.println("削除前" + strList4);

        // 1番目の要素を削除する
        strList4.remove(1);

        // リストから"エチオピア"が削除されている
        System.out.println("削除後" + strList4);
        
        // リストから1番目の値を取得して表示。
        System.out.println(strList4.get(1));

    }

}
