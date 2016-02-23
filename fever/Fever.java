
public class Fever {
    
    //Variable Declaration
    
    private static double userTemperature;
    
    
    
    //Method Declaration
    //main is the function that runs first and starts the lifecycle
    public static void main(String[] args) {
        
        //We are not taking input in this exercise
        
        userTemperature = 98.6;
        
        //Use if-else logic to determine proper response
        
        if(userTemperature < 98.6){
        System.out.println("Your temperature is low.");
        }
        else if(userTemperature > 98.6){
        System.out.println("Your temperature is high.");
        }
        else{
        System.out.println("Your temperature is normal.");
        }
    }
    
}