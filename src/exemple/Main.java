package exemple;

public class Main {
	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");

		Vehicle vehicle1 = new Vehicle("Tata", "Vista", Vehicle.BASIC);
		Date date = dateFormat.parse("2/8/2013");
		Lloguer lloguer1 = new Lloguer(date, 2, vehicle1);
		
		Vehicle vehicle2 = new Vehicle("Citroen", "Saxo", Vehicle.GENERAL);
		Date date = dateFormat.parse("2/8/2013");
		Lloguer lloguer2 = new Lloguer(date, 2, vehicle2);
		
		Vehicle vehicle3 = new Vehicle("Tesla", "Roaster", Vehicle.BASIC);
		Date date = dateFormat.parse("2/8/2013");
		Lloguer lloguer3 = new Lloguer(date, 2, vehicle3);
		
		Client.micliente = new Client("22222222J", "Jose", "444444444");
		micliente.afegeix(lloguer1);
		micliente.afegeix(lloguer2);
		micliente.afegeix(lloguer3);

		// demostració de formatat d'una data
		//System.out.println(dateFormat.format(lloguerBasic.getData()));
		System.out.println(GestorLloguersLite(micliente));
			
	}
	
	public static Srtring GestorLloguerLite(Client client) {
		return Client.informe();
		
	}

}
