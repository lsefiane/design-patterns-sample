package com.design.patterns.creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * ChocolateFactory.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 13, 2021
 *
 */
public class ChocolateFactory {

	private static Logger logger = LoggerFactory.getLogger(ChocolateFactory.class);

	/**
	 * Get Candy
	 * 
	 * @param chocolateType
	 * @return created Candy
	 */
	private Candy getCandy(ChocolateType chocolateType) {

		Candy candy = null;

		if (chocolateType == null) {
			throw new IllegalArgumentException("Chocolate Type : " + chocolateType + " Should Not Be Null !");
		}

		switch (chocolateType) {
		case DARK:
			candy = new DarkChocolate();
			break;
		case WHITE:
			candy = new WhiteChocolate();
			break;
		case MILK:
			candy = new MilkChocolate();
			break;
		default:
			throw new UnsupportedOperationException("Chocolate Type : " + chocolateType + "Not Yet Supported");
		}
		return candy;
	}

	/**
	 * Get Candy Package
	 * 
	 * @param quantity
	 * @param chocolateType
	 * @return List<Candy>
	 */
	public List<Candy> getCandyPackage(int quantity, ChocolateType chocolateType) {
		Candy candy = null;
		List<Candy> candyPackage = new ArrayList<>();
		try {
			candy = getCandy(chocolateType);
			candyPackage = candy.makeCandyPackage(quantity);
		} catch (RuntimeException e) {
			logger.info("Exception Occurs While Getting Candy Package. {}", e.getMessage());
		}
		return candyPackage;
	}
}
