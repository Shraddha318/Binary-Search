public class SmallestLetter {
    public static void main(String[] args) {
        char [] letters= {'a','e','g','i','s','t','z'};
        char target='e';
        System.out.println(nextGreatest(letters,target));
    }
    static char nextGreatest(char[] letters,char target){
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
             if(letters[mid]<=target){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return letters[start%letters.length];
    }
}
