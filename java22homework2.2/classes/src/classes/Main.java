package classes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
        // Stack = Heap
		// satck te sample var , heap te nesne
		// Yukarıda elimde iki aynı tipte nesne vardı, 
		// bellekte ayrı ayrı tutuluyordu.
		// Atama işlemini yaptıktan sonra (satır 8) bellekte
		// boşluk oluştu bunu toplayana garbage collector(bellek yöneticisi) denir.
		// cM nin referans numarasına cM2 ninki atanmış oldu
		
		
		// value
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		
		int[] sayilar1 = new int[]{1,2,3};
		int[] sayilar2 = new int[]{4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
		
		
		
		

	}

}
