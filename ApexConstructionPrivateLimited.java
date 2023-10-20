
package ApexConstructionPrivateLimited;

   public class ApexConstructionPrivateLimited {
    
    public static void main(String[] args) {
        
        double length = 75;
        
        boolean result = Validation.validateLength(length, "B");
        
        if (result == true) {
            Plot plot = new Plot(length);
            User user = new User("Deepak Dangi", "7897895656", "Male");
            Estimation.printEstimation(plot, user);
        } else {
            System.out.println("Incorrect Length and sectorName");
        }
    }
}
