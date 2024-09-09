public class Main {
    public static void main(String[] args) {
        int[] arr= {2,4,5,6,7,8,9};
        int key=9;
        int a=search(arr,key);
        System.out.println(a);
    }
    static int search(int[] arr,int key){
      int start=0;
      int end=arr.length-1;
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