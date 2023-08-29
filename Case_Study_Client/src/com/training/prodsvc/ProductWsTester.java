package com.training.prodsvc;

import java.util.List;

public class ProductWsTester {

	public static void main(String[] args) 
	{
		ProductServiceImplService obj = new ProductServiceImplService();
		ProductServiceImpl prod = obj.getProductServiceImpl();
		List<Product> product_List = prod.getProdInfo();
		for(Product p:product_List)
		{
			System.out.println(p.getProdID() + p.getProdName());
		}
		Product pcheck = new Product();
//		pcheck.setProdID("200349");
//		pcheck.setProdName("Anvesh");
//		prod.addProduct(pcheck);
		pcheck.setProdID("200349");
		pcheck.setProdName("Aastik");
		prod.updateProduct(pcheck);

	}

}
