package midtermexam_versiona_extensioncode;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MayxT
 */
import java.util.*;
public class testUserProfile {
    public static void main(String [] args){
    Scanner fetch= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = fetch.nextLine();

        System.out.println("Choose your genre from the list:)");
        for (int i = 0; i < UserProfile.genres.length; i++) {

            System.out.println((i+1) + ". " + UserProfile.genres[i]);
        }
        int genre = fetch.nextInt();

        UserProfile newUser = new UserProfile(name, UserProfile.genres[genre-1]);
        System.out.println("Your account has been created");
    }
}
