package main;

import java.util.Scanner;

public class VendingMachine {

	int balance; // {2000, 5000, 10000, 20000, 50000};
    
	Scanner input = new Scanner(System.in);

	
	public VendingMachine(int balance) {
		this.balance = balance;
	}

	void StartingBalance() {
		System.out.println("Starting Balance is Rp: " + balance);
	}

     void takeStocke(int take){
    
		take = input.nextInt();
	
		if(take == 1){
			System.out.println("No Stock");	
		}else if(take == 2){
			System.out.println("Stock Available");
		}else if(take == 3){
			System.out.println("Stock Available");
		}else if(take == 4){
			System.out.println("Stock Available");
		}
		else if(take == 5){
			System.out.println("Stock Available");
		}else{
			System.out.println("Not Suitable  !!!!!");
		}
	}

	void takeMoney(int take) {

		take = input.nextInt();
		int[] harga = { 6000, 8000, 10000, 12000, 15000 }; // list harga
        String [] stock ={"No Stock","Stock Available"};
		if (take == 1 ) {
			if(stock[0].contentEquals(stock[0])){
				    System.out.println("Sorry, Items No Stock !!!!!");
				if (balance <= harga[0]) {
					System.out.println("Sorry, Your Balance is LOW !!!!!");
					//System.out.println("Current Balance is shopping for BISKUIT Rp = " + balance );
				}else {	
					System.out.println("Current Balance is shopping for BISKUIT Rp = " + balance );
				}
			}else{
				balance = balance-harga[0];
				System.out.println("Current Balance is shopping for BISKUIT Rp = " + balance );
			}
		} else if (take == 2 ) {
			if(stock[1].contentEquals(stock[1])){
				    System.out.println("Items Stock Available !!!!!");
				if (balance <= harga[1]) {
					System.out.println("Sorry, Your Balance is LOW !!!!!");
					
				}else {
					balance = balance-harga[1];	
					System.out.println("Current Balance is shopping for CHIPS Rp = " + balance );
				}
			}else{
				System.out.println("Current Balance is shopping for CHIPS Rp = " + balance );
			}
		} else if (take == 3 ) {
			if(stock[1].contentEquals(stock[1])){
				    System.out.println("Items Stock Available !!!!!");
				if (balance <= harga[2]) {
					System.out.println("Sorry, Your Balance is LOW !!!!!");
					
				}else {
					balance = balance-harga[2];	
					System.out.println("Current Balance is shopping for OREO Rp = " + balance );
				}
			}else{
				System.out.println("Current Balance is shopping for OREO Rp = " + balance );
			}
			
		} else if (take == 4 ) {
			if(stock[1].contentEquals(stock[1])){
				    System.out.println("Items Stock Available !!!!!");
				if (balance <= harga[3]) {
					System.out.println("Sorry, Your Balance is LOW !!!!!");
				}else {
					balance = balance-harga[3];	
					System.out.println("Current Balance is shopping for TANGO Rp = " + balance );
				}
			}else{
				System.out.println("Current Balance is shopping for TANGO Rp = " + balance );
			}
			
		} else if (take == 5 ) {
			if(stock[1].contentEquals(stock[1])){
				    System.out.println("Items Stock Available !!!!!");
				if (balance <= harga[4]) {
					System.out.println("Sorry, Your Balance is LOW !!!!!");
					
				}else {
					balance = balance-harga[4];	
					System.out.println("Current Balance is shopping for CHIPS Rp = " + balance );
				}
			}else{
				System.out.println("Current Balance is shopping for CHIPS Rp = " + balance );
			}
			
		} else {
			System.out.println("Not Suitable With Items !!!!!");
		}

	}
	void takeStock(int Stock) {
		Stock = input.nextInt();
	}

	void CurrentBalance(int save) {
		save = input.nextInt();
		if (save == 2000) {
			balance = save + balance;
			System.out.println("Current Balance is Rp = " + balance);
		} else if (save == 5000) {
			balance = save + balance;
			System.out.println("Current Balance is Rp = " + balance);
		} else if (save == 10000) {
			balance = save + balance;
			System.out.println("Current Balance is Rp = " + balance);
		} else if (save == 20000) {
			balance = save + balance;
			System.out.println("Current Balance is Rp =" + balance);
		} else if (save == 50000) {
			balance = save + balance;
			System.out.println("Current Balance is Rp =" + balance);
		} else {
			System.out.println("Do not accept money in fractions Rp = " + balance);
		}

	}

	public void run() {
		int take = 0, save = 0;

		Scanner select = new Scanner(System.in);
		VendingMachine bk = new VendingMachine(0);

		for (int i = 1; i >= 1; i++) {
			System.out.println("\n");
			System.out.println("===== Welcome To Vending Machine 'MAKE SURE YOUR BALANCE IS ENOUGH'=====");
			System.out.println();
			System.out.println(" 1. Refund & Check Balance\n 2. Receipt Balance\n 3. Price Items\n 4. Check Stock\n");

			System.out.print("Select Menu In Vending Machine: ");

			int Listmenu = select.nextInt();

			if (Listmenu == 1) {
				bk.StartingBalance();
			} else if (Listmenu == 2) {

				System.out.print("Receive Money In Fractions {2000, 5000, 10000, 20000, 50000} Rp =  ");
				bk.CurrentBalance(save);
			} else if (Listmenu == 3) {

				System.out.println(
						" 1. Biskuit Rp. 6.000\n 2. Chips Rp. 8.000\n 3. Oreo Rp. 10.000\n 4. Tango Rp. 12.000\n 5. Coklat Rp. 15.000\n");

				System.out.print("Select Menu Items In Vending Machine: ");
				bk.takeMoney(take);
			}else if (Listmenu == 4) {

				System.out.println(
						" 1. Stock Biskuit\n 2. Stock Chips\n 3. Stock Oreo\n 4. Stock Tango\n 5. Stock Coklat\n");

				System.out.print("Select Stock Items In Vending Machine: ");
				
				bk.takeStocke(take);
			}else if (Listmenu > 5) {

				System.out.print("Menu Not Available ");
				System.out.print("Repeat Menu Vending Machine : ");
			} else
				break;
		}
	}
}
