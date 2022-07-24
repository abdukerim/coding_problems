public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int i : leftRotate(arr,2)) {
            System.out.print(i + " ");
        }

    }
    static int[] leftRotate(int[] arr,int d) {
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[i + arr.length - d] = temp[i];
        }
        return arr;
    }
}
