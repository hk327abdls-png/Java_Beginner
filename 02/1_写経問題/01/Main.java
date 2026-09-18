// 【このファイルで確認すること】
// String 型変数の宣言・文字列の連結、および String 配列の宣言と for 文での反復処理を体験する。
//
// 【写経のポイント】
// ・Java では文字列を「 + 」演算子で連結できる（例: "Hello" + " World"）
// ・配列の宣言: 「String[] 配列名 = {"要素1", "要素2", ...};」
// ・for 文で配列の各要素を取り出すには配列名.length を使う
//

public class Main {
    public static void main(String[] args) {
        // 以下の手順でコードを実装する

        // 1. String型変数 message を宣言し "Hello" を代入する
        // ヒント: 「String message = "Hello";」の形で宣言する

        String message = "Hello";

        // 2. message に " World" を連結して再代入する
        // ヒント: 「message = message + " World";」または「message += " World";」

        message += " World";

        // 3. String型配列 colors に "Red", "Green", "Blue" を格納する
        // ヒント: 「String[] colors = {"Red", "Green", "Blue"};」

        String[] colors = {"Red", "Green", "Blue"};

        // 4. message の値を出力する
        // 期待出力: 変数messageの値は: Hello World

        System.out.println("変数messageの値は: " + message);

        // 5. for 文で colors の各要素を1行ずつ出力する
        // 期待出力:
        //   配列の要素は:
        //   Red
        //   Green
        //   Blue
        System.out.println("配列の要素は:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
