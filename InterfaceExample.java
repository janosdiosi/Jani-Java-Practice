
package interfaceexample;

interface WaterBottleInterface {
    
    String color = "Blue";
    
    void fillUp();
    void pourOut();
    
}

public class InterfaceExample implements WaterBottleInterface {

    
    public static void main(String[] args) {
       
        System.out.println("interfaceexample.InterfaceExample.main()");
        System.out.println(color);
        
        InterfaceExample ex = new InterfaceExample();
        ex.fillUp();
        
    }

    @Override
    public void fillUp() {
        System.out.println("It is filled");
    }

    @Override
    public void pourOut() {
        System.err.println(" It is empty"); 
    }
    
}
