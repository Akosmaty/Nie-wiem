package pc;

import pc.cases.X1;
import pc.cases.X2;
import pc.gpu.GTX1660S;
import pc.gpu.RTX3090;
import pc.procesors.I3;
import pc.procesors.I5;
import pc.procesors.I7;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {



      /*  PC nowyKomp = new PcAssembler(new I5(), new X1(),new GTX1660S());
        System.out.println(nowyKomp.getModel());
        System.out.println(nowyKomp.getClock());
        System.out.println(nowyKomp.getGeneration());
        System.out.println(nowyKomp.getPrice());
        System.out.println(nowyKomp.getC_model());
        System.out.println(nowyKomp.getC_Size());
        System.out.println(nowyKomp.getC_Price());
        System.out.println(nowyKomp.getG_model());
        System.out.println(nowyKomp.getG_Clock());
        System.out.println(nowyKomp.getG_Memory());
        System.out.println(nowyKomp.getG_Price());*/
        int i = 0;
        int p = 0;
        int c = 0;
        int g = 0;
        Procesors procesor;
        Cases obudowa;
        Gpu gpu1;
        int pr = 0;
        int ca = 0;
        int gp= 0;

       System.out.println("Witaj w wypozyczalni komputerów PC. ");
        while (i==0){


            while (pr == 0) {
                System.out.println("Wybierz z jakim procesorem chcesz wypozyczyc komputer:");
                System.out.println("1 - i3, 2-i5, 3-i7");
                Scanner s = new Scanner(System.in);
                p = s.nextInt();
                switch (p) {
                    case (1):
                        procesor = new I3();
                        pr = 1;
                        System.out.println(procesor.getName());
                        break;
                    case (2):
                        procesor = new I5();
                        pr = 1;
                        break;
                    case 3:
                        procesor = new I7();
                        pr = 1;
                        break;
                    default:
                        pr = 0;
                        System.out.println("wybierz podnownie");

                }
            }
            System.out.println("wybierz obudowe do Swojego komputera");
            System.out.println("1 - x1, 2-x2");
            while (ca == 0) {

                Scanner sc = new Scanner(System.in);
                c = sc.nextInt();
                switch (c) {
                    case 1:

                        obudowa = new X1();
                        ca = 1;
                        break;
                    case 2:
                        obudowa = new X2();
                        ca = 1;
                        break;
                    default:
                        System.out.println("powtorz wybor obudowy 1 dla X1, 2 dla X2");
                        break;


                }
            }
            System.out.println("Wybierz karte graficzna swojego komputera");
            System.out.println("Kliknij: 1 dla GTX1660s, 2 dla RTX3090");
            while (gp == 0) {

                Scanner gsc = new Scanner(System.in);
                g = gsc.nextInt();
                switch (g) {
                    case 1:

                        gpu1 = new GTX1660S();
                        gp = 1;

                        break;
                    case 2:
                        gpu1 = new RTX3090();
                        gp = 1;
                        break;
                    default:
                        gp = 0;
                        System.out.println("powtorz wybor GPU klikjnij 1 dla GTX. 2 dla RTX");
                        break;


                }

            }

            System.out.println("czy chcesz dokonac zmian? jesli tak kliknij 1, jesli nie kliknij 0");
            Scanner si = new Scanner(System.in);
            i = si.nextInt();

            switch (i) {

                case 1:
                    i = 0;
                    pr = 0;
                    ca = 0;
                    gp = 0;
                case 0:
                    i=1;

            }
            PC pc = new PcAssembler(procesor,obudowa,gpu1);






          }




        }





    }












