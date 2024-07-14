package assessment;
public class CompanyTestMain {

	public static void main(String[] args) {
		
		        double costPrice = 20000.0;
		        double sellingPrice = 25000.0;

		        double profit = CompanyTest.calculateProfit(costPrice, sellingPrice);
		        System.out.println("Profit: " + profit);

		        String companyName = CompanyTest.getCompanyName(profit);
		        System.out.println("Company Name: " + companyName);
                    //lamda exp
		        CompanyTest company = (p, name) -> "Company: " + name + ", Profit: " + p;
                          
		        String compDetails = company.getCompDetails(profit, companyName);
		        System.out.println(compDetails);
		    }

	}