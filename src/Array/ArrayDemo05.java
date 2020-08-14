package Array;

//取得一个数组里面的最大值和最小值
public class ArrayDemo05 {
    public static void main(String[] args) {
        int[] scoreArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = scoreArray[0];
        int min=scoreArray[0];
        //最大值
        for (int i = 0; i < scoreArray.length; i++) {
            if (scoreArray[i] > max) {
                max = scoreArray[i];
            }
        }
        System.out.println(max);
        //最小值
        for (int i = 0; i < scoreArray.length; i++) {
            if (scoreArray[i] < max) {
                max = scoreArray[i];
            }
        }
        System.out.println(min);
    }
}
