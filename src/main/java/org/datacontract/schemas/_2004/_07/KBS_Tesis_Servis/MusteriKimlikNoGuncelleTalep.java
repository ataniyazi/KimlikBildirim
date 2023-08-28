/**
 * MusteriKimlikNoGuncelleTalep.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.KBS_Tesis_Servis;

public class MusteriKimlikNoGuncelleTalep  implements java.io.Serializable {
    private java.util.Calendar GRSTRH;

    private java.lang.Boolean ILERITARIHLI;

    private java.lang.Long KIMLIKNO;

    private org.datacontract.schemas._2004._07.KBS_Model.SnfEnumKonaklayanKullanimSekli KULLANIMSEKLI;

    private java.lang.String ODANO;

    private java.lang.String PLKNO;

    private java.lang.String TELNO;

    private org.datacontract.schemas._2004._07.KBS_Model.SnfEnumUlkeler ULKKOD;

    public MusteriKimlikNoGuncelleTalep() {
    }

    public MusteriKimlikNoGuncelleTalep(
           java.util.Calendar GRSTRH,
           java.lang.Boolean ILERITARIHLI,
           java.lang.Long KIMLIKNO,
           org.datacontract.schemas._2004._07.KBS_Model.SnfEnumKonaklayanKullanimSekli KULLANIMSEKLI,
           java.lang.String ODANO,
           java.lang.String PLKNO,
           java.lang.String TELNO,
           org.datacontract.schemas._2004._07.KBS_Model.SnfEnumUlkeler ULKKOD) {
           this.GRSTRH = GRSTRH;
           this.ILERITARIHLI = ILERITARIHLI;
           this.KIMLIKNO = KIMLIKNO;
           this.KULLANIMSEKLI = KULLANIMSEKLI;
           this.ODANO = ODANO;
           this.PLKNO = PLKNO;
           this.TELNO = TELNO;
           this.ULKKOD = ULKKOD;
    }


    /**
     * Gets the GRSTRH value for this MusteriKimlikNoGuncelleTalep.
     * 
     * @return GRSTRH
     */
    public java.util.Calendar getGRSTRH() {
        return GRSTRH;
    }


    /**
     * Sets the GRSTRH value for this MusteriKimlikNoGuncelleTalep.
     * 
     * @param GRSTRH
     */
    public void setGRSTRH(java.util.Calendar GRSTRH) {
        this.GRSTRH = GRSTRH;
    }


    /**
     * Gets the ILERITARIHLI value for this MusteriKimlikNoGuncelleTalep.
     * 
     * @return ILERITARIHLI
     */
    public java.lang.Boolean getILERITARIHLI() {
        return ILERITARIHLI;
    }


    /**
     * Sets the ILERITARIHLI value for this MusteriKimlikNoGuncelleTalep.
     * 
     * @param ILERITARIHLI
     */
    public void setILERITARIHLI(java.lang.Boolean ILERITARIHLI) {
        this.ILERITARIHLI = ILERITARIHLI;
    }


    /**
     * Gets the KIMLIKNO value for this MusteriKimlikNoGuncelleTalep.
     * 
     * @return KIMLIKNO
     */
    public java.lang.Long getKIMLIKNO() {
        return KIMLIKNO;
    }


    /**
     * Sets the KIMLIKNO value for this MusteriKimlikNoGuncelleTalep.
     * 
     * @param KIMLIKNO
     */
    public void setKIMLIKNO(java.lang.Long KIMLIKNO) {
        this.KIMLIKNO = KIMLIKNO;
    }


    /**
     * Gets the KULLANIMSEKLI value for this MusteriKimlikNoGuncelleTalep.
     * 
     * @return KULLANIMSEKLI
     */
    public org.datacontract.schemas._2004._07.KBS_Model.SnfEnumKonaklayanKullanimSekli getKULLANIMSEKLI() {
        return KULLANIMSEKLI;
    }


    /**
     * Sets the KULLANIMSEKLI value for this MusteriKimlikNoGuncelleTalep.
     * 
     * @param KULLANIMSEKLI
     */
    public void setKULLANIMSEKLI(org.datacontract.schemas._2004._07.KBS_Model.SnfEnumKonaklayanKullanimSekli KULLANIMSEKLI) {
        this.KULLANIMSEKLI = KULLANIMSEKLI;
    }


    /**
     * Gets the ODANO value for this MusteriKimlikNoGuncelleTalep.
     * 
     * @return ODANO
     */
    public java.lang.String getODANO() {
        return ODANO;
    }


    /**
     * Sets the ODANO value for this MusteriKimlikNoGuncelleTalep.
     * 
     * @param ODANO
     */
    public void setODANO(java.lang.String ODANO) {
        this.ODANO = ODANO;
    }


    /**
     * Gets the PLKNO value for this MusteriKimlikNoGuncelleTalep.
     * 
     * @return PLKNO
     */
    public java.lang.String getPLKNO() {
        return PLKNO;
    }


    /**
     * Sets the PLKNO value for this MusteriKimlikNoGuncelleTalep.
     * 
     * @param PLKNO
     */
    public void setPLKNO(java.lang.String PLKNO) {
        this.PLKNO = PLKNO;
    }


    /**
     * Gets the TELNO value for this MusteriKimlikNoGuncelleTalep.
     * 
     * @return TELNO
     */
    public java.lang.String getTELNO() {
        return TELNO;
    }


    /**
     * Sets the TELNO value for this MusteriKimlikNoGuncelleTalep.
     * 
     * @param TELNO
     */
    public void setTELNO(java.lang.String TELNO) {
        this.TELNO = TELNO;
    }


    /**
     * Gets the ULKKOD value for this MusteriKimlikNoGuncelleTalep.
     * 
     * @return ULKKOD
     */
    public org.datacontract.schemas._2004._07.KBS_Model.SnfEnumUlkeler getULKKOD() {
        return ULKKOD;
    }


    /**
     * Sets the ULKKOD value for this MusteriKimlikNoGuncelleTalep.
     * 
     * @param ULKKOD
     */
    public void setULKKOD(org.datacontract.schemas._2004._07.KBS_Model.SnfEnumUlkeler ULKKOD) {
        this.ULKKOD = ULKKOD;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MusteriKimlikNoGuncelleTalep)) return false;
        MusteriKimlikNoGuncelleTalep other = (MusteriKimlikNoGuncelleTalep) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GRSTRH==null && other.getGRSTRH()==null) || 
             (this.GRSTRH!=null &&
              this.GRSTRH.equals(other.getGRSTRH()))) &&
            ((this.ILERITARIHLI==null && other.getILERITARIHLI()==null) || 
             (this.ILERITARIHLI!=null &&
              this.ILERITARIHLI.equals(other.getILERITARIHLI()))) &&
            ((this.KIMLIKNO==null && other.getKIMLIKNO()==null) || 
             (this.KIMLIKNO!=null &&
              this.KIMLIKNO.equals(other.getKIMLIKNO()))) &&
            ((this.KULLANIMSEKLI==null && other.getKULLANIMSEKLI()==null) || 
             (this.KULLANIMSEKLI!=null &&
              this.KULLANIMSEKLI.equals(other.getKULLANIMSEKLI()))) &&
            ((this.ODANO==null && other.getODANO()==null) || 
             (this.ODANO!=null &&
              this.ODANO.equals(other.getODANO()))) &&
            ((this.PLKNO==null && other.getPLKNO()==null) || 
             (this.PLKNO!=null &&
              this.PLKNO.equals(other.getPLKNO()))) &&
            ((this.TELNO==null && other.getTELNO()==null) || 
             (this.TELNO!=null &&
              this.TELNO.equals(other.getTELNO()))) &&
            ((this.ULKKOD==null && other.getULKKOD()==null) || 
             (this.ULKKOD!=null &&
              this.ULKKOD.equals(other.getULKKOD())));
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
        if (getGRSTRH() != null) {
            _hashCode += getGRSTRH().hashCode();
        }
        if (getILERITARIHLI() != null) {
            _hashCode += getILERITARIHLI().hashCode();
        }
        if (getKIMLIKNO() != null) {
            _hashCode += getKIMLIKNO().hashCode();
        }
        if (getKULLANIMSEKLI() != null) {
            _hashCode += getKULLANIMSEKLI().hashCode();
        }
        if (getODANO() != null) {
            _hashCode += getODANO().hashCode();
        }
        if (getPLKNO() != null) {
            _hashCode += getPLKNO().hashCode();
        }
        if (getTELNO() != null) {
            _hashCode += getTELNO().hashCode();
        }
        if (getULKKOD() != null) {
            _hashCode += getULKKOD().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MusteriKimlikNoGuncelleTalep.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "MusteriKimlikNoGuncelleTalep"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GRSTRH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "GRSTRH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ILERITARIHLI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "ILERITARIHLI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KIMLIKNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "KIMLIKNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KULLANIMSEKLI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "KULLANIMSEKLI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Model", "snfEnum.KonaklayanKullanimSekli"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ODANO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "ODANO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLKNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "PLKNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TELNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "TELNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ULKKOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "ULKKOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Model", "snfEnum.Ulkeler"));
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
