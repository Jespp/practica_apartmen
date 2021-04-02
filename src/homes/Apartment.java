package homes;

public class Apartment {
	private int rooms;
	private int squareMeters;
	private int pricePerSquareMeter;
	
	public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
		this.rooms=rooms;
		this.squareMeters=squareMeters;
		this.pricePerSquareMeter=pricePerSquareMeter;	
	}
	
	//method larger, compares the area between this and other apartment.
	//returns true if the area of this is larger then the other
	public boolean larger(Apartment otherApartment) {
		if (this.squareMeters>otherApartment.squareMeters) {
			return true;
		}
		return false;
	}
	
	//method priceDifference, calculates the price of this and other apartment. 
	//returns the absolute value between prices
	public int priceDifference(Apartment otherApartment) {
		int priceThis=this.pricePerSquareMeter*this.squareMeters;
		int priceOther=otherApartment.pricePerSquareMeter*otherApartment.squareMeters;
		return Math.abs(priceThis-priceOther);
	}
	
	//method moreExpensive, calculates the price of this and other apartment
	//returns false if the price of this apartment is 
	public boolean moreExpensiveThan(Apartment otherApartment) {
		int priceThis=this.pricePerSquareMeter*this.squareMeters;
		int priceOther=otherApartment.pricePerSquareMeter*otherApartment.squareMeters;
		if ((priceThis-priceOther)>=0) {
			return true;
		}
		return false;
	}
}
