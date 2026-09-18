/* Q1（択一）
「商品の単価（税抜き・円・整数）」を表す変数に最も適切なデータ型はどれか。

イ. int


Q2（択一）
「消費税率（例: 0.10）」を表す変数に最も適切なデータ型はどれか。

ウ. double


Q3（択一）
以下のコードを実行したとき、出力される結果はどれか。
int a = 10;
int b = 3;
System.out.println(a / b);

イ. 3


Q4（穴埋め）
以下の変数宣言の空欄を埋めよ。

// 商品名（文字列）
[ String ] productName = "マイコンボードA";

// 単価（整数・税抜き）
[ int ] unitPrice = 3500;

// 在庫あり判定（真偽値）
[ boolean ] inStock = true;

// 消費税率（小数）
[ double ] taxRate = 0.10;


Q5（コーディング）
unitPrice = 3500、taxRate = 0.10 を使って税込み価格を計算し、出力せよ。
ただし、int 型で切り捨て計算すること。
 出力例:
 税込み価格: 3850円 */

 public class Tax {
    public static void main(String[] args) {
        int unitPrice = 3500;
        double taxRate = 0.10;
        double totalPrice = unitPrice + (unitPrice * taxRate);
        int result = (int) totalPrice;
        System.out.println("税込み価格: " + result + "円");
    }
 }