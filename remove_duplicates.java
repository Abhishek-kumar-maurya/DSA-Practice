import java.util.Arrays;
public class remove_duplicates{
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int count=0;
        for(int i = 0; i<n; i++){
              
            if(nums[i]!=nums[count]){
                count++;
                nums[count]=nums[i];
            }
            
        }
        System.out.println(Arrays.toString(nums));
        return count+1;
        
    }
    public static void main(String[] args){
        int[] nums = {1,1,2,2,2,3,3,3,8,8};
        remove_duplicates obj = new remove_duplicates();
        int result = obj.removeDuplicates(nums);
        System.out.println(result);
    }
}
