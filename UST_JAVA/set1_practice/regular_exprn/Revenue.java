package trial;

import java.util.*;

public class Revenue {

	public static int calculateRevenue(int ProductACount, int ProductASellingPrice, int ProductBCount,
			int ProductBSellingPrice) {
		if (ProductACount >= 0 && ProductASellingPrice >= 0 && ProductBCount >= 0 && ProductBSellingPrice >= 0) {
			int revenue = ((ProductACount * ProductASellingPrice) + (ProductBCount * ProductBSellingPrice));
			return revenue;
		}
		return -1;
	}

	public static void main(String[] args) {
		String flag = "Y";
		while (flag.equalsIgnoreCase("Y")) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the count of product A");
			int A = sc.nextInt();
			System.out.println("enter the count of product B");
			int B = sc.nextInt();
			System.out.println("enter the selling price of product A");
			int sa = sc.nextInt();
			System.out.println("enter the selling price of product B");
			int sb = sc.nextInt();
			int result = Revenue.calculateRevenue(A, sa, B, sb);
			if (result == -1) {
				System.out.println("Invalid input!! ENTER POSITIVE VALUES");

			} else {
				System.out.println("Total Revenue= " + result);
			}
			System.out.println("Enter Y to continue");
			flag=sc.next();
		}

	}
}
