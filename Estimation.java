package ApexConstructionPrivateLimited;
public class Estimation {

    public static void printEstimation(Plot plot, User user) {
        
        System.out.println("User Name " + user.getUserName());
        System.out.println("User MobileNumnber " + user.getMobileNumber());
        System.out.println("User Gender " + user.getGender());
        System.out.println("Plot Sector Name " + plot.getSectorName());
        System.out.println("Length " + plot.getLength());
        System.out.println("Breadth " + plot.getBreadth());
        System.out.println("Total Area " + plot.getPlotArea());

        double totalCost = Calculation.getTotalPrice(plot);
        double registryCharges = Calculation.getTotalRegistryPrice(plot, user);
        double greenTax = Calculation.getGreeTax(plot);
        double SDTCharge = Calculation.getSocietyDevelopmentTax(plot);
        double clubMembership = Calculation.getMembershipCost(plot);
        double sgst = Calculation.getSGST(plot, user);
        double cgst = Calculation.getCGST(plot, user);
        double grandTotal = totalCost + registryCharges + greenTax + SDTCharge + clubMembership + sgst + cgst;
        double subsidy = Calculation.getSubsidy(totalCost);

        System.out.println("Total Cost " + totalCost);
        System.out.println("Total Registry Charge " + registryCharges);
        System.out.println("Total Green Tax " + greenTax);
        System.out.println("Total SGST " + sgst);
        System.out.println("Total CGST " + cgst);
        System.out.println("Total SDTCharge " + SDTCharge);
        System.out.println("Total ClubMembership " + clubMembership);
        System.out.println("Total Grand Total " + grandTotal);
        System.out.println("Total Grand Total After Subsidy " + subsidy);

    }
}
