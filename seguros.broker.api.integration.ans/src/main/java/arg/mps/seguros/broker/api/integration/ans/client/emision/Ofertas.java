/**
 * Ofertas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package arg.mps.seguros.broker.api.integration.ans.client.emision;

@SuppressWarnings("all")
public class Ofertas  implements java.io.Serializable {
    private java.lang.String productoID;

    private int deducible;

    private int companiaID;

    private java.lang.String producto;

    private float primaAfecta;

    private float primaExenta;

    private float iva;

    private float primaBruta;

    private float valorCuota;

    private int numeroCuotas;

    private int promocionID;

    public Ofertas() {
    }

    public Ofertas(
           java.lang.String productoID,
           int deducible,
           int companiaID,
           java.lang.String producto,
           float primaAfecta,
           float primaExenta,
           float iva,
           float primaBruta,
           float valorCuota,
           int numeroCuotas,
           int promocionID) {
           this.productoID = productoID;
           this.deducible = deducible;
           this.companiaID = companiaID;
           this.producto = producto;
           this.primaAfecta = primaAfecta;
           this.primaExenta = primaExenta;
           this.iva = iva;
           this.primaBruta = primaBruta;
           this.valorCuota = valorCuota;
           this.numeroCuotas = numeroCuotas;
           this.promocionID = promocionID;
    }


    /**
     * Gets the productoID value for this Ofertas.
     * 
     * @return productoID
     */
    public java.lang.String getProductoID() {
        return productoID;
    }


    /**
     * Sets the productoID value for this Ofertas.
     * 
     * @param productoID
     */
    public void setProductoID(java.lang.String productoID) {
        this.productoID = productoID;
    }


    /**
     * Gets the deducible value for this Ofertas.
     * 
     * @return deducible
     */
    public int getDeducible() {
        return deducible;
    }


    /**
     * Sets the deducible value for this Ofertas.
     * 
     * @param deducible
     */
    public void setDeducible(int deducible) {
        this.deducible = deducible;
    }


    /**
     * Gets the companiaID value for this Ofertas.
     * 
     * @return companiaID
     */
    public int getCompaniaID() {
        return companiaID;
    }


    /**
     * Sets the companiaID value for this Ofertas.
     * 
     * @param companiaID
     */
    public void setCompaniaID(int companiaID) {
        this.companiaID = companiaID;
    }


    /**
     * Gets the producto value for this Ofertas.
     * 
     * @return producto
     */
    public java.lang.String getProducto() {
        return producto;
    }


    /**
     * Sets the producto value for this Ofertas.
     * 
     * @param producto
     */
    public void setProducto(java.lang.String producto) {
        this.producto = producto;
    }


    /**
     * Gets the primaAfecta value for this Ofertas.
     * 
     * @return primaAfecta
     */
    public float getPrimaAfecta() {
        return primaAfecta;
    }


    /**
     * Sets the primaAfecta value for this Ofertas.
     * 
     * @param primaAfecta
     */
    public void setPrimaAfecta(float primaAfecta) {
        this.primaAfecta = primaAfecta;
    }


    /**
     * Gets the primaExenta value for this Ofertas.
     * 
     * @return primaExenta
     */
    public float getPrimaExenta() {
        return primaExenta;
    }


    /**
     * Sets the primaExenta value for this Ofertas.
     * 
     * @param primaExenta
     */
    public void setPrimaExenta(float primaExenta) {
        this.primaExenta = primaExenta;
    }


    /**
     * Gets the iva value for this Ofertas.
     * 
     * @return iva
     */
    public float getIva() {
        return iva;
    }


    /**
     * Sets the iva value for this Ofertas.
     * 
     * @param iva
     */
    public void setIva(float iva) {
        this.iva = iva;
    }


    /**
     * Gets the primaBruta value for this Ofertas.
     * 
     * @return primaBruta
     */
    public float getPrimaBruta() {
        return primaBruta;
    }


    /**
     * Sets the primaBruta value for this Ofertas.
     * 
     * @param primaBruta
     */
    public void setPrimaBruta(float primaBruta) {
        this.primaBruta = primaBruta;
    }


    /**
     * Gets the valorCuota value for this Ofertas.
     * 
     * @return valorCuota
     */
    public float getValorCuota() {
        return valorCuota;
    }


    /**
     * Sets the valorCuota value for this Ofertas.
     * 
     * @param valorCuota
     */
    public void setValorCuota(float valorCuota) {
        this.valorCuota = valorCuota;
    }


    /**
     * Gets the numeroCuotas value for this Ofertas.
     * 
     * @return numeroCuotas
     */
    public int getNumeroCuotas() {
        return numeroCuotas;
    }


    /**
     * Sets the numeroCuotas value for this Ofertas.
     * 
     * @param numeroCuotas
     */
    public void setNumeroCuotas(int numeroCuotas) {
        this.numeroCuotas = numeroCuotas;
    }


    /**
     * Gets the promocionID value for this Ofertas.
     * 
     * @return promocionID
     */
    public int getPromocionID() {
        return promocionID;
    }


    /**
     * Sets the promocionID value for this Ofertas.
     * 
     * @param promocionID
     */
    public void setPromocionID(int promocionID) {
        this.promocionID = promocionID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ofertas)) return false;
        Ofertas other = (Ofertas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productoID==null && other.getProductoID()==null) || 
             (this.productoID!=null &&
              this.productoID.equals(other.getProductoID()))) &&
            this.deducible == other.getDeducible() &&
            this.companiaID == other.getCompaniaID() &&
            ((this.producto==null && other.getProducto()==null) || 
             (this.producto!=null &&
              this.producto.equals(other.getProducto()))) &&
            this.primaAfecta == other.getPrimaAfecta() &&
            this.primaExenta == other.getPrimaExenta() &&
            this.iva == other.getIva() &&
            this.primaBruta == other.getPrimaBruta() &&
            this.valorCuota == other.getValorCuota() &&
            this.numeroCuotas == other.getNumeroCuotas() &&
            this.promocionID == other.getPromocionID();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getProductoID() != null) {
            _hashCode += getProductoID().hashCode();
        }
        _hashCode += getDeducible();
        _hashCode += getCompaniaID();
        if (getProducto() != null) {
            _hashCode += getProducto().hashCode();
        }
        _hashCode += new Float(getPrimaAfecta()).hashCode();
        _hashCode += new Float(getPrimaExenta()).hashCode();
        _hashCode += new Float(getIva()).hashCode();
        _hashCode += new Float(getPrimaBruta()).hashCode();
        _hashCode += new Float(getValorCuota()).hashCode();
        _hashCode += getNumeroCuotas();
        _hashCode += getPromocionID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ofertas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/encodedTypes", "Ofertas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productoID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProductoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deducible");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Deducible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companiaID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CompaniaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("producto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Producto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaAfecta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PrimaAfecta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaExenta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PrimaExenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iva");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Iva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaBruta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PrimaBruta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorCuota");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValorCuota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCuotas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumeroCuotas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promocionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PromocionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
