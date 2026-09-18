/* 以下の要件に基づいて、コードを記述してください。

calculateAverageメソッドを定義します。
calculateAverage メソッドは、引数として整数型の配列 numbers を受け取り、配列内の数値の平均値を計算して返します。
平均値は、配列内の数値の合計を要素の個数で割ることで求めます。
calculateAverage メソッドから平均値を返します。
コマンドラインを実行すると

配列内の数値の平均値: 15.0
と出力されるようにしましょう*/

public class Average {
    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average =  (double) sum / numbers.length;
        return average;
    }
    public static void main(String[] args) {
        int[] numbers = {10, 20};
        double avg = calculateAverage(numbers);
        System.out.println("配列内の数値の平均値: " + avg);
    }
}