import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list2 = new int[20];
        list2[0] =0;
        list2[1] =1;
        for (int k = 2; k<20 ; k++){
            list2[k]+=list2[k-1]+list2[k-2];
        }
        System.out.println(Arrays.toString(list2));
    }
}