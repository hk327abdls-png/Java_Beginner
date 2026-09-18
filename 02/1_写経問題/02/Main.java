// 【このファイルで確認すること】
// int 型変数を使った基本的な算術演算子（+, -, *, /）の動作を確認する。
//
// 【写経のポイント】
// ・Java の int 型は整数のみを扱う（小数点は切り捨て）
// ・算術演算子: + 加算, - 減算, * 乗算, / 除算, % 剰余
// ・int ÷ int の結果は int になる（小数部分は切り捨てられる）ことに注意
//

public class Main {
    public static void main(String[] args) {
        // 以下の手順でコードを実装する

        // 1. int型変数 num を宣言し 10 を代入する
        // ヒント: 「int num = 10;」

        int num = 10;

        // 2. num の値を出力する
        // 期待出力: 変数numの値は: 10

        System.out.println("変数numの値は: " + num);

        // 3. num + 5、num - 3、num * 2、num / 2 の結果をそれぞれ出力する
        // ヒント: System.out.println("加算結果: " + (num + 5)); のように括弧で囲む
        // 期待出力:
        //   加算結果: 15
        //   減算結果: 7
        //   乗算結果: 20
        //   除算結果: 5

        System.out.println("加算結果: " + (num + 5));
        System.out.println("減算結果: " + (num - 3));
        System.out.println("乗算結果: " + (num * 2));
        System.out.println("除算結果: " + (num / 2));
    }
}
