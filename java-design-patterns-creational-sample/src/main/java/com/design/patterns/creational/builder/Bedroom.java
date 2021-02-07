package com.design.patterns.creational.builder;

import java.awt.Color;
import java.awt.Dimension;

/**
 * 
 * Bedroom.java
 *
 * @author Lyes Sefiane
 * @email lyes.sefiane@gmail.com
 * @date Jan. 30, 2021
 *
 */
public class Bedroom {

	private Dimension dimensions;
	private int cellingHeight;
	private int floorNumber;
	private Color wallColor;
	private int numberOfWindows;
	private int numberOfDoors;
	private boolean isDouble;
	private boolean hasEnsuite;

	public Bedroom(BedroomBuilder bedroomBuilder) {
		dimensions = bedroomBuilder.dimensions;
		cellingHeight = bedroomBuilder.cellingHeight;
		floorNumber = bedroomBuilder.floorNumber;
		wallColor = bedroomBuilder.wallColor;
		numberOfWindows = bedroomBuilder.numberOfWindows;
		numberOfDoors = bedroomBuilder.numberOfDoors;
		isDouble = bedroomBuilder.isDouble;
		hasEnsuite = bedroomBuilder.hasEnsuite;

	}

	public Dimension getDimensions() {
		return dimensions;
	}

	public int getCellingHeight() {
		return cellingHeight;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public Color getWallColor() {
		return wallColor;
	}

	public int getNumberOfWindows() {
		return numberOfWindows;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public boolean isDouble() {
		return isDouble;
	}

	public boolean isHasEnsuite() {
		return hasEnsuite;
	}

	@Override
	public String toString() {
		return "Bedroom [dimensions=" + dimensions + ", cellingHeight=" + cellingHeight + ", floorNumber=" + floorNumber
				+ ", wallColor=" + wallColor + ", numberOfWindows=" + numberOfWindows + ", numberOfDoors="
				+ numberOfDoors + ", isDouble=" + isDouble + ", hasEnsuite=" + hasEnsuite + "]";
	}

	public static final class BedroomBuilder {
		private Dimension dimensions;
		private int cellingHeight;
		private int floorNumber;
		private Color wallColor;
		private int numberOfWindows;
		private int numberOfDoors;
		private boolean isDouble;
		private boolean hasEnsuite;

		public BedroomBuilder() {
		}

		public BedroomBuilder setDimensions(Dimension dimensions) {
			this.dimensions = dimensions;
			return this;
		}

		public BedroomBuilder setCellingHeight(int cellingHeight) {
			this.cellingHeight = cellingHeight;
			return this;
		}

		public BedroomBuilder setFloorNumber(int floorNumber) {
			this.floorNumber = floorNumber;
			return this;
		}

		public BedroomBuilder setWallColor(Color wallColor) {
			this.wallColor = wallColor;
			return this;
		}

		public BedroomBuilder setNumberOfWindows(int numberOfWindows) {
			this.numberOfWindows = numberOfWindows;
			return this;
		}

		public BedroomBuilder setNumberOfDoors(int numberOfDoors) {
			this.numberOfDoors = numberOfDoors;
			return this;
		}

		public BedroomBuilder setDouble(boolean isDouble) {
			this.isDouble = isDouble;
			return this;
		}

		public BedroomBuilder setHasEnsuite(boolean hasEnsuite) {
			this.hasEnsuite = hasEnsuite;
			return this;
		}

		public Bedroom build() {
			return new Bedroom(this);
		}
	}

}
