package org.example;

// Klavyeden girilen N elemanlı A dizisini küçükten büyüğe doğru "Tarak Sıralama (comb sort)" algoritmasıyla sıralayan program

import java.util.Scanner;

public class Main {
    public static void tarakSiralama(int[] a, int n) {

        int degisim = 1;
        int i,g;
        int gap = n;

        while ((gap != 1) || (degisim == 1)) {
            gap = (int) (gap / 1.3);
            if (gap < 1)
                gap = 1;
            degisim = 0;
            for (i = 0; i < n - gap; i++)
                if (a[i] > a[i + gap]) {
                    g = a[i];
                    a[i] = a[i + gap];
                    a[i + gap] = g;
                    degisim=1;
                }

        }

    }

    public static void main(String[] args) {

        int i,n;

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDizinin Eleman Sayısı : ");
        n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println();

        for (i=0; i<n; i++){
            System.out.printf("Dizinin "+(i+1)+". Elemanı : ");
            a[i] = scanner.nextInt();
        }

        tarakSiralama(a,n);
        System.out.print("\nSıralı Dizi : \n------------\n");
        for (i=0; i<n; i++)
            System.out.printf("%d\t",a[i]);
    }
}