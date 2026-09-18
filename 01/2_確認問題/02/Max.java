//Q1 以下のメソッドの戻り値の型として正しいのはどれか
//public ___ greet(String name) {
//    return "こんにちは、" + name + "さん"; }
//ウ. String

//Q2 以下のうち、void メソッドの正しい呼び出し方はどれか
//public void printCount(int count) {
//    System.out.println("件数: " + count); }
//イ. printCount(5);

//Q3 引数が2つ・戻り値が int のメソッドシグネチャとして正しいのはどれか
//イ. public int add(int a, int b)

//Q4 2つの int（a, b）を受け取り、大きい方の値を返す static メソッド max を実装せよ。
//また、main メソッドから max(10, 25) を呼び出して結果を出力せよ。
// 出力例:
// 大きい方: 25

public class Max {
    public static int max(int a, int b){
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        int result = max(10, 25);
        System.out.println("大きい方: " + result);
    }
}