
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("** HOSGELDINIZ **");
        
        String islemler = "Islemler \n"
                            + "1. Yazilimci Islemleri \n"
                            + "2. Yonetici İslemleri \n"
                            + "Q = Cikis";
        
        System.out.println("***************************");
        System.out.println(islemler);
        System.out.println("***************************");
        
        while(true) {
            
            System.out.println("Islem Seciniz : ");
            String islem = scanner.nextLine();
            
            if(islem.equals("Q") || islem.equals("q")) {
                
                System.out.println("Cikis Yapiliyor.");
                break;
            }
            
            else if(islem.equals("1")) {
                
                Yazilimci yazilimci = new Yazilimci("KAAN", "KIZILAGIL", 17, "HTML, CSS, JAVASCRIPT, JAVA, PHP");
                
                String yazilimci_islemleri = "Yazilimci Islemleri \n"
                                                + "1. Format At \n"
                                                + "2. Bilgileri Goster \n"
                                                + "Q = Cikis";
                
                System.out.println(yazilimci_islemleri);
                
                while(true) {
                    
                    System.out.println("Islem Seciniz : ");
                    String ya_islem = scanner.nextLine();
                    
                    if(ya_islem.equals("Q") || ya_islem.equals("q")) {
                
                        System.out.println("Yazilimci Islemlerinden Cikis Yapiliyor.");
                        break;
                    }
                    
                    else if(ya_islem.equals("1")) {
                        
                        System.out.println("Isletim Sistemi : ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    }
                    
                    else if(ya_islem.equals("2")) {
                        
                        yazilimci.bilgileriGoster();
                    }
                    
                    else {
                        
                        System.out.println("Yazilimci icin gecersiz islem.");
                    }
                }
            }
            
            else if(islem.equals("2")) {
                
                Yonetici yonetici = new Yonetici("ERDEM", "DIRICAN", 16, 4);
                
                String yonetici_islemleri = "Yonetici Islemleri \n"
                                                + "1. Zam Yap \n"
                                                + "2. Bilgileri Goter \n"
                                                + "Q = Cikis";
                
                System.out.println(yonetici_islemleri);
                
                while(true) {
                    
                    System.out.println("Islem Seciniz : ");
                    String yo_islem = scanner.nextLine();
                    
                    if(yo_islem.equals("Q") || yo_islem.equals("q")) {
                
                        System.out.println("Yonetici Islemlerinden Cikis Yapiliyor.");
                        break;
                    }
                    
                    else if(yo_islem.equals("1")) {
                        
                        System.out.println("Zam Miktari : ");
                        int zam_miktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zam_miktari);
                    }
                    
                    else if(yo_islem.equals("2")) {
                        
                        yonetici.bilgileriGoster();
                    }
                    
                    else {
                        
                        System.out.println("Yonetici icin gecersiz islem.");
                    }
                }
            }
            
            else {
                
                System.out.println("Gecersiz Islem.");
            }
        }
    }
}
