package Array;

import java.util.ArrayList;
import java.util.List;

public class GetMethod {

    public static void main(String[] args) {
     // Stringの要素を格納するためのリストを用意
        List<String> strList3 = new ArrayList<String>(3);
       
        strList3.add("ロシア");
        strList3.add("モンゴル");
        strList3.add("中国");

        // リストから2番目の値を取得して表示 
        System.out.println(strList3.get(2));

       }

    }
