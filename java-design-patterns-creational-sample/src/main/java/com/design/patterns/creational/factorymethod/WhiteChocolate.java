package com.design.patterns.creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * WhiteChocolate.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 13, 2021
 *
 */
public class WhiteChocolate implements Candy {

	private static Logger logger = LoggerFactory.getLogger(WhiteChocolate.class);

	@Override
	public List<Candy> makeCandyPackage(int quantity) {
		List<Candy> chocolatePackage = new ArrayList<>();
		for (int i = 1; i <= quantity; i++) {
			Candy chocolate = new WhiteChocolate();
			chocolatePackage.add(chocolate);
		}
		logger.info("One package of {} white chocolates has been made!", quantity);
		return chocolatePackage;
	}

}
