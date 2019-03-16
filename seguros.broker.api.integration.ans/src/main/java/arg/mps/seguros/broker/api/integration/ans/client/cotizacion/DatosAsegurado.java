/**
 * DatosAsegurado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package arg.mps.seguros.broker.api.integration.ans.client.cotizacion;

@SuppressWarnings("all")
public class DatosAsegurado  implements java.io.Serializable {
    private java.lang.String rut;

    private java.lang.String nombres;

    private java.lang.String apellidoPaterno;

    private java.lang.String apellidoMaterno;

    private java.lang.String direccion;

    private int comunaID;

    private java.lang.String telefono;

    private java.lang.String email;

    private java.util.Calendar fechaNacimiento;

    private int parentesco;

    private int legales;

    public DatosAsegurado() {
    }

    public DatosAsegurado(
           java.lang.String rut,
           java.lang.String nombres,
           java.lang.String apellidoPaterno,
           java.lang.String apellidoMaterno,
           java.lang.String direccion,
           int comunaID,
           java.lang.String telefono,
           java.lang.String email,
           java.util.Calendar fechaNacimiento,
           int parentesco,
           int legales) {
           this.rut = rut;
           this.nombres = nombres;
           this.apellidoPaterno = apellidoPaterno;
           this.apellidoMaterno = apellidoMaterno;
           this.direccion = direccion;
           this.comunaID = comunaID;
           this.telefono = telefono;
           this.email = email;
           this.fechaNacimiento = fechaNacimiento;
           this.parentesco = parentesco;
           this.legales = legales;
    }


    /**
     * Gets the rut value for this DatosAsegurado.
     * 
     * @return rut
     */
    public java.lang.String getRut() {
        return rut;
    }


    /**
     * Sets the rut value for this DatosAsegurado.
     * 
     * @param rut
     */
    public void setRut(java.lang.String rut) {
        this.rut = rut;
    }


    /**
     * Gets the nombres value for this DatosAsegurado.
     * 
     * @return nombres
     */
    public java.lang.String getNombres() {
        return nombres;
    }


    /**
     * Sets the nombres value for this DatosAsegurado.
     * 
     * @param nombres
     */
    public void setNombres(java.lang.String nombres) {
        this.nombres = nombres;
    }


    /**
     * Gets the apellidoPaterno value for this DatosAsegurado.
     * 
     * @return apellidoPaterno
     */
    public java.lang.String getApellidoPaterno() {
        return apellidoPaterno;
    }


    /**
     * Sets the apellidoPaterno value for this DatosAsegurado.
     * 
     * @param apellidoPaterno
     */
    public void setApellidoPaterno(java.lang.String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }


    /**
     * Gets the apellidoMaterno value for this DatosAsegurado.
     * 
     * @return apellidoMaterno
     */
    public java.lang.String getApellidoMaterno() {
        return apellidoMaterno;
    }


    /**
     * Sets the apellidoMaterno value for this DatosAsegurado.
     * 
     * @param apellidoMaterno
     */
    public void setApellidoMaterno(java.lang.String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }


    /**
     * Gets the direccion value for this DatosAsegurado.
     * 
     * @return direccion
     */
    public java.lang.String getDireccion() {
        return direccion;
    }


    /**
     * Sets the direccion value for this DatosAsegurado.
     * 
     * @param direccion
     */
    public void setDireccion(java.lang.String direccion) {
        this.direccion = direccion;
    }


    /**
     * Gets the comunaID value for this DatosAsegurado.
     * 
     * @return comunaID
     */
    public int getComunaID() {
        return comunaID;
    }


    /**
     * Sets the comunaID value for this DatosAsegurado.
     * 
     * @param comunaID
     */
    public void setComunaID(int comunaID) {
        this.comunaID = comunaID;
    }


    /**
     * Gets the telefono value for this DatosAsegurado.
     * 
     * @return telefono
     */
    public java.lang.String getTelefono() {
        return telefono;
    }


    /**
     * Sets the telefono value for this DatosAsegurado.
     * 
     * @param telefono
     */
    public void setTelefono(java.lang.String telefono) {
        this.telefono = telefono;
    }


    /**
     * Gets the email value for this DatosAsegurado.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this DatosAsegurado.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the fechaNacimiento value for this DatosAsegurado.
     * 
     * @return fechaNacimiento
     */
    public java.util.Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }


    /**
     * Sets the fechaNacimiento value for this DatosAsegurado.
     * 
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(java.util.Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    /**
     * Gets the parentesco value for this DatosAsegurado.
     * 
     * @return parentesco
     */
    public int getParentesco() {
        return parentesco;
    }


    /**
     * Sets the parentesco value for this DatosAsegurado.
     * 
     * @param parentesco
     */
    public void setParentesco(int parentesco) {
        this.parentesco = parentesco;
    }


    /**
     * Gets the legales value for this DatosAsegurado.
     * 
     * @return legales
     */
    public int getLegales() {
        return legales;
    }


    /**
     * Sets the legales value for this DatosAsegurado.
     * 
     * @param legales
     */
    public void setLegales(int legales) {
        this.legales = legales;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosAsegurado)) return false;
        DatosAsegurado other = (DatosAsegurado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rut==null && other.getRut()==null) || 
             (this.rut!=null &&
              this.rut.equals(other.getRut()))) &&
            ((this.nombres==null && other.getNombres()==null) || 
             (this.nombres!=null &&
              this.nombres.equals(other.getNombres()))) &&
            ((this.apellidoPaterno==null && other.getApellidoPaterno()==null) || 
             (this.apellidoPaterno!=null &&
              this.apellidoPaterno.equals(other.getApellidoPaterno()))) &&
            ((this.apellidoMaterno==null && other.getApellidoMaterno()==null) || 
             (this.apellidoMaterno!=null &&
              this.apellidoMaterno.equals(other.getApellidoMaterno()))) &&
            ((this.direccion==null && other.getDireccion()==null) || 
             (this.direccion!=null &&
              this.direccion.equals(other.getDireccion()))) &&
            this.comunaID == other.getComunaID() &&
            ((this.telefono==null && other.getTelefono()==null) || 
             (this.telefono!=null &&
              this.telefono.equals(other.getTelefono()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.fechaNacimiento==null && other.getFechaNacimiento()==null) || 
             (this.fechaNacimiento!=null &&
              this.fechaNacimiento.equals(other.getFechaNacimiento()))) &&
            this.parentesco == other.getParentesco() &&
            this.legales == other.getLegales();
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
        if (getRut() != null) {
            _hashCode += getRut().hashCode();
        }
        if (getNombres() != null) {
            _hashCode += getNombres().hashCode();
        }
        if (getApellidoPaterno() != null) {
            _hashCode += getApellidoPaterno().hashCode();
        }
        if (getApellidoMaterno() != null) {
            _hashCode += getApellidoMaterno().hashCode();
        }
        if (getDireccion() != null) {
            _hashCode += getDireccion().hashCode();
        }
        _hashCode += getComunaID();
        if (getTelefono() != null) {
            _hashCode += getTelefono().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFechaNacimiento() != null) {
            _hashCode += getFechaNacimiento().hashCode();
        }
        _hashCode += getParentesco();
        _hashCode += getLegales();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosAsegurado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/encodedTypes", "DatosAsegurado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rut");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Rut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombres");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Nombres"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellidoPaterno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ApellidoPaterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellidoMaterno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ApellidoMaterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Direccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comunaID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ComunaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefono");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Telefono"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FechaNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentesco");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Parentesco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legales");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Legales"));
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
