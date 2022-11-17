
public class Review01Test {

    public static void main(String[] args) {
//                int product_price = 7000;
//                double tax = 0.1;
//                
//                int consumption_tax = getTax(product_price, tax);
//                
//                int tax_included_price = (int) (product_price + consumption_tax);
//
//                System.out.println(product_price + "円の商品の税込価格は" + tax_included_price +
//                        "円（消費税は" + consumption_tax + "円）です。");
//            }
//            
//            public static int getTax(int product_price, double tax) {
//
//                int consumption_tax = (int) (product_price * tax);
//                return consumption_tax;
//            }
//
//}
        int product_price = 7000;
        double tax = 0.1;
        
        int consumption_tax = getTax(product_price, tax);
       int  tax_included_price =  (int) (product_price + consumption_tax);
        
       System.out.println(product_price + "円の商品の税込価格は" + tax_included_price +
             "円（消費税は" + consumption_tax  + "円）です。");
    }
        public static int getTax(int product_price, double tax) {
            int consumption_tax = (int ) (product_price* tax);        
            return consumption_tax;
        }
}