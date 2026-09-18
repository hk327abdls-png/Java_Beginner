// 【このファイルで確認すること】
// クラスにフィールド（変数）を定義し、インスタンスを生成してその値を操作する基本の流れを体験する。
//
// 【写経のポイント】
// ・クラス名と public class の名前は必ず一致させること（このファイルは Person）
// ・フィールドとは、クラスの中・メソッドの外に宣言する変数のこと
// ・new キーワードでインスタンスを生成し、変数に代入する
//
// 【模範解答ファイル】Person.java を参照すること（先に自分で書いてから見ること）

// クラス名は Person とするため、public class の名前も Person にする必要があります。
// クラス名に合わせてファイル名も Person.java に変更してください。


public class Person {
    // String型のフィールド name を定義する
    // ヒント: クラスのフィールドは「型 変数名;」の形で宣言する（例: int age;）
    String name;

    public static void main(String[] args) {
        // Person のインスタンスを生成して name に "John" を代入し
        //       以下の形式で出力する
        // ヒント: 「クラス名 変数名 = new クラス名();」でインスタンスを生成できる
        // ヒント: 「変数名.フィールド名 = 値;」でフィールドに値を代入できる

        // 期待出力: Person's name is: John

        Person person = new Person();
        person.name = "John";
        System.out.println("Person's name is: " + person.name);
    }
}
