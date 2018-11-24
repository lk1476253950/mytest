package arraytest;

/*
*   1
    比较两个数组是否相等
    要求：元素个数相同（数组中不会有相同元素），并且元素的值一一对应
*/
public class ArrayDemo01
{
    public static void main(String[] args) {
        int[] a = {1,3,7,5,9};
        int[] b = {9,7,3,5,1};
        System.out.println(compare(a, b));

    }
    public static boolean compare(int[] a,int[] b){
        //数组a中的元素和b的每个元素进行比较，如果有相同的则比较下一个
        if (a.length!=b.length){
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < b.length; j++) {
                if (a[i]==b[j]){
                    count++;
                }
            }
            if(count==0){
                return false;
            }
        }
        return true;
    }
}
