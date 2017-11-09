import java.util.ArrayList;
import java.util.List;

public class numbersArray {

    static int[][] multi = new int[][]{
            {2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323},
            {1, 3, 5, 7},
            {321, 320, 32, 3, 41241, -11, -12, -13, -66, -688}


    };

    public static int[] nearby(int x, int y, int range) {

        if (x < 0 || x >= multi.length)
            return new int[0];
        List<Integer> result = new ArrayList<>();
        for (int i = Math.max(y - range, 0); i <= y + range && i < multi[x].length; i++)
        {
            if (i != y)
            {
                result.add(multi[x][i]);
            }
        }
        return result.stream().mapToInt(e -> e).toArray();
    }

    public static void main(String[] args) {
        int[] result = nearby(0, 5, 2);
        for (int data:
             result) {
            System.out.println(data);

        }
    }
}
