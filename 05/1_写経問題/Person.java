// 【基礎編05 写経問題】カプセル化とアクセス修飾子を使った Person クラスの実装
//
// ■このファイルで確認すること
//   private フィールド・コンストラクタ・ゲッターメソッドを使ったカプセル化の書き方
//
// ■カプセル化とは
//   クラスの内部データ（フィールド）を外部から直接触れないようにする仕組みです。
//   フィールドを private にすることで「外から直接変更できない」状態にし、
//   ゲッター（getter）メソッドを通じてのみ値を取得できるようにします。
//
// ■問題
//   以下の形式の Person クラスを完成させてください。
//   - private String型のフィールド name を定義する
//   - コンストラクタで name を受け取り、フィールドに代入する
//   - public String getName() ゲッターを定義し、name を返す
//
// ■ヒント
//   コンストラクタの引数名とフィールド名が同じ場合は this.name = name; と書きます。
//   ゲッターメソッドは「return フィールド名;」で値を返します。

public class Person {
    // private String型のフィールド name を定義する
    private String name;

    // コンストラクタを定義する（引数: String name）
    public Person(String name) {
        this.name = name;
    }

    // public String getName() ゲッターを定義する
    public String getName() {
        return name;
    }
}

// 別クラス（Main）も同ファイルに記述可
class Main {
    public static void main(String[] args) {
        // Person インスタンスを生成して getName() で取得した名前を出力する
        Person person = new Person("John Doe");
        String personName = person.getName();

        // 期待出力: （getName() で設定した名前が表示される）
        System.out.println("Personの名前: " + personName);
    }
}
