public class Task25 {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        boolean result = has22(array);
        System.out.println(result);

    }

    public static boolean  has22(int[] array){
        for (int i = 0 ; i<array.length-1 ; i++){
            if ((array[i] ==2) && (array[i+1] ==2)){
                return true;

            }

        }
        return false;
    }
}
