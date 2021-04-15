package exemple;

import java.util.Date;

public class Lloguer {
	private Date data;
	private int dies;
	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public Lloguer(Date data, int dies, ArrayList<Vehicle> vehicles) {
		this.data = data;
		this.dies = dies;
		this.vehicles = vehicles;
	}
	
	public Lloguer(Date date, int i, Vehicle vehicleBasic) {
		this.data = date;
		this.dies = dies;
		this.vehicles.add();
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
	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(ArrayList<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
	
	

}
