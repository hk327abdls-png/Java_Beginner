// 【このファイルで確認すること】
// int 型配列を宣言し、for 文を使って各要素を順番に取り出して出力する基本の流れを体験する。
//
// 【写経のポイント】
// ・配列の宣言: 「int[] numbers = {1, 2, 3, 4, 5};」
// ・for 文: 「for (int i = 0; i < numbers.length; i++) { ... }」
// ・配列の要素への アクセス: 「numbers[i]」（インデックスは 0 から始まる）
// ・numbers.length は配列の要素数を返す
//

public class Main {
    public static void main(String[] args) {
        // int型配列 numbers に 1, 2, 3, 4, 5 を格納する
        // ヒント: int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers = {1, 2, 3, 4, 5};

        // for 文で numbers の各要素を1行ずつ出力する
        // ヒント: for (int i = 0; i < numbers.length; i++) { System.out.println(numbers[i]); }
        // 期待出力:
        //   1
        //   2
        //   3
        //   4
        //   5
        for (int i = 0; i < numbers.length; i++) { System.out.println(numbers[i]); }
    }
}
