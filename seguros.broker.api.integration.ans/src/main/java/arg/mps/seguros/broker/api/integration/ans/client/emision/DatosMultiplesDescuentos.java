/**
 * DatosMultiplesDescuentos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package arg.mps.seguros.broker.api.integration.ans.client.emision;

@SuppressWarnings("all")
public class DatosMultiplesDescuentos  implements java.io.Serializable {
    private java.lang.Object[] oDatosMultiplesDescuentos;

    private arg.mps.seguros.broker.api.integration.ans.client.emision.DatosDescuento empty;

    public DatosMultiplesDescuentos() {
    }

    public DatosMultiplesDescuentos(
           java.lang.Object[] oDatosMultiplesDescuentos,
           arg.mps.seguros.broker.api.integration.ans.client.emision.DatosDescuento empty) {
           this.oDatosMultiplesDescuentos = oDatosMultiplesDescuentos;
           this.empty = empty;
    }


    /**
     * Gets the oDatosMultiplesDescuentos value for this DatosMultiplesDescuentos.
     * 
     * @return oDatosMultiplesDescuentos
     */
    public java.lang.Object[] getODatosMultiplesDescuentos() {
        return oDatosMultiplesDescuentos;
    }


    /**
     * Sets the oDatosMultiplesDescuentos value for this DatosMultiplesDescuentos.
     * 
     * @param oDatosMultiplesDescuentos
     */
    public void setODatosMultiplesDescuentos(java.lang.Object[] oDatosMultiplesDescuentos) {
        this.oDatosMultiplesDescuentos = oDatosMultiplesDescuentos;
    }


    /**
     * Gets the empty value for this DatosMultiplesDescuentos.
     * 
     * @return empty
     */
    public arg.mps.seguros.broker.api.integration.ans.client.emision.DatosDescuento getEmpty() {
        return empty;
    }


    /**
     * Sets the empty value for this DatosMultiplesDescuentos.
     * 
     * @param empty
     */
    public void setEmpty(arg.mps.seguros.broker.api.integration.ans.client.emision.DatosDescuento empty) {
        this.empty = empty;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosMultiplesDescuentos)) return false;
        DatosMultiplesDescuentos other = (DatosMultiplesDescuentos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oDatosMultiplesDescuentos==null && other.getODatosMultiplesDescuentos()==null) || 
             (this.oDatosMultiplesDescuentos!=null &&
              java.util.Arrays.equals(this.oDatosMultiplesDescuentos, other.getODatosMultiplesDescuentos()))) &&
            ((this.empty==null && other.getEmpty()==null) || 
             (this.empty!=null &&
              this.empty.equals(other.getEmpty())));
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
        if (getODatosMultiplesDescuentos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getODatosMultiplesDescuentos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getODatosMultiplesDescuentos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmpty() != null) {
            _hashCode += getEmpty().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosMultiplesDescuentos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/encodedTypes", "DatosMultiplesDescuentos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ODatosMultiplesDescuentos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oDatosMultiplesDescuentos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Empty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/encodedTypes", "DatosDescuento"));
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
