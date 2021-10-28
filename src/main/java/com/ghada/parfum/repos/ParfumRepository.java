package com.ghada.parfum.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ghada.parfum.entities.Marque;
import com.ghada.parfum.entities.Parfum;
public interface ParfumRepository extends JpaRepository<Parfum,Long> {
List<Parfum> findBynomParfum(String nom);
List<Parfum> findBynomParfumContains(String nom);
/* 
@Query("select p from Parfum p where p.nomParfum like %1 and p.prix > ?2")
List<Parfum> findByNomPrix (String nom, Double prix);
*/
@Query("select p from Parfum p where p.nomParfum like %:nom and p.prix> :prix")
List<Parfum> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);

@Query("select p from Parfum p where p.marque = ?1")
List<Parfum> findByMarque (Marque marque);

List<Parfum> findByMarqueIdMarque(Long id);

List<Parfum> findByOrderByNomParfumAsc();

@Query("select p from Parfum p order by p.nomParfum ASC, p.prix DESC")
List<Parfum> trierParfumNomsPrix ();

}
