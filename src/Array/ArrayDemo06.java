package Array;

//把数组里面的元素倒置
public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] scoreArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < (scoreArray.length / 2); i++) {
            int temp = scoreArray[i];
            scoreArray[i] = scoreArray[scoreArray.length - 1 - i];
            scoreArray[scoreArray.length - 1 - i] = temp;
        }
        for (int i = 0; i < scoreArray.length; i++) {
            System.out.print(scoreArray[i] + " ");
        }
    }
}
