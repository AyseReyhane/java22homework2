package classesWithAttributes;

public class ProductManager {
	public void Add(Product product){
		System.out.println("Ürün eklendi: " + product.getName());
		
		// ürün manager da ürünle ilgili operasyonlar
	}
	
	// public void Add2(int id, String name, String description, int stockAmount, double price ) {}
    
	// satır 10 daki gibi kod yazdığımızda sistem hata vermesede biz bunu mainde birçok sayfaya
	// bastracağız ve Add2() ye yeni bir özellik eklemek isteğimizde tüm sayfalara eklememiz gerekecek.
}
