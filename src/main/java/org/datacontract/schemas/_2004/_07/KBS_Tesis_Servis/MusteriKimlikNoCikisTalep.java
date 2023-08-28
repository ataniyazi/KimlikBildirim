/**
 * MusteriKimlikNoCikisTalep.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.KBS_Tesis_Servis;

public class MusteriKimlikNoCikisTalep  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.KBS_Model.SnfEnumKonaklayanCikisTurleri CKSTIP;

    private java.util.Calendar CKSTRH;

    private java.lang.Long KIMLIKNO;

    public MusteriKimlikNoCikisTalep() {
    }

    public MusteriKimlikNoCikisTalep(
           org.datacontract.schemas._2004._07.KBS_Model.SnfEnumKonaklayanCikisTurleri CKSTIP,
           java.util.Calendar CKSTRH,
           java.lang.Long KIMLIKNO) {
           this.CKSTIP = CKSTIP;
           this.CKSTRH = CKSTRH;
           this.KIMLIKNO = KIMLIKNO;
    }


    /**
     * Gets the CKSTIP value for this MusteriKimlikNoCikisTalep.
     * 
     * @return CKSTIP
     */
    public org.datacontract.schemas._2004._07.KBS_Model.SnfEnumKonaklayanCikisTurleri getCKSTIP() {
        return CKSTIP;
    }


    /**
     * Sets the CKSTIP value for this MusteriKimlikNoCikisTalep.
     * 
     * @param CKSTIP
     */
    public void setCKSTIP(org.datacontract.schemas._2004._07.KBS_Model.SnfEnumKonaklayanCikisTurleri CKSTIP) {
        this.CKSTIP = CKSTIP;
    }


    /**
     * Gets the CKSTRH value for this MusteriKimlikNoCikisTalep.
     * 
     * @return CKSTRH
     */
    public java.util.Calendar getCKSTRH() {
        return CKSTRH;
    }


    /**
     * Sets the CKSTRH value for this MusteriKimlikNoCikisTalep.
     * 
     * @param CKSTRH
     */
    public void setCKSTRH(java.util.Calendar CKSTRH) {
        this.CKSTRH = CKSTRH;
    }


    /**
     * Gets the KIMLIKNO value for this MusteriKimlikNoCikisTalep.
     * 
     * @return KIMLIKNO
     */
    public java.lang.Long getKIMLIKNO() {
        return KIMLIKNO;
    }


    /**
     * Sets the KIMLIKNO value for this MusteriKimlikNoCikisTalep.
     * 
     * @param KIMLIKNO
     */
    public void setKIMLIKNO(java.lang.Long KIMLIKNO) {
        this.KIMLIKNO = KIMLIKNO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MusteriKimlikNoCikisTalep)) return false;
        MusteriKimlikNoCikisTalep other = (MusteriKimlikNoCikisTalep) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CKSTIP==null && other.getCKSTIP()==null) || 
             (this.CKSTIP!=null &&
              this.CKSTIP.equals(other.getCKSTIP()))) &&
            ((this.CKSTRH==null && other.getCKSTRH()==null) || 
             (this.CKSTRH!=null &&
              this.CKSTRH.equals(other.getCKSTRH()))) &&
            ((this.KIMLIKNO==null && other.getKIMLIKNO()==null) || 
             (this.KIMLIKNO!=null &&
              this.KIMLIKNO.equals(other.getKIMLIKNO())));
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
        if (getCKSTIP() != null) {
            _hashCode += getCKSTIP().hashCode();
        }
        if (getCKSTRH() != null) {
            _hashCode += getCKSTRH().hashCode();
        }
        if (getKIMLIKNO() != null) {
            _hashCode += getKIMLIKNO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MusteriKimlikNoCikisTalep.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "MusteriKimlikNoCikisTalep"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CKSTIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "CKSTIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Model", "snfEnum.KonaklayanCikisTurleri"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CKSTRH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "CKSTRH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KIMLIKNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "KIMLIKNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
