/*
Háromszöges példa alapján a téglalapot is elkészíteni. 
Ha a téglalap 2 oldala nagyobb, mint 20, akkor Exceptions-t kapjunk. 
Kiírás előtt listába tesszük, majd abból olvassuk ki a sikeres téglalapokat.
 */
package objectstreamteglalap;
import java.io.Serializable;
/**
 *
 * @author admin
 */
public class Teglalap implements Serializable{

    private int a, b, c;

    public Teglalap(int a, int b) {
        if ((a+b<20) && (b+b<20) && (a+a<20) && a!=b) {
            this.a = a;
            this.b = b;
        } else {
            throw new IllegalArgumentException("Nem hozható létre a téglalap!");
        }
        
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Teglalap{" + "a=" + a + ", b=" + b + '}';
    }

    

   

    
    
    
}
   
    

   
    
    

