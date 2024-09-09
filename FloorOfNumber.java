public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 8, 9, 10};
        int target = 1;
        int a = search(arr, target);
        System.out.println(a);
    }
    static int search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        if(target<arr[start]){
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return arr[end];
    }
}
