package array1dimensi;

import java.util.Scanner;

/**
 *
 * @author Florentina Minovela
 * TGL: 12 April 2025
 */
public class Array1Dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[] NMA = new String[5];
       
       NMA[0]="Leonard";
       NMA[1]="Silva";
       NMA[2]="Teresa";
       NMA[3]="Michael";
       NMA[4]="Verena";
       
       Scanner inp = new Scanner(System.in);
       System.out.println("~~~~~Input Data Ke Array~~~~~");
       for(int idx=0; idx<5; idx++ ){
           System.out.printf("Data Pengunjung ke-%d: ", idx+1);
           NMA[idx] = inp.nextLine();
       }
       
       System.out.println("~~~~~Output Data Ke Array~~~~~");
       for(int idx=0; idx<5; idx++ ){
           System.out.println("Data Pengunjung ke-"+(idx+1)+": "+NMA[idx]);
       }
       
       System.out.println("~~~~~Output2 Data Ke Array~~~~~");
       int no=1;
       for (String isi : NMA) {
           System.out.println(no+". "+isi);
           no++;
       }

       
       
    }
    
}
