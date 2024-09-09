public class PeakIndex {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,8,7,6,4,1};
        int ans=search(arr);
        System.out.println(ans);
    }

    static int search(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        //int mid=start+(end-start)/2;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}