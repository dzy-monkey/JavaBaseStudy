package Array;

//将'A','B','C'存入数组，然后再输出
public class ArrayDemo03 {
    public static void main(String[] args) {
        char[] charArray = new char[3];
        charArray[0] = 'A';
        charArray[1] = 'B';
        charArray[2] = 'C';
        for (char num :
                charArray) {
            System.out.println(num);
        }
    }
}
