public class Task28 {
    public static void main(String[] args){
        int[] array= {1,2,2,3,4,5};
        boolean result =either24(array);
        System.out.println(result);

    }

    public static boolean either24(int [] array){
        for (int i =0; i< array.length-1;i++){
            if (array[i]==2 && array[i+1] ==2  ||
                    array[i]==4 && array[i+1] ==4){

                return true;
            }
            if (array[i]==2 && array[i+1] ==2  &&
                    array[i]==4 && array[i+1] ==4){

                return false;
            }

        }
        return false;
    }
}
