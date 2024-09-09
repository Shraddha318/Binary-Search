public class PositionofElementinInfiniteArrays {
    public static void main(String[] args) {
        int[] arr= {2,4,5,6,7,8,9,10,11,23,44,56,77,78,79,89,90,91,95,96};
        int key=9;
        int a=answer(arr,key);
        System.out.println(a);
    }
    static int answer(int[] arr,int key){
        int start=0;
        int end=1;
        while(key>arr[end]){
            int newStart=end+1;
            end=end+(end-start+1)*2;//end+size of the box(previous array)*2
            start=newStart;
        }
        return search(arr,key,start,end);
    }
    static int search(int[] arr,int key,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
