package exemple;

import java.util.Date;

public class Lloguer {
	private Date data;
	private int dies;
	private Vehicle vehicle;
	
	
	private static final double unitatsBasic = 3;
	private static final double unitatsGeneral = 4;
	private static final double unitatsDeluxe = 6;
	private static final double diesBasic = 3;
	private static final double diesGeneral = 2;
	private static final double extraBasic = 1.5;
	private static final double extraGeneral = 2.5;

	
	public Lloguer(Date date, int i, Vehicle vehicleBasic) {
		this.data = date;
		this.dies = i;
		this.vehicle = vehicleBasic;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getDies() {
		return dies;
	}
	public void setDies(int dies) {
		this.dies = dies;
	}
	public Vehicle getVehicle() {
		return this.vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	//MOVIMENT DE METODE DE CLIENT A LLOGUER
	public double quantitat() {
		double quantitat = 0;
		swotch (this.)
	}
	public double unitatsCost() {
    	double unitatsCost = 0;
        switch (getVehicle().getCategoria()) {
            case Vehicle.BASIC:
            	unitatsCost += unitatsBasic;
                if (getDies() > diesBasic) {
                	unitatsCost += (getDies() - diesBasic) * 
                    		extraBasic;
                }
                break;
            case Vehicle.GENERAL:
                unitatsCost += unitatsGeneral;
                if (getDies() > diesGeneral) {
                    unitatsCost += (getDies() - diesGeneral) *
                    		extraGeneral ;
                }
                break;
            case Vehicle.LUXE:
                unitatsCost += getDies() * unitatsDeluxe;
                break;
        }
        return unitatsCost;
    }
	
	
	
	
	

}
