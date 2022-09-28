package com.bilgeadam.SpringBootHibernateHbs.jparepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bilgeadam.SpringBootHibernateHbs.model.Bolum;

@Service
@Transactional
public interface BolumRepository extends JpaRepository<Bolum, Long>
{
	@Query(name = "findByBolumName", value = "SELECT * FROM public.bolum WHERE NAME LIKE :NAME", nativeQuery = true)
	public List<Bolum> findByBolumName(@Param("NAME") String name);

	public List<Bolum> findAllByNAMELike(String name);
	
}
