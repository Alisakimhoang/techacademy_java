package objectOriented;

public class Employee_04 {
        // フィールド
        public String employeeName = "未設定です"; // 社員名
        public String divisionName = "営業部"; // 部署名
        public int vitality = 150;        // 体力

        // 引数なしのコンストラクタ
        public Employee_04() {
            this("未設定です");
            System.out.println("引数なしコンストラクタを終了しました");
        }

        // String型引数1つがあるコンストラクタ
        public Employee_04(String divisionName) {
            this(divisionName,"営業部");
            System.out.println("String型引数1つがあるコンストラクタを終了しました");
        }

        // String型引数2つがあるコンストラクタ
        public Employee_04(String employeeName, String divisionName) {
            this(employeeName,divisionName, 150);
            System.out.println("String型引数2つがあるコンストラクタを終了しました");
        }

        // String型引数2つ、int型引数1つあるコンストラクタ
        public Employee_04(String employeeName, String divisionName, int vitality) {
            System.out.println("インスタンス化時に引数ありコンストラクタが呼ばれました");
            this.employeeName = employeeName;
            this.divisionName = divisionName;
            this.vitality = vitality;
        }
}
