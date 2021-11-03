/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author cep
 */
public class FuncionesUser {

    public static void showMenu() {

        System.out.println("MENÚ PRINCIPAL: ");
        System.out.println("----");
        System.out.println("1.Registre");
        System.out.println("2.Accedir");
        System.out.println("0.Sortir ");
        System.out.println("----");

    }

    public static int answerUser() {
        //Respuesta que sera el menú al que quiere acceder al usuario.
        int userAnswer;
        Scanner sc = new Scanner(System.in);
        System.out.println("Opció ");
        do {
            userAnswer = sc.nextInt();
            if (validateAnswer(userAnswer)) {
                System.out.println("Choose a correct option! ");
            }
        } while (validateAnswer(userAnswer));
        return userAnswer;
    }

    public static boolean validateAnswer(int userAnswer) {
        return (userAnswer < 0 || userAnswer > 6);
    }

    public boolean stringCheck(String nameuser, String password, String rpassword, String name, String surname, String email) {
        if (nameuser.length() == 0) {
            return false;
        } else if (password.length() == 0) {
            return false;
        } else if (rpassword.length() == 0) {
            return false;
        } else if (name.length() == 0) {
            return false;
        } else if (surname.length() == 0) {
            return false;
        } else if (email.length() == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isValid(String email) {
        
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null) {
            return false;
        }
        return pat.matcher(email).matches();
    }
}
