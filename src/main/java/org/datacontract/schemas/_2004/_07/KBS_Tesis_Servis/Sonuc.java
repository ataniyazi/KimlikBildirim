/**
 * Sonuc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.KBS_Tesis_Servis;

public class Sonuc  implements java.io.Serializable {
    private java.lang.Boolean basarili;

    private java.lang.String[] hataKodu;

    private java.lang.String mesaj;

    public Sonuc() {
    }

    public Sonuc(
           java.lang.Boolean basarili,
           java.lang.String[] hataKodu,
           java.lang.String mesaj) {
           this.basarili = basarili;
           this.hataKodu = hataKodu;
           this.mesaj = mesaj;
    }


    /**
     * Gets the basarili value for this Sonuc.
     * 
     * @return basarili
     */
    public java.lang.Boolean getBasarili() {
        return basarili;
    }


    /**
     * Sets the basarili value for this Sonuc.
     * 
     * @param basarili
     */
    public void setBasarili(java.lang.Boolean basarili) {
        this.basarili = basarili;
    }


    /**
     * Gets the hataKodu value for this Sonuc.
     * 
     * @return hataKodu
     */
    public java.lang.String[] getHataKodu() {
        return hataKodu;
    }


    /**
     * Sets the hataKodu value for this Sonuc.
     * 
     * @param hataKodu
     */
    public void setHataKodu(java.lang.String[] hataKodu) {
        this.hataKodu = hataKodu;
    }


    /**
     * Gets the mesaj value for this Sonuc.
     * 
     * @return mesaj
     */
    public java.lang.String getMesaj() {
        return mesaj;
    }


    /**
     * Sets the mesaj value for this Sonuc.
     * 
     * @param mesaj
     */
    public void setMesaj(java.lang.String mesaj) {
        this.mesaj = mesaj;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sonuc)) return false;
        Sonuc other = (Sonuc) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.basarili==null && other.getBasarili()==null) || 
             (this.basarili!=null &&
              this.basarili.equals(other.getBasarili()))) &&
            ((this.hataKodu==null && other.getHataKodu()==null) || 
             (this.hataKodu!=null &&
              java.util.Arrays.equals(this.hataKodu, other.getHataKodu()))) &&
            ((this.mesaj==null && other.getMesaj()==null) || 
             (this.mesaj!=null &&
              this.mesaj.equals(other.getMesaj())));
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
        if (getBasarili() != null) {
            _hashCode += getBasarili().hashCode();
        }
        if (getHataKodu() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHataKodu());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHataKodu(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMesaj() != null) {
            _hashCode += getMesaj().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sonuc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "Sonuc"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basarili");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "Basarili"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hataKodu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "HataKodu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "SrvShsYtkTml.Kodlar"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mesaj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "Mesaj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
