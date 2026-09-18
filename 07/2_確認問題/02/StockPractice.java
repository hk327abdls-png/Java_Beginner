/* 以下の仕様でカスタム例外クラスと使用例を実装してください。

1. InvalidStockException という名前のRuntimeExceptionを継承したクラスを作成する
2. コンストラクタで「在庫が不足しています。要求数：XX、在庫数：XX」というメッセージを設定する
3. 在庫数を引数に取る checkStock(int required, int stock) メソッドを作成し、
required > stock の場合に InvalidStockException をスローする

要求数を10、在庫数を5とした場合の処理結果をコンソールに表示させてください。
コンソールに以下のように表示されればOKです。

在庫が不足しています。要求数：10、在庫数：5 */

public class StockPractice {
    public void checkStock(int required, int stock) {
        if (required > stock) {
            throw new InvalidStockException(required, stock);
        }
    }

    public static void main(String[] args) {
        StockPractice practice = new StockPractice();
        try {
            practice.checkStock(10, 5);
        } catch (InvalidStockException e) {
            System.out.println(e.getMessage());
        }
        }
}
