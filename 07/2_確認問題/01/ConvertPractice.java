/* 以下のメソッドを完成させてください。

メソッド名：convertToInt(String value)
処理：受け取った文字列を整数に変換して返す
例外処理：NumberFormatExceptionが発生した場合は -1 を返す

実装後、"42"と"abc"をconvertToIntに渡してその結果をコンソールに出力させてください。
コンソールに以下のように表示されればOKです。

42
-1
 */

public class ConvertPractice {
    public int convertToInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        ConvertPractice practice = new ConvertPractice();

        int result1 = practice.convertToInt("42");
        System.out.println(result1);

        int result2 =practice.convertToInt("abc");
        System.out.println(result2);
    }
}