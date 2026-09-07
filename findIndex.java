public class findIndex {
    static int findIndex(int[] arr,int x){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5};
        int x = 4;
        int index = findIndex(arr, x);
        if(index != -1){
            System.out.println(x + " is present at index " + index);
        } else {
            System.out.println(x + " is not present in the array.");
        }
    }
    
}
