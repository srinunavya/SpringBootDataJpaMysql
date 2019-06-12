package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {
	
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		repo.save(new Product("A",3.3));
		repo.save(new Product("B",4.3));
		repo.save(new Product("C",5.3));
		repo.save(new Product("D",6.3)); 
		
		//--update call-
		/* repo.save(new Product(4,"E",8.9)); */
		
		//--Bulk insert--
		
		/*
		 * List<Product> prds=Arrays.asList( new Product(101,"R",9.9), new
		 * Product(102,"P",7.9), new Product(103,"S",8.9), new Product(104,"T",6.9) );
		 * repo.saveAll(prds);
		 */
		
		//--fetch for one row--
		/*Optional<Product> p=repo.findById(101);
		if(p.isPresent()) {
			Product prd=p.get();
			System.out.println(prd.getProdCode());
		}else {
			System.out.println("Row Not Found");
		}*/
		
		//--fetch all rows--
		/*List<Product> list=repo.findAll();
		list.forEach(System.out::println);*/
		
		//--delete operations--
		/*repo.deleteById(101);*/
		
		//--delete all rows--
		
		/*
		 * repo.deleteAll(); repo.deleteAllInBatch();
		 */

	}

}
