public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr={2,3,5,7,8,9,10};
        int target=6;
        int a=search(arr,target);
        System.out.println(a);

    }
    static int search(int[] arr,int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
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
        return arr[start];
    }
}
