/* 以下の要件に基づいて、コードを記述してください。

2つの整数を変数 num1 と num2 に代入します。
num1 と num2 の和、差、積、商、および剰余を計算して、それぞれの結果を表示します。
計算結果を表示する際には、意味のあるメッセージと共に表示します。 */

public class Calculate {
    public static void main(String[] args) {
        int num1 = 40;
        int num2 = 10;
        System.out.println("和: " + (num1 + num2));
        System.out.println("差: " + (num1 - num2));
        System.out.println("積: " + (num1 * num2));
        System.out.println("商: " + (num1 / num2));
        System.out.println("剰余 : " + (num1 % num2));
    }
}