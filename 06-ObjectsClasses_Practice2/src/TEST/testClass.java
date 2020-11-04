/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEST;

/**
 *
 * @author danho
 */
public class testClass {

    public static void main(String[] args) {
        boolean b1 = false;
        boolean b2 = false;
        if (b2 != b1 == !b2){
            System.out.println("true");
        }
    }

    public void testString(String input) {
        switch (input) {

            case "a":
                System.out.println("apple");
            case "b" : System.out.println("bat");
            break;
            case "B" : System.out.println("big bat");
            default : System.out.println("None");
        }
    }
}
