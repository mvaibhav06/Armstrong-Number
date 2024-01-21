import java.util.ArrayList;
import java.util.List;

public class ArmStrongNumber {
    public static boolean checkArmStrongNumber(int num){
        if (num<0) return false;
        List<Integer> temp = new ArrayList<>();
        int myNumber = num;

        while (myNumber>0){
            temp.add(myNumber%10);
            myNumber = myNumber/10;
        }

        int sum = 0;

        for (int i=0; i<temp.size(); i++){
            sum += (int) Math.pow(temp.get(i), temp.size());
        }
        if (sum == num) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkArmStrongNumber(243));

    }
}
