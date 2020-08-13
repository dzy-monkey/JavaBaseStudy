package String;

// 编写程序将"jdk" 全部变成大写，并输出到控制台，截取子串"DK"，输出到控制台
public class StringPracticeThree {
    public static void main(String[] args) {
        String str ="jdk";
        str=str.toUpperCase();
        System.out.println(str);
        System.out.println(str.substring(1));
    }
}
