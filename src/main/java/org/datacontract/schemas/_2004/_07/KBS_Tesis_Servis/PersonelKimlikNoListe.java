/**
 * PersonelKimlikNoListe.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.KBS_Tesis_Servis;

public class PersonelKimlikNoListe  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.KBS_Tesis_Servis.PersonelKimlikNoGirisSonuc[] mItems;

    private org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc sonuc;

    public PersonelKimlikNoListe() {
    }

    public PersonelKimlikNoListe(
           org.datacontract.schemas._2004._07.KBS_Tesis_Servis.PersonelKimlikNoGirisSonuc[] mItems,
           org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc sonuc) {
           this.mItems = mItems;
           this.sonuc = sonuc;
    }


    /**
     * Gets the mItems value for this PersonelKimlikNoListe.
     * 
     * @return mItems
     */
    public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.PersonelKimlikNoGirisSonuc[] getMItems() {
        return mItems;
    }


    /**
     * Sets the mItems value for this PersonelKimlikNoListe.
     * 
     * @param mItems
     */
    public void setMItems(org.datacontract.schemas._2004._07.KBS_Tesis_Servis.PersonelKimlikNoGirisSonuc[] mItems) {
        this.mItems = mItems;
    }


    /**
     * Gets the sonuc value for this PersonelKimlikNoListe.
     * 
     * @return sonuc
     */
    public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc getSonuc() {
        return sonuc;
    }


    /**
     * Sets the sonuc value for this PersonelKimlikNoListe.
     * 
     * @param sonuc
     */
    public void setSonuc(org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc sonuc) {
        this.sonuc = sonuc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonelKimlikNoListe)) return false;
        PersonelKimlikNoListe other = (PersonelKimlikNoListe) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mItems==null && other.getMItems()==null) || 
             (this.mItems!=null &&
              java.util.Arrays.equals(this.mItems, other.getMItems()))) &&
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
        if (getMItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSonuc() != null) {
            _hashCode += getSonuc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonelKimlikNoListe.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "PersonelKimlikNoListe"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "mItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "PersonelKimlikNoGirisSonuc"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "PersonelKimlikNoGirisSonuc"));
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
