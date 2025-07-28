/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package halfpayrimid;
public class Halfpayrimid {
    public static void main(String[] args) {
        
        for(int i=1; i<=4;i++){
            for(int j=3; j>=i;j--){
            System.out.print(" ");
        }
            for(int k=1; k<=i;k++){
            System.out.print("*");
        }
            System.out.println();
        }
    }
    
}
