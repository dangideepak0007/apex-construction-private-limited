
package ApexConstructionPrivateLimited;

public class Validation {
    
    public static boolean validateLength(double length, String sectorName) {
        if (sectorName.equalsIgnoreCase("B")) {
            if (length >= Limitations.minimumSectorBLength && length <= Limitations.maximumSectorBLength) {
                return true;
            } else {
                return false;
            }
        } else if (sectorName.equalsIgnoreCase("C")) {
            if (length >= Limitations.minimumSectorCLength && length <= Limitations.maximumSectorCLength) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean validateBreadth(double breadth, String sectorName) {
        if (sectorName.equalsIgnoreCase("C")) {
            if (breadth >= Limitations.minimumSectorCBreadth && breadth <= Limitations.maximumSectorCBreadth) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}

