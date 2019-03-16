/**
 * DatosMultiplesAsegurados.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package arg.mps.seguros.broker.api.integration.ans.client.cotizacion;

@SuppressWarnings("all")
public class DatosMultiplesAsegurados  implements java.io.Serializable {
    private java.lang.Object[] oDatosMultiplesAsegurados;

    private int cantidadAsegurados;

    private arg.mps.seguros.broker.api.integration.ans.client.cotizacion.DatosAsegurado empty;

    public DatosMultiplesAsegurados() {
    }

    public DatosMultiplesAsegurados(
           java.lang.Object[] oDatosMultiplesAsegurados,
           int cantidadAsegurados,
           arg.mps.seguros.broker.api.integration.ans.client.cotizacion.DatosAsegurado empty) {
           this.oDatosMultiplesAsegurados = oDatosMultiplesAsegurados;
           this.cantidadAsegurados = cantidadAsegurados;
           this.empty = empty;
    }


    /**
     * Gets the oDatosMultiplesAsegurados value for this DatosMultiplesAsegurados.
     * 
     * @return oDatosMultiplesAsegurados
     */
    public java.lang.Object[] getODatosMultiplesAsegurados() {
        return oDatosMultiplesAsegurados;
    }


    /**
     * Sets the oDatosMultiplesAsegurados value for this DatosMultiplesAsegurados.
     * 
     * @param oDatosMultiplesAsegurados
     */
    public void setODatosMultiplesAsegurados(java.lang.Object[] oDatosMultiplesAsegurados) {
        this.oDatosMultiplesAsegurados = oDatosMultiplesAsegurados;
    }


    /**
     * Gets the cantidadAsegurados value for this DatosMultiplesAsegurados.
     * 
     * @return cantidadAsegurados
     */
    public int getCantidadAsegurados() {
        return cantidadAsegurados;
    }


    /**
     * Sets the cantidadAsegurados value for this DatosMultiplesAsegurados.
     * 
     * @param cantidadAsegurados
     */
    public void setCantidadAsegurados(int cantidadAsegurados) {
        this.cantidadAsegurados = cantidadAsegurados;
    }


    /**
     * Gets the empty value for this DatosMultiplesAsegurados.
     * 
     * @return empty
     */
    public arg.mps.seguros.broker.api.integration.ans.client.cotizacion.DatosAsegurado getEmpty() {
        return empty;
    }


    /**
     * Sets the empty value for this DatosMultiplesAsegurados.
     * 
     * @param empty
     */
    public void setEmpty(arg.mps.seguros.broker.api.integration.ans.client.cotizacion.DatosAsegurado empty) {
        this.empty = empty;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosMultiplesAsegurados)) return false;
        DatosMultiplesAsegurados other = (DatosMultiplesAsegurados) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.oDatosMultiplesAsegurados==null && other.getODatosMultiplesAsegurados()==null) || 
             (this.oDatosMultiplesAsegurados!=null &&
              java.util.Arrays.equals(this.oDatosMultiplesAsegurados, other.getODatosMultiplesAsegurados()))) &&
            this.cantidadAsegurados == other.getCantidadAsegurados() &&
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
        if (getODatosMultiplesAsegurados() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getODatosMultiplesAsegurados());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getODatosMultiplesAsegurados(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getCantidadAsegurados();
        if (getEmpty() != null) {
            _hashCode += getEmpty().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosMultiplesAsegurados.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/encodedTypes", "DatosMultiplesAsegurados"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ODatosMultiplesAsegurados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oDatosMultiplesAsegurados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantidadAsegurados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CantidadAsegurados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("empty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Empty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/encodedTypes", "DatosAsegurado"));
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
