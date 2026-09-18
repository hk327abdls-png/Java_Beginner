/* 以下のリストに対してStreamを使って処理してください。

List<Integer> scores = List.of(45, 78, 92, 33, 65, 81, 55, 90);
1. 60点以上の要素だけを抽出し、新しいListとして取得する
2. 全要素を2倍にした新しいListを取得する
3. 60点以上の要素の件数を取得する

コンソールに以下のように表示されればOKです。

60点以上: [78, 92, 65, 81, 90]
2倍: [90, 156, 184, 66, 130, 162, 110, 180]
60点以上の件数: 5
 */

import java.util.List;

public class ScorePractice {
    public static void main(String[] args) {
        List<Integer> scores = List.of(45, 78, 92, 33, 65, 81, 55, 90);

        List <Integer> over60 = scores.stream()
            .filter(score -> score >= 60)
            .toList();
        System.out.println("60点以上: " + over60);

        List<Integer> doubled = scores.stream()
            .map(score -> score * 2)
            .toList();
        System.out.println("2倍: " + doubled);

        long count = scores.stream()
            .filter(score -> score >= 60)
            .count();
            System.out.println("60点以上の件数: " + count);

    }
}