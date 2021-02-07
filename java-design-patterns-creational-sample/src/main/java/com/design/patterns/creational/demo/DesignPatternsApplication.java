package com.design.patterns.creational.demo;

import java.awt.Color;
import java.awt.Dimension;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.design.patterns.creational.builder.Bedroom;

@SpringBootApplication
public class DesignPatternsApplication {

	private static Logger logger = LoggerFactory.getLogger(DesignPatternsApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(DesignPatternsApplication.class, args);

		Bedroom bedroom = new Bedroom.BedroomBuilder()//
				.setDimensions(new Dimension(200, 100))//
				.setCellingHeight(132).setFloorNumber(2)//
				.setNumberOfDoors(4)//
				.setNumberOfWindows(16)//
				.setWallColor(Color.CYAN)//
				.build();

		logger.info("Builder Design Pattern {}", bedroom);

	}

}
