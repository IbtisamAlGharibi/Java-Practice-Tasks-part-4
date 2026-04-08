public class Task17 {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        int n = 4;
        boolean result = isEverywhere(array,n);
        System.out.println(result);

    }

    public static boolean  isEverywhere(int [] array, int n){
        for (int i =0; i< array.length-1;i++){
            if(array[i] + array[i+1] == n){
                return true;
            }

        }
        return false;
    }
}
