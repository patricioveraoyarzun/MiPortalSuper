/**
 * DatosDescuento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package arg.mps.seguros.broker.api.integration.ans.client.cotizacion;

@SuppressWarnings("all")
public class DatosDescuento  implements java.io.Serializable {
    private java.lang.String productoID;

    private int companiaID;

    private java.lang.String valor1;

    private java.lang.String valor2;

    public DatosDescuento() {
    }

    public DatosDescuento(
           java.lang.String productoID,
           int companiaID,
           java.lang.String valor1,
           java.lang.String valor2) {
           this.productoID = productoID;
           this.companiaID = companiaID;
           this.valor1 = valor1;
           this.valor2 = valor2;
    }


    /**
     * Gets the productoID value for this DatosDescuento.
     * 
     * @return productoID
     */
    public java.lang.String getProductoID() {
        return productoID;
    }


    /**
     * Sets the productoID value for this DatosDescuento.
     * 
     * @param productoID
     */
    public void setProductoID(java.lang.String productoID) {
        this.productoID = productoID;
    }


    /**
     * Gets the companiaID value for this DatosDescuento.
     * 
     * @return companiaID
     */
    public int getCompaniaID() {
        return companiaID;
    }


    /**
     * Sets the companiaID value for this DatosDescuento.
     * 
     * @param companiaID
     */
    public void setCompaniaID(int companiaID) {
        this.companiaID = companiaID;
    }


    /**
     * Gets the valor1 value for this DatosDescuento.
     * 
     * @return valor1
     */
    public java.lang.String getValor1() {
        return valor1;
    }


    /**
     * Sets the valor1 value for this DatosDescuento.
     * 
     * @param valor1
     */
    public void setValor1(java.lang.String valor1) {
        this.valor1 = valor1;
    }


    /**
     * Gets the valor2 value for this DatosDescuento.
     * 
     * @return valor2
     */
    public java.lang.String getValor2() {
        return valor2;
    }


    /**
     * Sets the valor2 value for this DatosDescuento.
     * 
     * @param valor2
     */
    public void setValor2(java.lang.String valor2) {
        this.valor2 = valor2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosDescuento)) return false;
        DatosDescuento other = (DatosDescuento) obj;
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
            this.companiaID == other.getCompaniaID() &&
            ((this.valor1==null && other.getValor1()==null) || 
             (this.valor1!=null &&
              this.valor1.equals(other.getValor1()))) &&
            ((this.valor2==null && other.getValor2()==null) || 
             (this.valor2!=null &&
              this.valor2.equals(other.getValor2())));
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
        _hashCode += getCompaniaID();
        if (getValor1() != null) {
            _hashCode += getValor1().hashCode();
        }
        if (getValor2() != null) {
            _hashCode += getValor2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosDescuento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/encodedTypes", "DatosDescuento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productoID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProductoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companiaID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CompaniaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Valor1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Valor2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
