/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Renan Monteiro
 * <renanmonteiro@msn.com>
 * github.com/renancmonteiro/
 * https://play.google.com/store/apps/developer?id=Renan+Costalonga+Monteiro
 */
public class Main {

    public static void main(String[] args) {

        SingleInstanceClass single1 = SingleInstanceClass.getInstance();

        single1.setMessage("This is a message for example");

        SingleInstanceClass single2 = SingleInstanceClass.getInstance();

        if (single1 == single2) {
            System.out.println("single1 and single2 are the same object");
            System.out.println(single1);
            System.out.println(single2);
        }
    }

}
