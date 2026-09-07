public class reversearray {
    static void reverseprint(int[] arr) {
        int n = arr.length;
        System.out.print("Reversed Array: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[]={10,20,30,40,50};
        reverseprint(arr);
    }

    }
    
