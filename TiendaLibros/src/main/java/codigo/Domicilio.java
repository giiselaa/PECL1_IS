package codigo;

/**
 * 
 * @author Elia Encinas y Gisela González
 */
public class Domicilio {
    
    private String calle;
    private String municipio;
    private String provincia;
    private int numero;
    private int codigopostal;

    /**
     * Constructor de Domicilio
     * 
     * @param calle value of calle
     * @param municipio value of ciudad
     * @param provincia value of provincia
     * @param numero value of numero
     * @param codigopostal value of codigopostal
     */
    public Domicilio(String calle, String municipio, String provincia, int numero, int codigopostal) {
        this.calle = calle;
        this.municipio = municipio;
        this.provincia = provincia;
        this.numero = numero;
        this.codigopostal = codigopostal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(int codigopostal) {
        this.codigopostal = codigopostal;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "calle=" + calle + ", municipio=" + municipio + ", provincia=" + provincia + ", numero=" + numero + ", codigopostal=" + codigopostal + '}';
    }
    
}
