public class Sortingstuff {

     int[] goBits(int[] nums, int target){
       int stuff[] = new int[2];
       for(int i = 0; i < nums.length;i++){
           for(int j=i+1;j<nums.length;j++){

               if(nums[i]+nums[j]==target){
                   stuff[0] = i;
                   stuff[1] = j;
                   return stuff;
               }
           }
         }

         return stuff;
     }


    public static void main(String[] args) {
        int nums1[] = {3,4,5,1};
        int target = 6;

        Sortingstuff st = new Sortingstuff();
        st.goBits(nums1, target);
    }
}
