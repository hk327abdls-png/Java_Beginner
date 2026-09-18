/* 以下の要件に基づいて、コードを記述してください。

ユーザーのテストの点数を示す変数 score を定義し、適切な値を代入します。
条件文を使用して、以下の成績評価を行います。
score が 90 以上ならば、"優秀です！" と表示します。
score が 70 以上 90 未満ならば、"合格です！" と表示します。
score が 70 未満ならば、"不合格です..." と表示します。 */

public class Main {
    public static void main(String[] args) {
        int score = 75;
        if (score >= 90) {
            System.out.println("優秀です！");
        }
        else if (score >= 70) {
            System.out.println("合格です！");
        }
        else {
            System.out.println("不合格です...");
        }
    }
}