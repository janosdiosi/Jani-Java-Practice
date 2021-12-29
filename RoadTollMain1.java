
package roadtoll;


public class RoadTollMain1 {
//int i;
   
    
    
    public static void main(String[] args) {
     
        RoadToll rt1 = new RoadToll();
        rt1.TypeOfVehicle = "Sedan";
        rt1.NumberOfTyres = 4;
        System.out.println(rt1.TypeOfVehicle +"\t" + rt1.NumberOfTyres);
        rt1.RoadTollCalc();
        
        System.out.println("**********");
        
        RoadToll rt2 = new RoadToll();
        rt2.TypeOfVehicle = "Bike";
        rt2.NumberOfTyres = 2;
        System.out.println(rt2.TypeOfVehicle +"\t" + rt2.NumberOfTyres);
        rt2.RoadTollCalc();
        
        System.out.println("**********");
        
        RoadToll rt3 = new RoadToll("Truck", 8);
        System.out.println(rt3.TypeOfVehicle +"\t" + rt3.NumberOfTyres);
        rt3.RoadTollCalc();
        
//        v3 = new vehicle ("truck", 4);
        
    
        
    }
          
      }
        
   
    
    
    

