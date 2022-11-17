package Array;

import java.util.ArrayList;
import java.util.List;

public class ClearMethod {

    public static void main(String[] args) {
     // Stringの要素を格納するためのリストを用意
        List<String> strList5 = new ArrayList<String>();

        strList5.add("サウジアラビア");
        strList5.add("エチオピア");
        strList5.add("南アフリカ共和国");

        // 削除前リストの要素数を出力  
        System.out.println("削除前:" + strList5);
         
        // リストからすべての要素を削除
        strList5.clear();

        // 削除後リストの要素数を出力 
        System.out.println("削除後:" + strList5);

      }

    }
