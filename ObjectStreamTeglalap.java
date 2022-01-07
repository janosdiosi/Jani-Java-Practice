/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectstreamteglalap;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class ObjectStreamTeglalap {

    public static File f = new File("teglalap.dat");
    public static ArrayList<Teglalap> tomblista = new ArrayList<Teglalap>();

    public static void main(String[] args) {

        teglalapLetrehozas(100);
        teglalapKiolvasas();
        teglalapKiiras();

    }

    private static void teglalapLetrehozas(int i) {
        int counter = 0;
        int wrongCounter = 0;

        try (FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            while (counter < i) {
                try {
                    Teglalap h = new Teglalap(
                            (int) (Math.random() * 5 + 1),
                            (int) (Math.random() * 5 + 1)
                    );

                    oos.writeObject(h);
                    counter++;
                } catch (IllegalArgumentException e) {
                    wrongCounter++;
                    //System.out.println("Nem jött létre");
                } 

            }

        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFound");
        } catch (IOException ex) {
            System.out.println("IOException");
        } catch (Exception e) {
        }
        System.out.println(counter);
        System.out.println(wrongCounter);
        System.out.println("Létrehozás véget ért");
    }

    private static void teglalapKiolvasas() {

        try (FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis)) {

            while (true) {
                Object o = ois.readObject();
                tomblista.add((Teglalap) o);
                //System.out.println(o.toString());

            }

        } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException");
        } catch (EOFException ex) {
            System.out.println("kiolvasás Vége..");
        } catch (IOException ex) {
            System.out.println("IOException");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException");
        } catch (Exception e) {
        }

    }

    private static void teglalapKiiras() {
for (Teglalap haromszog : tomblista) {
            System.out.println(haromszog);
    }

}
}