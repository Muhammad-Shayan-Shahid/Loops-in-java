/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numpattern;
public class Numpattern {
    public static void main(String[] args) {
 //Output:       
//1
//12
//123
//1234
//12345
        
        for(int i=1; i<=5;i++){
            for(int j=1; j<=i;j++){
            System.out.print(j);
        }
            System.out.println();
        }
    }
    
}
