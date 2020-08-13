package String;

// 将一个字符串进行反转
public class StringPracticeSix {
    public static void main(String[] args) {
        String str = "abcdefg";
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr+=str.charAt(i);
        }
        System.out.println(newStr);
    }
}
