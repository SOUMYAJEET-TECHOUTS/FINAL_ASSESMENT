package assessment;

 interface CompanyTest {
	 
	    static double calculateProfit(double costPrice, double sellingPrice) {
	        return sellingPrice - costPrice;
	    }

	    static String getCompanyName(double profit) {
	        if (profit >= 0) {
	            return "Techouts Solutions";
	        } else {
	            return "Unknown Company";
	        }
	    }


	    String getCompDetails(double profit, String name);
	}

