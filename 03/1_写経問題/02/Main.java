// 【このファイルで確認すること】
// switch 文の基本的な書き方を体験する。
// case ラベルと break 文の役割、default 句の使い方を確認する。
//
// 【写経のポイント】
// ・switch 文の書き方: 「switch (変数) { case 値: 処理; break; ... default: 処理; }」
// ・break を忘れると次の case に処理が流れてしまう（フォールスルー）
// ・どの case にも一致しない場合は default が実行される
// ・fruit の値を "apple" や "orange" などに変えて動作を確認してみること
//

public class Main {
    public static void main(String[] args) {
        String fruit = "apple";

        // switch 文を使って fruit の値に応じたメッセージを出力する
        // ヒント: switch (fruit) { case "apple": ...; break; ... default: ...; }
        // 期待出力（fruit="apple" の場合）:  It's a delicious apple!
        // 期待出力（fruit="banana" の場合）: I love bananas!
        // 期待出力（fruit="orange" の場合）: Oranges are refreshing!
        // 期待出力（その他の場合）:          Sorry, I'm not familiar with that fruit.
        switch (fruit) {
            case "apple":
                System.out.println("It's a delicious apple!");
                break;
            case "banana" :
                System.out.println("I love bananas!");
                break;
            case "orange" :
                System.out.println("Oranges are refreshing!");
                break;
            default:
                System.out.println("Sorry, I'm not familiar with that fruit.");
                break;
        }
    }
}
