
public class MainConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	Tax on Annual Income Calculator
		 	Tax calculation for individual - 1 April 2018 to 31 March 2019
		 	Income Tax Rate												Income				Tax
		 	Income up to $14000, taxed at 10.5%							$14,000.00			$1,470.00				
		 	Income over $14000 and up to $48000, taxed at 17.5%			$34,000.00			$5,950.00
		 	Income over $48000 and up to $70000, taxed at 30%			$22,000.00			$6,600.00
		 	Remaining income over $70000, taxed at 33%					$0					$0
		 	Total														$70,000.00			$14,020.00
		 */
		// Java primitive types: boolean, byte, char, short, int, long, float and double
		
		double userSalary = 70000;
		System.out.println("Salary: " + userSalary);
		
		double resultLevel1 = 0;
		double resultLevel2 = 0;
		double resultLevel3 = 0;
		double resultLevel4 = 0;
		
		
		if (userSalary <= 14000) {
			resultLevel1 = userSalary * 0.105;
			System.out.println("Income up to $14000, taxed at 10.5%: " + resultLevel1);
			return;
		}
		
		if (userSalary > 14000 && userSalary <= 48000) {
			resultLevel1 = 14000 * 0.105;
			resultLevel2 = (userSalary - 14000) * 0.175;
			System.out.println("Income up to $14000, taxed at 10.5%: " + resultLevel1);
			System.out.println("Income up to $48000, taxed at 17.5%: " + resultLevel2);
			return;
		}
		
		if (userSalary > 48000 && userSalary <= 70000) {
			resultLevel1 = 14000 * 0.105;
			resultLevel2 = (userSalary - 14000) * 0.175;
			resultLevel3 = (userSalary - 48000) * 0.3;
			System.out.println("Income up to $14000, taxed at 10.5%: " + resultLevel1);
			System.out.println("Income up to $48000, taxed at 17.5%: " + resultLevel2);
			System.out.println("Income up to $70000, taxed at 30%: " + resultLevel3);
			return;
		}
		
		if (userSalary > 70000) {
			resultLevel1 = 14000 * 0.105;
			resultLevel2 = (userSalary - 14000) * 0.175;
			resultLevel3 = (userSalary - 48000) * 0.3;
			resultLevel4 = (userSalary - 70000) * 0.33;
			System.out.println("Income up to $14000, taxed at 10.5%: " + resultLevel1);		
			System.out.println("Income up to $48000, taxed at 17.5%: " + resultLevel2);
			System.out.println("Income up to $70000, taxed at 30%: " + resultLevel3);
			System.out.println("Remaining income over $70000, taxed at 33%: " + resultLevel4);
			return;
		}
	}

}
