import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        int [] values = new int[] {6, 7, 8, 7, 6, 6};
        Arrays.sort(values);
        int res = 0;
        int count  = 0;
        for  (int i = 0; i < values.length-1; i++){
            if(values[i] == values[i+1]){
                i++;
                continue;
            }
            res = res + values[count]*10;
            count++;
        }
        System.out.println(res);
    }
}
