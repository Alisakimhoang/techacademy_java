
public class Review01 {

    public static void main(String[] args) {

        int product_price = 6000;
        double tax = 0.1;
        
 //getTax()メソッドを呼び出す
        int consumption_tax = tax(product_price, tax);
        
// 税込価格 = 商品価格 + 消費税額 //算出（キャストあり）
        int tax_included_price = (int) (product_price + consumption_tax);

// 演算結果を表示する
        System.out.println(product_price + "円の商品の税込価格は" + tax_included_price +
                "円（消費税は" + consumption_tax + "円）です。");
    }
    
// getTax()メソッドの定義（戻り値あり）
    public static int tax(int product_price, double tax) {

//消費税額算出（キャストあり）
        int consumption_tax = (int) (product_price * tax);
        return consumption_tax;
    }

}
