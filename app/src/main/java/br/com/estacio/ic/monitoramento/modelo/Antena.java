package br.com.estacio.ic.monitoramento.modelo;

/**
 * Created by jluca on 08/05/2016.
 */
public class Antena {
    private Integer id;
    private Double lat;
    private Double lon;

    public void setId(int id) {
        this.id = id;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return String.format("ID: %d\tLAT: %f\tLON: %f", id.intValue(), lat.doubleValue(), lon.doubleValue());
    }

}
