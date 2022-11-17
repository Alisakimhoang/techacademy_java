package animal;

// Animal クラスを継承し、Thinkable インターフェイスを実装
public class Human extends Animal implements Thinkable {
    
    // フィールド
    private String hobby;

    // コンストラクタ
    public Human() {
    }
    
    // スーパークラス 引数ありコンストラクタ
    public Human(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }
}
