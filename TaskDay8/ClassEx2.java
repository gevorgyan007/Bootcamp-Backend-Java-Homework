package TaskDay8;

public class ClassEx2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = arr.length - 1; i>= 0; i--) {
            System.out.print(arr[i] + ",");
        }
    }
}
