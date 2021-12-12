public class Sorting {


    static void myMethod(){
        int[] nums =new int[]{4,5,6,1};
        int temp=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }


    public static void main(String[] args) {

        Sorting s = new Sorting();
        myMethod();
    }
}
