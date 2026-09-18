/* 以下の要件に基づいて、Javaのプログラムを作成してください。

Mainクラスを定義します。
Mainクラスのmainメソッド内で、整数型の配列を宣言し、任意の数の整数を配列に格納します。
配列の要素は {10, 20, 30, 40, 50} としますが、必要に応じて任意の整数を追加しても構いません。
配列内の数値の合計を計算するための変数 sum を宣言し、0で初期化します。
forループを使用して、配列内の各要素を取り出して sum に加算します。
最終的な合計を "配列内の数値の合計: " というメッセージと共に出力してください。 */

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("配列内の数値の合計: " + sum);
    }
}