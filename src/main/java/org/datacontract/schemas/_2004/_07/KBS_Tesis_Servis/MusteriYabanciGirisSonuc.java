/**
 * MusteriYabanciGirisSonuc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.KBS_Tesis_Servis;

public class MusteriYabanciGirisSonuc  implements java.io.Serializable {
    private java.lang.String ADI;

    private java.lang.String ANAADI;

    private java.lang.String BABADI;

    private java.lang.String BELGENO;

    private org.datacontract.schemas._2004._07.KBS_Model.SnfEnumCinsiyet CINSIYET;

    private java.util.Calendar DOGUMTARIHI;

    private java.util.Calendar GRSTRH;

    private org.datacontract.schemas._2004._07.KBS_Model.SnfEnumKonaklayanKullanimSekli KULLANIMSEKLI;

    private org.datacontract.schemas._2004._07.KBS_Model.SnfEnumMedeniHal MEDENIHAL;

    private java.lang.String ODANO;

    private java.lang.String PLKNO;

    private java.lang.String SOYADI;

    private java.lang.String TELNO;

    private org.datacontract.schemas._2004._07.KBS_Model.SnfEnumUlkeler ULKKOD;

    private org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc sonuc;

    public MusteriYabanciGirisSonuc() {
    }

    public MusteriYabanciGirisSonuc(
           java.lang.String ADI,
           java.lang.String ANAADI,
           java.lang.String BABADI,
           java.lang.String BELGENO,
           org.datacontract.schemas._2004._07.KBS_Model.SnfEnumCinsiyet CINSIYET,
           java.util.Calendar DOGUMTARIHI,
           java.util.Calendar GRSTRH,
           org.datacontract.schemas._2004._07.KBS_Model.SnfEnumKonaklayanKullanimSekli KULLANIMSEKLI,
           org.datacontract.schemas._2004._07.KBS_Model.SnfEnumMedeniHal MEDENIHAL,
           java.lang.String ODANO,
           java.lang.String PLKNO,
           java.lang.String SOYADI,
           java.lang.String TELNO,
           org.datacontract.schemas._2004._07.KBS_Model.SnfEnumUlkeler ULKKOD,
           org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc sonuc) {
           this.ADI = ADI;
           this.ANAADI = ANAADI;
           this.BABADI = BABADI;
           this.BELGENO = BELGENO;
           this.CINSIYET = CINSIYET;
           this.DOGUMTARIHI = DOGUMTARIHI;
           this.GRSTRH = GRSTRH;
           this.KULLANIMSEKLI = KULLANIMSEKLI;
           this.MEDENIHAL = MEDENIHAL;
           this.ODANO = ODANO;
           this.PLKNO = PLKNO;
           this.SOYADI = SOYADI;
           this.TELNO = TELNO;
           this.ULKKOD = ULKKOD;
           this.sonuc = sonuc;
    }


    /**
     * Gets the ADI value for this MusteriYabanciGirisSonuc.
     * 
     * @return ADI
     */
    public java.lang.String getADI() {
        return ADI;
    }


    /**
     * Sets the ADI value for this MusteriYabanciGirisSonuc.
     * 
     * @param ADI
     */
    public void setADI(java.lang.String ADI) {
        this.ADI = ADI;
    }


    /**
     * Gets the ANAADI value for this MusteriYabanciGirisSonuc.
     * 
     * @return ANAADI
     */
    public java.lang.String getANAADI() {
        return ANAADI;
    }


    /**
     * Sets the ANAADI value for this MusteriYabanciGirisSonuc.
     * 
     * @param ANAADI
     */
    public void setANAADI(java.lang.String ANAADI) {
        this.ANAADI = ANAADI;
    }


    /**
     * Gets the BABADI value for this MusteriYabanciGirisSonuc.
     * 
     * @return BABADI
     */
    public java.lang.String getBABADI() {
        return BABADI;
    }


    /**
     * Sets the BABADI value for this MusteriYabanciGirisSonuc.
     * 
     * @param BABADI
     */
    public void setBABADI(java.lang.String BABADI) {
        this.BABADI = BABADI;
    }


    /**
     * Gets the BELGENO value for this MusteriYabanciGirisSonuc.
     * 
     * @return BELGENO
     */
    public java.lang.String getBELGENO() {
        return BELGENO;
    }


    /**
     * Sets the BELGENO value for this MusteriYabanciGirisSonuc.
     * 
     * @param BELGENO
     */
    public void setBELGENO(java.lang.String BELGENO) {
        this.BELGENO = BELGENO;
    }


    /**
     * Gets the CINSIYET value for this MusteriYabanciGirisSonuc.
     * 
     * @return CINSIYET
     */
    public org.datacontract.schemas._2004._07.KBS_Model.SnfEnumCinsiyet getCINSIYET() {
        return CINSIYET;
    }


    /**
     * Sets the CINSIYET value for this MusteriYabanciGirisSonuc.
     * 
     * @param CINSIYET
     */
    public void setCINSIYET(org.datacontract.schemas._2004._07.KBS_Model.SnfEnumCinsiyet CINSIYET) {
        this.CINSIYET = CINSIYET;
    }


    /**
     * Gets the DOGUMTARIHI value for this MusteriYabanciGirisSonuc.
     * 
     * @return DOGUMTARIHI
     */
    public java.util.Calendar getDOGUMTARIHI() {
        return DOGUMTARIHI;
    }


    /**
     * Sets the DOGUMTARIHI value for this MusteriYabanciGirisSonuc.
     * 
     * @param DOGUMTARIHI
     */
    public void setDOGUMTARIHI(java.util.Calendar DOGUMTARIHI) {
        this.DOGUMTARIHI = DOGUMTARIHI;
    }


    /**
     * Gets the GRSTRH value for this MusteriYabanciGirisSonuc.
     * 
     * @return GRSTRH
     */
    public java.util.Calendar getGRSTRH() {
        return GRSTRH;
    }


    /**
     * Sets the GRSTRH value for this MusteriYabanciGirisSonuc.
     * 
     * @param GRSTRH
     */
    public void setGRSTRH(java.util.Calendar GRSTRH) {
        this.GRSTRH = GRSTRH;
    }


    /**
     * Gets the KULLANIMSEKLI value for this MusteriYabanciGirisSonuc.
     * 
     * @return KULLANIMSEKLI
     */
    public org.datacontract.schemas._2004._07.KBS_Model.SnfEnumKonaklayanKullanimSekli getKULLANIMSEKLI() {
        return KULLANIMSEKLI;
    }


    /**
     * Sets the KULLANIMSEKLI value for this MusteriYabanciGirisSonuc.
     * 
     * @param KULLANIMSEKLI
     */
    public void setKULLANIMSEKLI(org.datacontract.schemas._2004._07.KBS_Model.SnfEnumKonaklayanKullanimSekli KULLANIMSEKLI) {
        this.KULLANIMSEKLI = KULLANIMSEKLI;
    }


    /**
     * Gets the MEDENIHAL value for this MusteriYabanciGirisSonuc.
     * 
     * @return MEDENIHAL
     */
    public org.datacontract.schemas._2004._07.KBS_Model.SnfEnumMedeniHal getMEDENIHAL() {
        return MEDENIHAL;
    }


    /**
     * Sets the MEDENIHAL value for this MusteriYabanciGirisSonuc.
     * 
     * @param MEDENIHAL
     */
    public void setMEDENIHAL(org.datacontract.schemas._2004._07.KBS_Model.SnfEnumMedeniHal MEDENIHAL) {
        this.MEDENIHAL = MEDENIHAL;
    }


    /**
     * Gets the ODANO value for this MusteriYabanciGirisSonuc.
     * 
     * @return ODANO
     */
    public java.lang.String getODANO() {
        return ODANO;
    }


    /**
     * Sets the ODANO value for this MusteriYabanciGirisSonuc.
     * 
     * @param ODANO
     */
    public void setODANO(java.lang.String ODANO) {
        this.ODANO = ODANO;
    }


    /**
     * Gets the PLKNO value for this MusteriYabanciGirisSonuc.
     * 
     * @return PLKNO
     */
    public java.lang.String getPLKNO() {
        return PLKNO;
    }


    /**
     * Sets the PLKNO value for this MusteriYabanciGirisSonuc.
     * 
     * @param PLKNO
     */
    public void setPLKNO(java.lang.String PLKNO) {
        this.PLKNO = PLKNO;
    }


    /**
     * Gets the SOYADI value for this MusteriYabanciGirisSonuc.
     * 
     * @return SOYADI
     */
    public java.lang.String getSOYADI() {
        return SOYADI;
    }


    /**
     * Sets the SOYADI value for this MusteriYabanciGirisSonuc.
     * 
     * @param SOYADI
     */
    public void setSOYADI(java.lang.String SOYADI) {
        this.SOYADI = SOYADI;
    }


    /**
     * Gets the TELNO value for this MusteriYabanciGirisSonuc.
     * 
     * @return TELNO
     */
    public java.lang.String getTELNO() {
        return TELNO;
    }


    /**
     * Sets the TELNO value for this MusteriYabanciGirisSonuc.
     * 
     * @param TELNO
     */
    public void setTELNO(java.lang.String TELNO) {
        this.TELNO = TELNO;
    }


    /**
     * Gets the ULKKOD value for this MusteriYabanciGirisSonuc.
     * 
     * @return ULKKOD
     */
    public org.datacontract.schemas._2004._07.KBS_Model.SnfEnumUlkeler getULKKOD() {
        return ULKKOD;
    }


    /**
     * Sets the ULKKOD value for this MusteriYabanciGirisSonuc.
     * 
     * @param ULKKOD
     */
    public void setULKKOD(org.datacontract.schemas._2004._07.KBS_Model.SnfEnumUlkeler ULKKOD) {
        this.ULKKOD = ULKKOD;
    }


    /**
     * Gets the sonuc value for this MusteriYabanciGirisSonuc.
     * 
     * @return sonuc
     */
    public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc getSonuc() {
        return sonuc;
    }


    /**
     * Sets the sonuc value for this MusteriYabanciGirisSonuc.
     * 
     * @param sonuc
     */
    public void setSonuc(org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc sonuc) {
        this.sonuc = sonuc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MusteriYabanciGirisSonuc)) return false;
        MusteriYabanciGirisSonuc other = (MusteriYabanciGirisSonuc) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ADI==null && other.getADI()==null) || 
             (this.ADI!=null &&
              this.ADI.equals(other.getADI()))) &&
            ((this.ANAADI==null && other.getANAADI()==null) || 
             (this.ANAADI!=null &&
              this.ANAADI.equals(other.getANAADI()))) &&
            ((this.BABADI==null && other.getBABADI()==null) || 
             (this.BABADI!=null &&
              this.BABADI.equals(other.getBABADI()))) &&
            ((this.BELGENO==null && other.getBELGENO()==null) || 
             (this.BELGENO!=null &&
              this.BELGENO.equals(other.getBELGENO()))) &&
            ((this.CINSIYET==null && other.getCINSIYET()==null) || 
             (this.CINSIYET!=null &&
              this.CINSIYET.equals(other.getCINSIYET()))) &&
            ((this.DOGUMTARIHI==null && other.getDOGUMTARIHI()==null) || 
             (this.DOGUMTARIHI!=null &&
              this.DOGUMTARIHI.equals(other.getDOGUMTARIHI()))) &&
            ((this.GRSTRH==null && other.getGRSTRH()==null) || 
             (this.GRSTRH!=null &&
              this.GRSTRH.equals(other.getGRSTRH()))) &&
            ((this.KULLANIMSEKLI==null && other.getKULLANIMSEKLI()==null) || 
             (this.KULLANIMSEKLI!=null &&
              this.KULLANIMSEKLI.equals(other.getKULLANIMSEKLI()))) &&
            ((this.MEDENIHAL==null && other.getMEDENIHAL()==null) || 
             (this.MEDENIHAL!=null &&
              this.MEDENIHAL.equals(other.getMEDENIHAL()))) &&
            ((this.ODANO==null && other.getODANO()==null) || 
             (this.ODANO!=null &&
              this.ODANO.equals(other.getODANO()))) &&
            ((this.PLKNO==null && other.getPLKNO()==null) || 
             (this.PLKNO!=null &&
              this.PLKNO.equals(other.getPLKNO()))) &&
            ((this.SOYADI==null && other.getSOYADI()==null) || 
             (this.SOYADI!=null &&
              this.SOYADI.equals(other.getSOYADI()))) &&
            ((this.TELNO==null && other.getTELNO()==null) || 
             (this.TELNO!=null &&
              this.TELNO.equals(other.getTELNO()))) &&
            ((this.ULKKOD==null && other.getULKKOD()==null) || 
             (this.ULKKOD!=null &&
              this.ULKKOD.equals(other.getULKKOD()))) &&
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
        if (getADI() != null) {
            _hashCode += getADI().hashCode();
        }
        if (getANAADI() != null) {
            _hashCode += getANAADI().hashCode();
        }
        if (getBABADI() != null) {
            _hashCode += getBABADI().hashCode();
        }
        if (getBELGENO() != null) {
            _hashCode += getBELGENO().hashCode();
        }
        if (getCINSIYET() != null) {
            _hashCode += getCINSIYET().hashCode();
        }
        if (getDOGUMTARIHI() != null) {
            _hashCode += getDOGUMTARIHI().hashCode();
        }
        if (getGRSTRH() != null) {
            _hashCode += getGRSTRH().hashCode();
        }
        if (getKULLANIMSEKLI() != null) {
            _hashCode += getKULLANIMSEKLI().hashCode();
        }
        if (getMEDENIHAL() != null) {
            _hashCode += getMEDENIHAL().hashCode();
        }
        if (getODANO() != null) {
            _hashCode += getODANO().hashCode();
        }
        if (getPLKNO() != null) {
            _hashCode += getPLKNO().hashCode();
        }
        if (getSOYADI() != null) {
            _hashCode += getSOYADI().hashCode();
        }
        if (getTELNO() != null) {
            _hashCode += getTELNO().hashCode();
        }
        if (getULKKOD() != null) {
            _hashCode += getULKKOD().hashCode();
        }
        if (getSonuc() != null) {
            _hashCode += getSonuc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MusteriYabanciGirisSonuc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "MusteriYabanciGirisSonuc"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ADI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "ADI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ANAADI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "ANAADI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BABADI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "BABADI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BELGENO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "BELGENO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CINSIYET");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "CINSIYET"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Model", "snfEnum.Cinsiyet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOGUMTARIHI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "DOGUMTARIHI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GRSTRH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "GRSTRH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("MEDENIHAL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "MEDENIHAL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Model", "snfEnum.MedeniHal"));
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
        elemField.setFieldName("SOYADI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "SOYADI"));
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
