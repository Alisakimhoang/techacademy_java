
public class ToStringSample {

    public static void main(String[] args) {
        Integer i = 12345;
        String s = i.toString();
        System.out.println(s.length());
        
        System.out.println(123 + "456");
        
        // Stringから整数へ：Integer.parseInt()メソッド
        System.out.println(123 + Integer.parseInt("456"));

    }

}
