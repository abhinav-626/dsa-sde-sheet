class min_max_of_an_array {
    public static void main(String[]args){
        int[] arr1 = {4,5,65,63,6};
        findminmax(arr1);
    }

    private static void findminmax(int[] arr1) {
        int min=arr1[0];
        int max=arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            max=Math.max(max,arr1[i]);
            min=Math.min(min,arr1[i]);
        }
        System.out.println(max);
        System.out.println(min);


    }

}
