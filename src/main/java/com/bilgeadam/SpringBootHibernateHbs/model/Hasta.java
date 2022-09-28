package com.bilgeadam.SpringBootHibernateHbs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Hasta 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	private String NAME;
	
	//bir bolum birden fazla hasta
	@ManyToOne
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Bolum bolum;
	
	public Hasta(Bolum bolum , String name)
	{
		this.bolum = bolum;
		this.NAME = name;
	}
	
	
}
