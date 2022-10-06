package com.bilgeadam.SpringBootHibernateHbs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bilgeadam.SpringBootHibernateHbs.jparepository.BolumRepository;

import lombok.AllArgsConstructor;

@RequestMapping
@RestController
@RestControllerAdvice(basePackageClasses = BolumRepository.class)
@AllArgsConstructor
public class BolumController 
{
	private BolumRepository repository;
	
	

}
