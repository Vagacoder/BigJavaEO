package ch09;

public class DynamicLookup {
    
    public static void printVehicleDescription(Vehicle v){
        System.out.println(v.getDescription());
    }

    public static void main(String[] args){
        Vehicle v1 = new Car();
        printVehicleDescription(v1);
    }
}