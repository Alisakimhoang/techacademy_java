package objectOriented;

public class Employee_03 {
    public String employeeName; // 社員名
    public String divisionName; // 部署名
    public int vitality;        // 体力

    // 引数なしのコンストラクタ
    public Employee_03() {
        System.out.println("インスタンス化時にコンストラクタが呼ばれました");
        employeeName = "未設定です";
        divisionName = "営業部";
        vitality = 0;
    }

    // 引数3つがあるコンストラクタ
    public Employee_03(String employeeName, String divisionName, int vitality) {
        System.out.println("インスタンス化時に引数ありコンストラクタが呼ばれました");
        this.employeeName = employeeName;
        this.divisionName = divisionName;
        this.vitality = vitality;
    }

    // 自己紹介メソッド
    public void introduce() {
        vitality = vitality - 10;
        System.out.println("私の名前は" + employeeName + "です。");
        System.out.println("所属部署は" + divisionName + "です。");
    }

    public void greeting() {
        // TODO Auto-generated method stub
        
    }

    public void showVitality() {
        // TODO Auto-generated method stub
        
    }
}
