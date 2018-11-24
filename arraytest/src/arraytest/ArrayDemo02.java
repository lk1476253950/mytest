package arraytest;

import java.util.Arrays;

/*
 *  2
    组合数组
    把两个数组组合在一起
    现在有两个数组，已经排序好了
    要求，定义一个新数组，它是两个原数组的组合，
    要求新数组元素从小到大排序
 *
 */
public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] a = {2,4,6,8,9,10,15};
        int[] b = {1,4,5,6,7,17,20};
        //{1,2,4,4,5,6,6,7,8,9,10,15,17,20
//        mergeArray(a,b);
        zuhe(a,b);
    }
    //讲师指导
    public static void zuhe(int[] a,int[] b){
        int[] arr = new int[a.length+b.length];
        int i = 0;//a数组下标
        int j = 0;//b数组下标
        int k = 0;//arr数组下标
        //循环条件  a和b其中一个的索引到了最后就结束循环
        while (i<a.length&&j<b.length){
            //a和b进行比较   小的存入arr  并且每存一次角标相应的++
            if(a[i]<b[j]){
                arr[k++] = a[i++];
            }else {
                arr[k++] = b[j++];
            }
        }
        //若是b索引完毕则执行 ：将a中剩余部分加入arr
        for (; i <a.length; i++) {
            arr[k++] = a[i];
        }
        //若是a索引完毕则执行 ：将b中剩余部分加入arr
        for (; j <b.length; j++) {
            arr[k++] = b[j];
        }
        System.out.println(Arrays.toString(arr));
    }



    //自己摸索  瞎搞的垃圾方法
    public static void mergeArray(int[] a,int[] b){
        int[] arr = new int[a.length+b.length];
        int j = 0;//arr的索引
        int temp = a[0];
        for (int i = 0; i < a.length; i++) {
            //b中数据比较
            if(b[i]>=temp){
                arr[j] = temp;//
                j++;
                temp = b[i];
                if (i == b.length-1) {
                    arr[arr.length-1] = b[i];
                }
            }else {
                arr[j] = b[i];
                j++;
            }
            //a中数据比较
            if(i!=a.length-1){
                if(a[i+1]>=temp){
                    arr[j] = temp;
                    j++;
                    temp = a[i+1];
                }else {
                    arr[j] = a[i+1];
                    j++;
                }
            }else {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
