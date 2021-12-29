
package roadtoll;

import java.util.Objects;


public class RoadToll {
    
//      Vehicle v1 = new Vehicle ("car",4);
//      Vehicle v2 = new Vehicle ("bike",2);


    
    String TypeOfVehicle;
        int NumberOfTyres;

 
        
        

   public void RoadTollCalc() {
       
          
      if (NumberOfTyres == 2) {
          
              
              System.out.println( "Road Toll is 0 euro");
          }
          
      else if (NumberOfTyres == 4){
          
                  System.out.println( "Road Toll is 10 euro");
      }     
      
      else if(NumberOfTyres > 4){
                    
          System.out.println( "Road Toll is 20 euro");
          
      }
      else {
          System.out.println( "Incorrect Number of Tyres ");
      }
   }
   
   public RoadToll(){
       System.out.println(" Constructor executed ");
   }
   
   public RoadToll( String TypeOfVehicle, int NumberOfTyres){
       this.TypeOfVehicle = TypeOfVehicle;
       this.NumberOfTyres = NumberOfTyres;
       
   }
   
          }

//public class Vehicle 
//
//        private Vehicle(String car, int i) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//(String, int);
//
//public static void RoadTollCalc(){
//        int NumberOfTyres;
//    
//    if (NumberOfTyres = 2) {
//            int RoadToll;
//            RoadToll = 0;
//        System.out.println("Road Toll is free");
//    } else {NumberOfTyres = 4) {
//        RoadToll = 10;
//        System.out.println("Road Toll is 10 euro. ");    
//            }
//    }
//    if else {
//            }

