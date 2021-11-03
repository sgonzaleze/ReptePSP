/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repteuf1_gonzalezs;
import clases.FuncionesUser;
/**
 *
 * @author cep
 */
public class RepteUF1_GonzalezS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("App de Encriptación");

        int option;

        do {

            FuncionesUser.showMenu();

            option = FuncionesUser.answerUser();

            switch (option) {
                case 1:
                    /*You insert a password(String) and then tell you the 
                    encrypted password.
                     */
                    
                    break;

                case 2:

                    /*You put a password, then the encrypted that you get on
                    the other function(Funciones.insertPswd), and then 
                    the program tell you if are the same or not.
                     */
                   

                    break;

                case 0:
                    /*Leaving the program */
                    System.out.println("Leaving the program...");

                    break;

            }

        } while (option != 0);
    }
    
}
