public class Product{
	String pCode,pName;
	int price;
	public static void main(String []args){
		Product product1=new Product();
		Product product2=new Product();
		Product product3=new Product();
		
		product1.pCode="p101";
		product1.pName="GPU";
		product1.price=50000;
		
		product2.pCode="p102";
		product2.pName="Processor";
		product2.price=60000;

		product3.pCode="p103";
		product3.pName="Ram";
		product3.price=25000;


		
		if(product1.price>product2.price && product1.price>product3.price){			
			System.out.println("Product 1 has highest price");
		}else if(product2.price>product3.price){
			System.out.println("Product 2 has highest price");
		}else{
			System.out.println("Product 3 has highest price");
		}
			
	
	
	}
}
