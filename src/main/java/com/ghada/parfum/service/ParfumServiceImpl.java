package com.ghada.parfum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghada.parfum.entities.Marque;
import com.ghada.parfum.entities.Parfum;
import com.ghada.parfum.repos.ParfumRepository;

@Service
public  class ParfumServiceImpl implements ParfumService{
	@Autowired
	ParfumRepository produitRepository;
	@Override
	public Parfum saveParfum(Parfum p) {
	return produitRepository.save(p);
	}

	public Parfum updateParfum(Parfum p) {
	return produitRepository.save(p);
	}
	@Override
	public void deleteParfum(Parfum p) {
	produitRepository.delete(p);
	}
	@Override
	public void deleteParfumById(Long id) {
	produitRepository.deleteById(id);
	}
	@Override
	public Parfum getParfum(Long id) {
	return produitRepository.findById(id).get();
	}
	@Override
	public List<Parfum> getAllParfum() {
	return produitRepository.findAll();
	
	}

	@Override
	public List<Parfum> findBynomParfum(String nom) {
		return produitRepository.findBynomParfum(nom);
	}

	@Override
	public List<Parfum> findBynomParfumContains(String nom) {
		return produitRepository.findBynomParfumContains(nom);
	}

	

	@Override
	public List<Parfum> findByMarque(Marque marque) {
		return produitRepository.findByMarque(marque);
	}

	@Override
	public List<Parfum> findByMarqueIdMarque(Long id) {
		return produitRepository.findByMarqueIdMarque(id);
	
	}

	@Override
	public List<Parfum> findByOrderByNomParfumAsc() {
		return produitRepository.findByOrderByNomParfumAsc();
	}

	@Override
	public List<Parfum> trierParfumNomsPrix() {
		return produitRepository.trierParfumNomsPrix();
	}

	
	@Override
	public List<Parfum> findByNomPrix(String nom, Double prix) {
		return produitRepository.findByNomPrix(nom, prix);
	}

	@Override
	public Parfum getParfum() {
		return produitRepository.getById(null);
	}
	
	
}
