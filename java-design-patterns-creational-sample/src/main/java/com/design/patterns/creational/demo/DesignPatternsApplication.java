package com.design.patterns.creational.demo;

import java.awt.Color;
import java.awt.Dimension;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.design.patterns.creational.builder.Bedroom;
import com.design.patterns.creational.builder.BedroomBuilder;
import com.design.patterns.creational.prototype.Breed;
import com.design.patterns.creational.prototype.Person;
import com.design.patterns.creational.prototype.Rabbit;
import com.design.patterns.creational.singleton.PrintSpooler;

@SpringBootApplication
public class DesignPatternsApplication {

	private static Logger logger = LoggerFactory.getLogger(DesignPatternsApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(DesignPatternsApplication.class, args);

		// Builder Design Pattern Sample.
		Bedroom bedroom = new BedroomBuilder()//
				.setDimensions(new Dimension(200, 100))//
				.setCellingHeight(132).setFloorNumber(2)//
				.setNumberOfDoors(4)//
				.setNumberOfWindows(16)//
				.setWallColor(Color.CYAN)//
				.build();
		logger.info("Builder Design Pattern {}", bedroom);
		
		
		// Singleton Design Pattern Sample.
		PrintSpooler spooler = PrintSpooler.getInstance();
		logger.info("Singleton Design Pattern {}", spooler);
		
		
		// Prototype Design Pattern Sample.
		// Original Rabbit
		Rabbit rabbit = new Rabbit(12, Breed.AMERICAN);
		rabbit.setOwner(new Person("Sally"));
		// Cloned Rabbit
		Rabbit clonedRabbit = rabbit.clone();
		clonedRabbit.setOwner(new Person("Steve"));
		logger.info("Prototype Design Pattern {}", clonedRabbit);

	}

}
