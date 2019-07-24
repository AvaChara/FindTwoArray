import java.util.Scanner;

/*在一个二维数组中（每个一维数组的长度相同）
 每一行都按照从左到右递增的顺序排序
 每一列都按照从上到下递增的顺序排序。
 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Solution {
    public static void main(String args[]){
        int target;
        Scanner sc=new Scanner(System.in);
        target = Integer.parseInt(sc.next());
        Solution solution=new Solution();
        System.out.println(solution.Find(target,solution.input_array()));
    }
    public boolean Find(int target, int [][] array) {
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if (target==array[i][j]) {
                    return true;
                }else
                    continue;
            }
        }
        return false;
    }
    public int[][] input_array(){
        int arr_x,arr_y;
        Scanner sc=new Scanner(System.in);
        arr_x = Integer.parseInt(sc.next());
        arr_y = Integer.parseInt(sc.next());
        int [][] array=new int[arr_x][arr_y];
        System.out.println(array.length);
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                array[i][j]=Integer.parseInt(sc.next());
            }
        }
        return array;
    }
}