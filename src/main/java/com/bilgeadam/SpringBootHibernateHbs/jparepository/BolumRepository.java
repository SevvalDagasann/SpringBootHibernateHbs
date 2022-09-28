package com.bilgeadam.SpringBootHibernateHbs.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bilgeadam.SpringBootHibernateHbs.model.Bolum;

@Service
@Transactional
public interface BolumRepository extends JpaRepository<Bolum, Long>
{
	
}
