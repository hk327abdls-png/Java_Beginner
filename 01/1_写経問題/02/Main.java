// 【このファイルで確認すること】
// 戻り値のある static メソッドを定義し、main メソッドから呼び出す流れを体験する。
//
// 【写経のポイント】
// ・static メソッドは「public static 戻り値型 メソッド名(引数) { ... }」の形で書く
// ・戻り値がある場合は return 文でメソッドの外に値を返す
// ・メソッド呼び出し結果を変数に受け取ってから出力することもできる
//
// クラス名は main とするため、public class の名前も main にする必要があります。
// クラス名に合わせてファイル名も Main.java に変更してください。
public class Main {
    // static メソッド addNumbers を定義する
    //       引数: int a, int b  /  戻り値: a と b を足した int
    // ヒント: 「return a + b;」のように return 文で値を返す

    public static int addNumbers(int num1, int num2){
        return num1 + num2;
    }

    public static void main(String[] args) {
        // addNumbers(5, 3) を呼び出して結果を出力する
        // ヒント: int result = addNumbers(5, 3); のように変数に受け取ってから出力するとわかりやすい
        // 期待出力: 8

        int result = addNumbers(3, 5);
        System.out.println(result);
    }
}
