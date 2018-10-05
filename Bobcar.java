import java.util.Scanner;

public class Bobcar {

	public static void main(String[] args) 
	{
		int carChoice;
		int economy = 35;
		int compact = 45;
		int standard = 95;
		int numDays;
		int clubMember;
		double basePrice;
		double packagePrice;
		int testDiscount;
		double discount;
		double totalPrice;

		Scanner input = new Scanner(System.in);

		System.out.println("Hi! Welcome to Bobcar Rent-A-Car. We have many different options for you!");
		System.out.println("Available cars: 1 for Economy, 2 for Compact, 3 for Standard");
		System.out.println("Please enter your car choice.");

		carChoice = input.nextInt();

		System.out.println("Please enter the number of rental days.");

		numDays = input.nextInt();

		//Checking to see if customer is compatible with the discount and executive package
		System.out.println("Are you a Bobcar Club Member? Please enter 1 for yes, and 0 for no.");

		clubMember = input.nextInt();

		if(clubMember == 1)
		{
			System.out.println("Would you like the Platinum Executive Package? Please enter 1 for yes, and 0 for no");

			int execPackage = input.nextInt();

			if(execPackage == 1)
			{
				if(carChoice == 1)
				{
					//Calculating total estimated price for the type of car
					basePrice = economy * numDays;

					System.out.println("Base: " + numDays + " days for an Economy @ $" + economy + " per day\t$" + basePrice);

					testDiscount = numDays / 7;

					discount = economy * testDiscount;

					System.out.println("Club Member Discount: \t\t\t\t-$" + discount);
					
					packagePrice = basePrice * .15;

					System.out.println("Platinum Executice Package: \t\t\t+$" + packagePrice);

					
					System.out.println();

					totalPrice = (double)(basePrice - discount + packagePrice);

					System.out.println("Total Estimate for Rental: \t\t\t $" + totalPrice);
				}

				else if(carChoice == 2)
				{
					basePrice = compact * numDays;

					System.out.println("Base: " + numDays + " days for a Compact @ $" + compact + " per day:\t$" + basePrice);

					testDiscount = numDays / 7;

					discount = compact * testDiscount;

					System.out.println("Club Member Discount: \t\t\t\t-$" + discount);
					
					packagePrice = (double)(basePrice * .15);

					System.out.println("Platinum Executice Package: \t\t\t+$" + packagePrice);

					System.out.println();

					totalPrice = (double)(basePrice - discount + packagePrice);

					System.out.println("Total Estimate for Rental: \t\t\t $" + totalPrice);
				}

				else if(carChoice == 3)
				{
					basePrice = standard * numDays;

					System.out.println("Base: " + numDays + " days for a Standard @ $" + standard + " per day:\t$" + basePrice);

					testDiscount = numDays / 7;

					discount = standard * testDiscount;

					System.out.println("Club Member Discount: \t\t\t\t-$" + discount);
					
					packagePrice = basePrice * .15;

					System.out.println("Platinum Executice Package: \t\t\t+$" + packagePrice);

					System.out.println();

					totalPrice = (double)(basePrice - discount + packagePrice);

					System.out.println("Total Estimate for Rental: \t\t\t $" + totalPrice);
				}
			}
			else
			{
				//For members that do not want to purchase the extra package
				if(carChoice == 1)
				{
					basePrice = economy * numDays;

					System.out.println("Base: " + numDays + " days for an Economy @ $" + economy + " per day:\t$" + basePrice);

					testDiscount = numDays / 7;

					discount = economy * testDiscount;

					System.out.println("Club Member Discount: \t\t\t\t-$" + discount);

					System.out.println();

					totalPrice = (double)(basePrice - discount);

					System.out.println("Total Estimate for Rental: \t\t\t $" + totalPrice);
				}

				else if(carChoice == 2)
				{
					basePrice = compact * numDays;

					System.out.println("Base: " + numDays + " days for a Compact @ $" + compact + " per day:\t$" + basePrice);

					testDiscount = numDays / 7;

					discount = compact * testDiscount;

					System.out.println("Club Member Discount: \t\t\t\t-$" + discount);

					System.out.println();

					totalPrice = (double)(basePrice - discount);

					System.out.println("Total Estimate for Rental: \t\t\t $" + totalPrice);
				}

				else if(carChoice == 3)
				{
					basePrice = standard * numDays;

					System.out.println("Base: " + numDays + " days for a Standard @ $" + standard + " per day:\t$" + basePrice);

					testDiscount = numDays / 7;

					discount = standard * testDiscount;

					System.out.println("Club Member Discount: \t\t\t\t-$" + discount);

					System.out.println();

					totalPrice = (double)(basePrice - discount);

					System.out.println("Total Estimate for Rental: \t\t\t $" + totalPrice);
				}
			}
		}
		else
		{
			//Calculations for customers that are not members of the club
			if(carChoice == 1)
			{
				basePrice = economy * numDays;

				System.out.println("Base: " + numDays + " days for an Economy @ $" + economy + " per day:\t$" + basePrice);

				System.out.println();

				totalPrice = (double)(basePrice);

				System.out.println("Total Estimate for Rental: \t\t\t $" + totalPrice);
			}

			else if(carChoice == 2)
			{
				basePrice = compact * numDays;

				System.out.println("Base: " + numDays + " days for a Compact @ $" + compact + " per day:\t$" + basePrice);

				System.out.println();

				totalPrice = (double)(basePrice);

				System.out.println("Total Estimate for Rental: \t\t\t $" + totalPrice);
			}

			else if(carChoice == 3)
			{
				basePrice = standard * numDays;

				System.out.println("Base: " + numDays + " days for a Standard @ $" + standard + " per day:\t$" + basePrice);

				System.out.println();

				totalPrice = (double)(basePrice);

				System.out.println("Total Estimate for Rental: \t\t\t $" + totalPrice);
			}
		}
		input.close();
	}
}