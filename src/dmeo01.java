public class dmeo01 {
    /**
     * 任务一：某班同学上体育课，从1开始报数，共38人，老师要求按1、2、3重复报数，报数为1的同学往前走一步，而报数为2的同学往后退一步，试分别将往前走一步和往后退一步的同学的序号打印出来。
     * 要求：用循环语句实现，直接输出结果不计分。
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = new int[38];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        int count = 0;
        int index = 0;
        while (count < 38) {
            if (arr[index] == 1) {
                System.out.println(arr[index]);
                index++;
                count++;
            } else if (arr[index] == 2) {
                System.out.println(arr[index]);
                index--;
                count++;
            } else if (arr[index] == 3) {
                System.out.println(arr[index]);
                index++;
                count++;
            } else {
                index++;
            }
        }

    }
}
