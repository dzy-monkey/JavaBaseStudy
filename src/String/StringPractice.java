package String;

//给定一个字符串，判断该字符串中是否包含某个子串。如果包含，求出子串的所有出现位置
public class StringPractice {
    public static void main(String[] args){
        String str = "ashdaabcsjabcabssjjabc";
        String str2="abc";
        int preStrLength= 0;
        while (true){
            int pos =str.indexOf(str2);
            if (pos == -1 ){
                break;
            }
            System.out.println("查找到子串的位置："+(pos+preStrLength));
            str=str.substring(pos + str2.length());
            preStrLength+=(pos + str2.length());
        }

    }
}
