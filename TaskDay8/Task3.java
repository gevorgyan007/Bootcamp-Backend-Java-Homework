package TaskDay8;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[]{ 1, -1 , 2,  3 , -8};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
