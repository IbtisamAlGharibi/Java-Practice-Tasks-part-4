public class Task27 {
    public static void main(String[] args){
            String [] array = fizzArray2(6);
            for (String n:array){
                System.out.println(n);
            }


    }

    public static String[] fizzArray2(int n) {
        String [] array = new String[n];

        for ( int i =0; i<n; i++){
            array[i] = i+"";

        }
        return array;

    }
}
