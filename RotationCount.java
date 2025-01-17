public class RotationCount {
    public static void main(String[] args) {
        int[] arr={9,10,11,12,13,2,4,5,6,7,8};
        int a=search(arr);
        System.out.println(a);
    }
    static int search(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid+1;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
