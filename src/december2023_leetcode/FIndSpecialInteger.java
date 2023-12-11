package december2023_leetcode;

public class FIndSpecialInteger {
    public static int findSpecialInteger(int[] arr){
        int quarter = arr.length/4;
        for(int i = 0; i < arr.length - quarter; i++){
            if (arr[i] == arr[i + quarter]){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FIndSpecialInteger ff = new FIndSpecialInteger();
        int[] arr = {1,2,2,6,6,6,6,7,10};
        System.out.println(findSpecialInteger(arr));
    }
}
