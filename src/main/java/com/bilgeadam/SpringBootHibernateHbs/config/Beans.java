package com.bilgeadam.SpringBootHibernateHbs.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping(path = "/beans")
public class Beans 
{
	@Autowired
	public ApplicationContext applicationContext;

	//localhost:8080/beans
	@GetMapping
	public ResponseEntity<String> getBeans()
	{
		String[] names = applicationContext.getBeanDefinitionNames();
		Arrays.sort(names);
		StringBuilder builder = new StringBuilder();
		builder.append("--------------" + names.length + "----------").append("<br>");
		for (String string : names) 
		{
			builder.append(string + " ---> " + applicationContext.getBean(string).getClass().getName()).append("<br>");
		}
		
		return ResponseEntity.ok(builder.toString());
	}
	
	

}
