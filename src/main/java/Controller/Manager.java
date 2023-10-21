/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Library;
import java.util.Scanner;

/**
 *
 * @author QuaVi
 */
public class Manager {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Analysis String program ====");
        System.out.print("Input String: ");
        String inputString = scanner.nextLine();

        Library.getNumber(inputString);
        Library.getCharacter(inputString);
}
}
