/* 以下の要件に基づいて、コードを記述してください。

reverseString メソッドを定義します。
reverseString メソッドは、引数として文字列 str を受け取り、文字列を逆順にして返します。
reverseString メソッド内では、StringBuilder クラスを使用して文字列を逆順に変換します。
reverseString メソッドから逆順の文字列を返します。 */

public class Reverse {
    public String reverseString (String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}