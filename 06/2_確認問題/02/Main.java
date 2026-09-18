/*
1. String型のキーとString型の値を持つMapを作成する
2. 以下の区分コードと名称を追加する
- "01" → "未着手"
- "02" → "対応中"
- "03" → "完了"
3. コード "02" の名称を取得して出力する
4. entrySetを使って全ペアを出力する
コンソールに以下のように表示されればOKです。
対応中
01 → 未着手
02 → 対応中
03 → 完了 */

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> codes = new HashMap<>();
        codes.put("01", "未着手");
        codes.put("02", "対応中");
        codes.put("03", "完了");

        String status02 = codes.get("02");
        System.out.println(status02);

        for (Map.Entry<String, String> entry : codes.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}