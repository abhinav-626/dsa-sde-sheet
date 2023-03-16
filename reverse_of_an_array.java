public class reverse_of_an_array {
    static void reverse_array(int[] arr, int start, int end){
        int temp;
        if(start>=end) return;
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverse_array(arr, start+1, end-1);
    }
    private static void print_array(int[] ar1, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(ar1[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] ar1= {5,6,4,25,6,5,3};
        print_array(ar1, 7);
        reverse_array(ar1, 0,6);
        System.out.println("reverse of the given array is:");
        print_array(ar1,7);

    }
}
