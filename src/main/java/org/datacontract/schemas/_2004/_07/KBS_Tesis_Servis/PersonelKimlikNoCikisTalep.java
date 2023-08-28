/**
 * PersonelKimlikNoCikisTalep.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.KBS_Tesis_Servis;

public class PersonelKimlikNoCikisTalep  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.KBS_Model.SnfEnumPerCikisTurleri AYRILISNEDENI;

    private java.util.Calendar AYRILISTRH;

    private java.lang.Long KIMLIKNO;

    public PersonelKimlikNoCikisTalep() {
    }

    public PersonelKimlikNoCikisTalep(
           org.datacontract.schemas._2004._07.KBS_Model.SnfEnumPerCikisTurleri AYRILISNEDENI,
           java.util.Calendar AYRILISTRH,
           java.lang.Long KIMLIKNO) {
           this.AYRILISNEDENI = AYRILISNEDENI;
           this.AYRILISTRH = AYRILISTRH;
           this.KIMLIKNO = KIMLIKNO;
    }


    /**
     * Gets the AYRILISNEDENI value for this PersonelKimlikNoCikisTalep.
     * 
     * @return AYRILISNEDENI
     */
    public org.datacontract.schemas._2004._07.KBS_Model.SnfEnumPerCikisTurleri getAYRILISNEDENI() {
        return AYRILISNEDENI;
    }


    /**
     * Sets the AYRILISNEDENI value for this PersonelKimlikNoCikisTalep.
     * 
     * @param AYRILISNEDENI
     */
    public void setAYRILISNEDENI(org.datacontract.schemas._2004._07.KBS_Model.SnfEnumPerCikisTurleri AYRILISNEDENI) {
        this.AYRILISNEDENI = AYRILISNEDENI;
    }


    /**
     * Gets the AYRILISTRH value for this PersonelKimlikNoCikisTalep.
     * 
     * @return AYRILISTRH
     */
    public java.util.Calendar getAYRILISTRH() {
        return AYRILISTRH;
    }


    /**
     * Sets the AYRILISTRH value for this PersonelKimlikNoCikisTalep.
     * 
     * @param AYRILISTRH
     */
    public void setAYRILISTRH(java.util.Calendar AYRILISTRH) {
        this.AYRILISTRH = AYRILISTRH;
    }


    /**
     * Gets the KIMLIKNO value for this PersonelKimlikNoCikisTalep.
     * 
     * @return KIMLIKNO
     */
    public java.lang.Long getKIMLIKNO() {
        return KIMLIKNO;
    }


    /**
     * Sets the KIMLIKNO value for this PersonelKimlikNoCikisTalep.
     * 
     * @param KIMLIKNO
     */
    public void setKIMLIKNO(java.lang.Long KIMLIKNO) {
        this.KIMLIKNO = KIMLIKNO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonelKimlikNoCikisTalep)) return false;
        PersonelKimlikNoCikisTalep other = (PersonelKimlikNoCikisTalep) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.AYRILISNEDENI==null && other.getAYRILISNEDENI()==null) || 
             (this.AYRILISNEDENI!=null &&
              this.AYRILISNEDENI.equals(other.getAYRILISNEDENI()))) &&
            ((this.AYRILISTRH==null && other.getAYRILISTRH()==null) || 
             (this.AYRILISTRH!=null &&
              this.AYRILISTRH.equals(other.getAYRILISTRH()))) &&
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
        if (getAYRILISNEDENI() != null) {
            _hashCode += getAYRILISNEDENI().hashCode();
        }
        if (getAYRILISTRH() != null) {
            _hashCode += getAYRILISTRH().hashCode();
        }
        if (getKIMLIKNO() != null) {
            _hashCode += getKIMLIKNO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonelKimlikNoCikisTalep.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "PersonelKimlikNoCikisTalep"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AYRILISNEDENI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "AYRILISNEDENI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Model", "snfEnum.PerCikisTurleri"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AYRILISTRH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "AYRILISTRH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KIMLIKNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Tesis_Servis", "KIMLIKNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
