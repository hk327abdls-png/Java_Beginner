/*
1. String型のListを作成し、「りんご」「バナナ」「みかん」を追加する
2. Listの要素数を出力する
3. 拡張for文を使って全要素を出力する
4. 「バナナ」を削除し、再度全要素を出力する
要素数：3
りんご
バナナ
みかん
削除後：2
りんご
みかん */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("りんご");
        fruits.add("バナナ");
        fruits.add("みかん");

        System.out.println("要素数：" + fruits.size());

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.remove("バナナ");
        System.out.println("削除後：" + fruits.size());

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}