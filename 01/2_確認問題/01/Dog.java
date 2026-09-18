// Q1 クラスとインスタンスの関係として正しいのはどれか
// ウ. クラスは設計図で、new 演算子でインスタンスを生成する

//Q2 コンストラクタの説明として正しいのはどれか
//イ. クラス名と同じ名前を持ち、インスタンス生成時に自動で呼ばれる

//Q3 以下のコードの空欄を埋めよ
//public class Dog {
//    private String name;

    // コンストラクタ：引数で受け取った name をフィールドに設定する
    //public Dog(String name) {
    //    this.name = name;
    //}

    // name を返すゲッターメソッド
    //public String getName() {
    //    return name;
    //}
//}

//Q4 以下のDogクラスを完成させ、main メソッドで2つのインスタンスを生成して、それぞれの名前をコンソールに出力せよ
// 出力例:
// わんこの名前: ポチ
// わんこの名前: 太郎
public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("ポチ");
        Dog dog2 = new Dog("太郎");

        System.out.println("わんこの名前: " + dog1.getName());
        System.out.println("わんこの名前: " + dog2.getName());
    }

}