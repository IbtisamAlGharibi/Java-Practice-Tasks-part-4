public class Task22 {
    public static void main(String[] args){
        int [] nums ={1,2,3,4,5};
        int value=3;
        int[] result = notAlone(nums,value);
        System.out.println(result);

    }

    public static int[] notAlone(int[] nums, int value) {

        for (int i = 1; i < nums.length - 1; i++) {

            if (nums[i] == value && nums[i - 1] != value && nums[i + 1] != value) {
                nums[i] = Math.max(nums[i - 1], nums[i + 1]);
            }
        }

        return nums;
    }
}
