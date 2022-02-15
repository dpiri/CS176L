package HousePainting;
import java.util.Scanner;

public class HousePainting {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); 
			
			//Variables
			double lenghtofhouse = 40;
			double widthofhouse = 15;
			double heightofhouse = 25;
			double numberofwindows = 10;
			double lenghtofwindows = 4;
			double widthofwindows = 2;
			double numberofdoors = 2;
			double lenghtofdoor = 6;
			double widthofdoor = 3;
			double costPerSqft = 5;
			
			//Inputs
			System.out.println("Enter lenght of house;");
			lenghtofhouse = sc.nextDouble();
			System.out.println("Enter width of house");
			widthofhouse = sc.nextDouble();
			System.out.println("Enter height of house");
			heightofhouse = sc.nextDouble();
			System.out.println("Enter number of windows");
			numberofwindows = sc.nextDouble();
			System.out.println("Enter lenght of each window");
			lenghtofwindows = sc.nextDouble();
			System.out.println("Enter width of each window");
			widthofwindows = sc.nextDouble();
			System.out.println("Enter number of doors");
			numberofdoors = sc.nextDouble();
			System.out.println("Enter lenght of each door");
			lenghtofdoor = sc.nextDouble();
			System.out.println("Enter width of each door");
			widthofdoor = sc.nextDouble();
			System.out.println("Enter cost per square feet");
			costPerSqft = sc.nextDouble();
			
			//Calculations
			double sqftnormal = lenghtofhouse * widthofhouse;
			double sqftpeak = (lenghtofhouse * widthofhouse) + 0.5 *(lenghtofhouse * (heightofhouse - widthofhouse));
			double totalsurfacearea = 2 * sqftnormal + 2 * sqftpeak;
			double totalsurfaceareatogether = totalsurfacearea - (numberofwindows * widthofwindows * lenghtofwindows) + (numberofdoors * lenghtofdoor * widthofdoor);
			double estimate = totalsurfacearea - totalsurfaceareatogether * costPerSqft;
			
			//Deduct the total window and door surface area from the total surface area, find estimate after
			
			
			//Estimate = totalsurfacearea - totalsurfaceareatogether * costPerSqFt;
			
			
			//Outputs
			System.out.println("Total surface area is " + totalsurfacearea);
			
			System.out.println("Total surface area after windows and doors is" + totalsurfaceareatogether);
			
			System.out.println("Total estimate is " + estimate);

		}
}
