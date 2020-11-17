package lingxing;//菱形
import java.util.Scanner;
/*此题解法过多，仅仅提供为空心和实心棱形分别提供一个参考答案*/
public class  Lingxing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入2~20的有效数字");
        int length;
        while (true)
        {
             length=sc.nextInt();
            if (length>1&&length<=20)break;
            System.out.println("输入有误，请输入2~20的有效数字");
        }
        for (int i = 1; i <= length; i++) {//打印上半部分空格
            for (int j = 1; j <= length - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {//打印上半部分*
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = length-1; i >= 1; i--) {
            for (int j = 1; j <= length - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------");
        for (int i = 1; i <= length; i++) {
            // 打印上半部分空格
            for (int j = 1; j <= length - i; j++) {
                System.out.print(" ");
            }
            // 打印原本实心的*部分
            for (int j = 1; j <= 2 * i - 1; j++) {
                // 仅在一行的开头和末尾打印*
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        for (int i = length-1; i >= 1; i--) {
            // 打印下半部分空格
            for (int j = 1; j <= length - i; j++) {
                System.out.print(" ");
            }
            // 打印原本实心的*部分
            for (int j = 1; j <= 2 * i - 1; j++) {
                // 仅在一行的开头和末尾打印*
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
