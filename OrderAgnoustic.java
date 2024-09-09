public class OrderAgnoustic {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        int key=8;
        int a=search(arr,key);
        System.out.println(a);
    }
    static int search(int[] arr,int key){
        int start=0;
        int end=arr.length-1;
        //int mid=start+(end-start)/2;
        while(start<=end){
            int mid=start+(end-start)/2;
        if(arr[start]>arr[end]){
                if(arr[mid]>key){
                    start=mid+1;
                }
                else if(arr[mid]<key){
                    end=mid-1;
                }
                else{
                    return mid;
                }}
        else{
                if(arr[mid]==key){
                    return mid;
                }
                else if(arr[mid]<key){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
        }}
        return -1;
    }
}
