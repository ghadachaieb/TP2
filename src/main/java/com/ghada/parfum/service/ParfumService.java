package com.ghada.parfum.service;

import java.util.List;

import com.ghada.parfum.entities.Marque;
import com.ghada.parfum.entities.Parfum;

public interface ParfumService {
	Parfum saveParfum(Parfum p);
	Parfum updateParfum(Parfum p);
	void deleteParfum(Parfum p);
	 void deleteParfumById(Long id);
	 Parfum getParfum();
	List<Parfum> getAllParfum();
	Parfum getParfum(Long id);

	List<Parfum> findBynomParfum(String nom);
	List<Parfum> findBynomParfumContains(String nom);
	List<Parfum> findByNomPrix  (String nom, Double prix);
	List<Parfum> findByMarque (Marque marque);
	List<Parfum> findByMarqueIdMarque(Long id);
	List<Parfum> findByOrderByNomParfumAsc();
	List<Parfum> trierParfumNomsPrix();

}
