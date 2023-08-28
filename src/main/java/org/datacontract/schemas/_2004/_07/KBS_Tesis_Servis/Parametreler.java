/**
 * Parametreler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.KBS_Tesis_Servis;

public class Parametreler  implements java.io.Serializable {
    private java.lang.String ACIKLAMA;

    private org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Parametreler[] items;

    private java.lang.String KOD;

    private org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc sonuc;

    public Parametreler() {
    }

    public Parametreler(
           java.lang.String ACIKLAMA,
           org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Parametreler[] items,
           java.lang.String KOD,
           org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc sonuc) {
           this.ACIKLAMA = ACIKLAMA;
           this.items = items;
           this.KOD = KOD;
           this.sonuc = sonuc;
    }


    /**
     * Gets the ACIKLAMA value for this Parametreler.
     * 
     * @return ACIKLAMA
     */
    public java.lang.String getACIKLAMA() {
        return ACIKLAMA;
    }


    /**
     * Sets the ACIKLAMA value for this Parametreler.
     * 
     * @param ACIKLAMA
     */
    public void setACIKLAMA(java.lang.String ACIKLAMA) {
        this.ACIKLAMA = ACIKLAMA;
    }


    /**
     * Gets the items value for this Parametreler.
     * 
     * @return items
     */
    public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Parametreler[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this Parametreler.
     * 
     * @param items
     */
    public void setItems(org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Parametreler[] items) {
        this.items = items;
    }


    /**
     * Gets the KOD value for this Parametreler.
     * 
     * @return KOD
     */
    public java.lang.String getKOD() {
        return KOD;
    }


    /**
     * Sets the KOD value for this Parametreler.
     * 
     * @param KOD
     */
    public void setKOD(java.lang.String KOD) {
        this.KOD = KOD;
    }


    /**
     * Gets the sonuc value for this Parametreler.
     * 
     * @return sonuc
     */
    public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc getSonuc() {
        return sonuc;
    }


    /**
     * Sets the sonuc value for this Parametreler.
     * 
     * @param sonuc
     */
    public void setSonuc(org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc sonuc) {
        this.sonuc = sonuc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Parametreler)) return false;
        Parametreler other = (Parametreler) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ACIKLAMA==null && other.getACIKLAMA()==null) || 
             (this.ACIKLAMA!=null &&
              this.ACIKLAMA.equals(other.getACIKLAMA()))) &&
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems()))) &&
            ((this.KOD==null && other.getKOD()==null) || 
             (this.KOD!=null &&
              this.KOD.equals(other.getKOD()))) &&
            ((this.sonuc==null && other.getSonuc()==null) || 
             (this.sonuc!=null &&
              this.sonuc.equals(other.getSonuc())));
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
        if (getACIKLAMA() != null) {
            _hashCode += getACIKLAMA().hashCode();
        }
        if (getItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKOD() != null) {
            _hashCode += getKOD().hashCode();
        }
        if (getSonuc() != null) {
            _hashCode += getSonuc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Parametreler.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "Parametreler"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACIKLAMA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "ACIKLAMA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "Items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "Parametreler"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "Parametreler"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "KOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sonuc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "sonuc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "Sonuc"));
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
