/**
 * RetornoCotizacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package arg.mps.seguros.broker.api.integration.ans.client.emision;

@SuppressWarnings("all")
public class RetornoCotizacion  implements java.io.Serializable {
    private java.lang.String cotizacionID;

    private java.lang.String numeroCotizacion;

    private java.lang.Object[] ofertas;

    private arg.mps.seguros.broker.api.integration.ans.client.emision.Ofertas vacio;

    private java.lang.String mensaje;

    private int mensajeID;

    public RetornoCotizacion() {
    }

    public RetornoCotizacion(
           java.lang.String cotizacionID,
           java.lang.String numeroCotizacion,
           java.lang.Object[] ofertas,
           arg.mps.seguros.broker.api.integration.ans.client.emision.Ofertas vacio,
           java.lang.String mensaje,
           int mensajeID) {
           this.cotizacionID = cotizacionID;
           this.numeroCotizacion = numeroCotizacion;
           this.ofertas = ofertas;
           this.vacio = vacio;
           this.mensaje = mensaje;
           this.mensajeID = mensajeID;
    }


    /**
     * Gets the cotizacionID value for this RetornoCotizacion.
     * 
     * @return cotizacionID
     */
    public java.lang.String getCotizacionID() {
        return cotizacionID;
    }


    /**
     * Sets the cotizacionID value for this RetornoCotizacion.
     * 
     * @param cotizacionID
     */
    public void setCotizacionID(java.lang.String cotizacionID) {
        this.cotizacionID = cotizacionID;
    }


    /**
     * Gets the numeroCotizacion value for this RetornoCotizacion.
     * 
     * @return numeroCotizacion
     */
    public java.lang.String getNumeroCotizacion() {
        return numeroCotizacion;
    }


    /**
     * Sets the numeroCotizacion value for this RetornoCotizacion.
     * 
     * @param numeroCotizacion
     */
    public void setNumeroCotizacion(java.lang.String numeroCotizacion) {
        this.numeroCotizacion = numeroCotizacion;
    }


    /**
     * Gets the ofertas value for this RetornoCotizacion.
     * 
     * @return ofertas
     */
    public java.lang.Object[] getOfertas() {
        return ofertas;
    }


    /**
     * Sets the ofertas value for this RetornoCotizacion.
     * 
     * @param ofertas
     */
    public void setOfertas(java.lang.Object[] ofertas) {
        this.ofertas = ofertas;
    }


    /**
     * Gets the vacio value for this RetornoCotizacion.
     * 
     * @return vacio
     */
    public arg.mps.seguros.broker.api.integration.ans.client.emision.Ofertas getVacio() {
        return vacio;
    }


    /**
     * Sets the vacio value for this RetornoCotizacion.
     * 
     * @param vacio
     */
    public void setVacio(arg.mps.seguros.broker.api.integration.ans.client.emision.Ofertas vacio) {
        this.vacio = vacio;
    }


    /**
     * Gets the mensaje value for this RetornoCotizacion.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this RetornoCotizacion.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }


    /**
     * Gets the mensajeID value for this RetornoCotizacion.
     * 
     * @return mensajeID
     */
    public int getMensajeID() {
        return mensajeID;
    }


    /**
     * Sets the mensajeID value for this RetornoCotizacion.
     * 
     * @param mensajeID
     */
    public void setMensajeID(int mensajeID) {
        this.mensajeID = mensajeID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetornoCotizacion)) return false;
        RetornoCotizacion other = (RetornoCotizacion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cotizacionID==null && other.getCotizacionID()==null) || 
             (this.cotizacionID!=null &&
              this.cotizacionID.equals(other.getCotizacionID()))) &&
            ((this.numeroCotizacion==null && other.getNumeroCotizacion()==null) || 
             (this.numeroCotizacion!=null &&
              this.numeroCotizacion.equals(other.getNumeroCotizacion()))) &&
            ((this.ofertas==null && other.getOfertas()==null) || 
             (this.ofertas!=null &&
              java.util.Arrays.equals(this.ofertas, other.getOfertas()))) &&
            ((this.vacio==null && other.getVacio()==null) || 
             (this.vacio!=null &&
              this.vacio.equals(other.getVacio()))) &&
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje()))) &&
            this.mensajeID == other.getMensajeID();
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
        if (getCotizacionID() != null) {
            _hashCode += getCotizacionID().hashCode();
        }
        if (getNumeroCotizacion() != null) {
            _hashCode += getNumeroCotizacion().hashCode();
        }
        if (getOfertas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfertas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfertas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVacio() != null) {
            _hashCode += getVacio().hashCode();
        }
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        _hashCode += getMensajeID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetornoCotizacion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/encodedTypes", "RetornoCotizacion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cotizacionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CotizacionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCotizacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumeroCotizacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ofertas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Ofertas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vacio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vacio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/encodedTypes", "Ofertas"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensajeID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MensajeID"));
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
