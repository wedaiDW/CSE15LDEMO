public class App {
    public int[] sum(int[] nums,int k){
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;i<j;j--){
                if(k==nums[i]+nums[j]){
                    result[0]=nums[i];
                    result[1]=nums[j];
                    break;
                }
            }
        }
        return result;
    }
}
