public class dmeo03 {
    /**
     * 任务三：寻找最大数经常在计算机应用程序中使用。例如：确定销售竞赛优胜者的程序要输入每个销售员的销售量，销量最大的员工为销售竞赛的优胜者，编写一个程序：从键盘输入10个数，表示10位员工的销售量，打印出其中最大的数。
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = new int[10];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max =  arr[i];
            }
        }
        System.out.println("最大值为：" + max);

    }
}
