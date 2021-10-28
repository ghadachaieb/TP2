package com.ghada.parfum;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ghada.parfum.entities.Marque;
import com.ghada.parfum.entities.Parfum;
import com.ghada.parfum.repos.ParfumRepository;

import java.util.List;


@SpringBootTest
class ParfumApplicationTests {
	@Autowired
	private ParfumRepository produitRepository;
	@Test
	public void testCreateProduit() {
	Parfum parf = new Parfum("Dios","Homme",69.990);
	produitRepository.save(parf);
	}
	@Test
	public void testFindParfum()
	{
	Parfum p = produitRepository.findById(1L).get(); 
	System.out.println(p);
	}
	@Test
	public void testUpdateParfum()
	{
	Parfum p = produitRepository.findById(1L).get();
	p.setPrix(200.0);
	produitRepository.save(p);
	}
	@Test
	public void testDeleteParfum()
	{
	produitRepository.deleteById(1L);;
	}
	 
	@Test
	public void testListerTousParfum()
	{
	List <Parfum> prods = produitRepository.findAll();
	for (Parfum p : prods)
	{
	System.out.println(p);
	}
	}
	 @Test
	 public void testFindByNomParfum()
	 {
	 List<Parfum> prods = produitRepository.findBynomParfum("ZARA");
	 for (Parfum p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 @Test
	 public void testFindByNomParfumContains ()
	 {
	 List<Parfum> prods=produitRepository.findBynomParfumContains("Dios");
	 for (Parfum p : prods)
	 {
	 System.out.println(p);
	 } }
	 
	 @Test
	 public void testfindByNomPrix()
	 {
	 List<Parfum> prods = produitRepository.findByNomPrix("Dios", 60.000);
	 for (Parfum p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 @Test
	 public void testfindByMarque()
	 {
	 Marque marque = new Marque();
	 marque.setIdMarque(1L);

	 List<Parfum> prods = produitRepository.findByMarque(marque);
	 for (Parfum p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 
	 @Test
	 public void findByMarqueIdMarq()
	 {
	 List<Parfum> prods = produitRepository.findByMarqueIdMarque(1L);
	 for (Parfum p : prods)
	 {
	 System.out.println(p);
	 }
	  }
	 @Test
	 public void testfindByOrderByNomProduitAsc()
	 {
	 List<Parfum> prods =  produitRepository.findByOrderByNomParfumAsc();
	 for (Parfum p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 @Test
	 public void testTrierParfumNomsPrix()
	 {
	 List<Parfum> prods = produitRepository.trierParfumNomsPrix();
	 for (Parfum p : prods)
	 {
	 System.out.println(p);
	 }
	 }
}
