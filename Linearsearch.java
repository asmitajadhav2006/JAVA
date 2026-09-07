public class Linearsearch {
static boolean Search(int[] arr, int x) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
        if (arr[i] == x) {
            return true;
        }
    }
    return false;
}
public static void main(String[] args) {
    int arr[] = {2, 3, 4, 5};
    int x = 4;
    if (Search(arr, x)) {
        System.out.println(x + " is present in the array.");
    } else {
        System.out.println(x + " is not present in the array.");
    }
}
}
