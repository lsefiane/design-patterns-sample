package com.design.patterns.structural.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.design.patterns.structural.adapter.Adapter;
import com.design.patterns.structural.adapter.CarModel;
import com.design.patterns.structural.adapter.CarPriceCalculator;
import com.design.patterns.structural.adapter.PriceCalculator;
import com.design.patterns.structural.adapter.TruckPriceCalculator;
import com.design.patterns.structural.adapter.lib.UKCarPriceCalculator;
import com.design.patterns.structural.bridge.Blue;
import com.design.patterns.structural.bridge.Circle;
import com.design.patterns.structural.bridge.Red;
import com.design.patterns.structural.bridge.Shape;
import com.design.patterns.structural.bridge.Square;

/**
 * 
 * DesignPatternsApplication.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Feb. 14, 2021
 *
 */
@SpringBootApplication
public class DesignPatternsApplication {

	private static Logger logger = LoggerFactory.getLogger(DesignPatternsApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(DesignPatternsApplication.class, args);

		///////////////////////////////////////////////////

		// Adapter Design Pattern Sample.
		PriceCalculator carPriceCalculator = new CarPriceCalculator(3, CarModel.FORD);
		printVehiclePrice(carPriceCalculator);
		PriceCalculator truckPriceCalculator = new TruckPriceCalculator(10, 0);
		printVehiclePrice(truckPriceCalculator);
		// Adapt an external code to the current one
		UKCarPriceCalculator ukCarPriceCalculator = new UKCarPriceCalculator(7, CarModel.BMW);
		printVehiclePrice(new Adapter(ukCarPriceCalculator));

		///////////////////////////////////////////////////

		// Bridge Design Pattern Sample.
		Shape square = new Square(new Red());
		Shape circle = new Circle(new Blue());
		logger.info("{}", square.draw());
		logger.info("{}", circle.draw());

	}

	public static void printVehiclePrice(PriceCalculator calculator) {
		String price = calculator.calculatePrice();
		logger.info("The price of vehicle is : {}", price);
	}

}
