public class Task19 {
    public static void main(String[] args){
        int [] array ={1,2,3,4,5};
        boolean result = haveThree(array);
        System.out.println(result);

    }

    public static boolean haveThree(int[] array){
            int sum =0;
        for ( int i = 0; i <array.length-1 ; i++){
            if (array[i]==3){
                sum ++;
            }
            if (sum==3 && (array[i]!=3 && array[i+1] !=3)){
                return true;
            }

            }
        return false;
    }

    }
}
