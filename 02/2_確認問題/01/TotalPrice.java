/* 以下の要件に基づいて、コードを記述してください。

商品の価格と数量を示す変数を定義します。価格を表す変数名は price、数量を表す変数名は quantityとします。
商品の税率を示す変数 taxRate を定義し、適切な値を代入します。
商品の税抜き価格を計算し、変数 subtotal に代入します。税抜き価格の計算式は price * quantity です。
税額を計算し、変数 tax に代入します。税額の計算式は subtotal * taxRate です。
税込み価格を計算し、変数 total に代入します。税込み価格の計算式は subtotal + tax です。
変数 subtotal、tax、totalの値をそれぞれ表示します。
コマンドラインを実行すると

税抜き価格: $301.5
税額: $24.12
税込み価格: $325.62
と出力されるようにしましょう */

public class TotalPrice {
    public static void main(String[] args) {
        double price = 301.5;
        int quantity = 1;
        double taxRate = 0.08;
        double subtotal = price * quantity;
        double tax = subtotal * taxRate;
        double total = subtotal + tax;

        System.out.println("税抜き価格: $" + subtotal);
        System.out.println("税額: $" + tax);
        System.out.println("税込み価格: $" + total);
    }
}
