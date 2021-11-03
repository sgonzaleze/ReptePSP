/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Scanner;
import clases.FuncionesUser;
import static clases.FuncionesUser.isValid;
import clases.User;

/**
 *
 * @author cep
 */
public class Register {

    public static void registerUser() {
        Scanner sc = new Scanner(System.in);
        String nameuser;
        String passwd;
        String rpasswd;
        String name;
        String surnames;
        String email;
        int tel;
        int iban;
        System.out.println("Registre ");
        System.out.println("----");

        System.out.println("Nom d'usuari: ");
        nameuser = sc.nextLine();

        System.out.println("Contrasenya: ");
        passwd = sc.nextLine();

        System.out.println("Repetir Contrasenya: ");
        rpasswd = sc.nextLine();

        System.out.println("Nom: ");
        name = sc.nextLine();

        System.out.println("Cognoms: ");
        surnames = sc.nextLine();

        System.out.println("email: ");
        
        email = sc.nextLine();
       
        System.out.println("Número de teléfon: ");
        tel = sc.nextInt();

        System.out.println("Número de compte corrent: ");
        iban = sc.nextInt();

        System.out.println("Usuari Afegit!");
        System.out.println("----");
    }
}
