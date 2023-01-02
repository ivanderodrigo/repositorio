package edu.ucam.distancias_EH;

/**
 * Hello world!
 *
 */
public class App 
{

	  private static final double EARTH_RADIUS = 6371.0; // radio de la Tierra en Km

	  public static void main(String[] args) {
	    // Coordenadas de mi pueblo, El Hoyo en Ciudad Real
	    double elHoyoLat = 38.7833;
	    double elHoyoLng = -4.4167;

	    // Coordenada de ejemplo
	    double lat = 38.8977;
	    double lng = -77.0366;

	    double distance = distancia(elHoyoLat, elHoyoLng, lat, lng);
	    System.out.println("Distancia a El Hoyo: " + distance + " km");
	  }

	  public static double distancia(double lat1, double lng1, double lat2, double lng2) {
	    double dLat = Math.toRadians(lat2 - lat1);
	    double dLng = Math.toRadians(lng2 - lng1);
	    double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
	               Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
	               Math.sin(dLng / 2) * Math.sin(dLng / 2);
	    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
	    return EARTH_RADIUS * c;
	  }

}
