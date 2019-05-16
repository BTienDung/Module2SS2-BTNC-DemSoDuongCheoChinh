package season_2.TinhTongCacDuongCheoChinh;

import java.util.Scanner;

public class TinhSoDuongCheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so dong: ");
        int dong = sc.nextInt();
        System.out.printf("Nhap so cot: ");
        int cot = sc.nextInt();
        int mang[][] = new int[dong][cot];
        for (int i=0;i<dong;i++){
            for (int j=0;j<cot;j++){
                System.out.printf("a["+i+"]"+"["+j+"]: ");
                mang[i][j] = sc.nextInt();
            }
        }
        int tong =0;

        for (int i=0;i<dong;i++){
            for (int j=0;j<cot;j++){
                if (i==j&&i!=0&&j!=0){
                    tong++;
                }
            }
        }
        for (int i=0;i<dong;i++){
            for (int j=0;j<cot;j++){
                System.out.println(" "+mang[i][j]);
            }
            System.out.print("\n");
        }
        System.out.printf("Co "+tong+" duong cheo.");
    }
}
