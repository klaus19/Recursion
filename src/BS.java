public class BS {

    public static void main(String[] args) {

        int[] nums = new int[]{4,3,6,7};
        BS bs = new BS();

        bs.search(nums,3);

    }

      int search(int []nums,int target){


        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return 1;
            }else{
                return -1;
            }
        }
        return 1;
    }

}
