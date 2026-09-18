/*
Personクラスには、name（文字列型）、age（整数型）、address（文字列型）の
3つのプライベートなインスタンス変数があります。
Personクラスには、それぞれのインスタンス変数にアクセスするための
公開されたゲッターメソッドとセッターメソッドを定義してください。
次の形式のPersonクラスを定義してください：

また、以下のmainメソッドを含む別のクラスを定義して、Personクラスのインスタンスを作成し、
セッターメソッドとゲッターメソッドを使用して値を設定し、取得してください。取得した値は出力して確認してください。
*/

public class Person {
    // プライベートな文字列型のインスタンス変数 name の定義
    private String name;

    // プライベートな整数型のインスタンス変数 age の定義
    private int age;

    // プライベートな文字列型のインスタンス変数 address の定義
    private String address;

    // nameのゲッターメソッドの定義
    public String getName() {
        return name;
    }

    // nameのセッターメソッドの定義
    public void setName(String name) {
        this.name = name;
    }

    // ageのゲッターメソッドの定義
    public int getAge(){
        return age;
    }

    // ageのセッターメソッドの定義
    public void setAge(int age) {
        this.age = age;
    }

    // addressのゲッターメソッドの定義
    public String getAddress() {
        return address;
    }

    // addressのセッターメソッドの定義
    public void setAddress(String address) {
        this.address = address;
    }
}

class Main{
    public static void main(String[] args){
        Person person = new Person();

        person.setName("山田太郎");
        person.setAge(28);
        person.setAddress("東京都");

        System.out.println("名前: " + person.getName());
        System.out.println("年齢: " + person.getAge());
        System.out.println("住所: " + person.getAddress());
    }
}