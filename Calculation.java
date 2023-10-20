

package ApexConstructionPrivateLimited;

public class Calculation {
    public static double getTotalPrice(Plot plot) {
        if (plot.getSectorName().equalsIgnoreCase("A")) {
            return plot.getPlotArea() * Rate.sectorAPrice;
        } else if (plot.getSectorName().equalsIgnoreCase("B")) {
            return plot.getPlotArea() * Rate.sectorBPrice;
        } else if (plot.getSectorName().equalsIgnoreCase("C")) {
            return plot.getPlotArea() * Rate.sectorCPrice;
        } else {
            return -1;
        }
    }

    public static double getTotalRegistryPrice(Plot plot, User user) {
        if (user.getGender().equalsIgnoreCase("Male")) {
            return (getTotalPrice(plot) * Rate.registryRateMale) / 100;
        } else if (user.getGender().equalsIgnoreCase("Female")) {
            return (getTotalPrice(plot) * Rate.registryRateFemale) / 100;
        } else {
            return -1;
        }
    }

    public static double getSGST(Plot plot, User user) {
        return (getTotalRegistryPrice(plot, user) * Rate.SGST) / 100;
    }

    public static double getCGST(Plot plot, User user) {
        return (getTotalRegistryPrice(plot, user) * Rate.CGST) / 100;
    }

    public static double getGreeTax(Plot plot) {
        return (getTotalPrice(plot) * Rate.greenTaxRate) / 100;
    }

    public static double getMembershipCost(Plot plot) {
        if (plot.getSectorName().equalsIgnoreCase("A")) {
            return Rate.clubMembershipA * Limitations.MINIMUMCLUBMEMBERSHIPYEAR;
        } else if (plot.getSectorName().equalsIgnoreCase("B")) {
            return Rate.clubMembershipB * Limitations.MINIMUMCLUBMEMBERSHIPYEAR;
        } else if (plot.getSectorName().equalsIgnoreCase("C")) {
            return Rate.clubMembershipC * Limitations.MINIMUMCLUBMEMBERSHIPYEAR;
        } else {
            return -1;
        }
    }

    public static double getSocietyDevelopmentTax(Plot plot) {
        if (plot.getSectorName().equalsIgnoreCase("A")) {
            return Rate.SDTSectorA;
        } else if (plot.getSectorName().equalsIgnoreCase("B")) {
            return Rate.SDTSectorB;
        } else if (plot.getSectorName().equalsIgnoreCase("C")) {
            return Rate.SDTSectorC;
        } else {
            return -1;
        }
    }

    public static double getSubsidy(double totalValue) {
        if (totalValue <= 3000000) {
            return totalValue - Rate.subsidy;
        } else {
            return totalValue;
        }
    }

}
