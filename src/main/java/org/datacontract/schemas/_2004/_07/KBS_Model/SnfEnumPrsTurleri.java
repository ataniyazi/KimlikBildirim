/**
 * SnfEnumPrsTurleri.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.KBS_Model;

public class SnfEnumPrsTurleri implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SnfEnumPrsTurleri(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TANIMSIZ = "TANIMSIZ";
    public static final java.lang.String _MDD2_TSSSAHIBI = "MDD2_TSSSAHIBI";
    public static final java.lang.String _MDD2_SUREKLIPER = "MDD2_SUREKLIPER";
    public static final java.lang.String _MDD2_DENEMEPER = "MDD2_DENEMEPER";
    public static final java.lang.String _MDD2_KONSINYEPER = "MDD2_KONSINYEPER";
    public static final java.lang.String _MDD2_AILEUYE = "MDD2_AILEUYE";
    public static final java.lang.String _MDD2_ISBASDEVEDENPER = "MDD2_ISBASDEVEDENPER";
    public static final java.lang.String _MDD6_TSSSAHIBI = "MDD6_TSSSAHIBI";
    public static final java.lang.String _MDD6_SUREKLIPER = "MDD6_SUREKLIPER";
    public static final java.lang.String _MDD6_DENEMEPER = "MDD6_DENEMEPER";
    public static final java.lang.String _MDD6_ISBASDEVEDENPER = "MDD6_ISBASDEVEDENPER";
    public static final java.lang.String _MDD6_AILEUYE = "MDD6_AILEUYE";
    public static final java.lang.String _MDD7_TRMARACI = "MDD7_TRMARACI";
    public static final java.lang.String _MDD7_MEVTRMISCI = "MDD7_MEVTRMISCI";
    public static final java.lang.String _MDD7_MEVTRMISCIAILESI = "MDD7_MEVTRMISCIAILESI";
    public static final java.lang.String _MDD7_ARICI = "MDD7_ARICI";
    public static final java.lang.String _MDD7_YAYLAKCI = "MDD7_YAYLAKCI";
    public static final java.lang.String _MDD7_OTLAKCI = "MDD7_OTLAKCI";
    public static final java.lang.String _MDD7_GOCER = "MDD7_GOCER";
    public static final SnfEnumPrsTurleri TANIMSIZ = new SnfEnumPrsTurleri(_TANIMSIZ);
    public static final SnfEnumPrsTurleri MDD2_TSSSAHIBI = new SnfEnumPrsTurleri(_MDD2_TSSSAHIBI);
    public static final SnfEnumPrsTurleri MDD2_SUREKLIPER = new SnfEnumPrsTurleri(_MDD2_SUREKLIPER);
    public static final SnfEnumPrsTurleri MDD2_DENEMEPER = new SnfEnumPrsTurleri(_MDD2_DENEMEPER);
    public static final SnfEnumPrsTurleri MDD2_KONSINYEPER = new SnfEnumPrsTurleri(_MDD2_KONSINYEPER);
    public static final SnfEnumPrsTurleri MDD2_AILEUYE = new SnfEnumPrsTurleri(_MDD2_AILEUYE);
    public static final SnfEnumPrsTurleri MDD2_ISBASDEVEDENPER = new SnfEnumPrsTurleri(_MDD2_ISBASDEVEDENPER);
    public static final SnfEnumPrsTurleri MDD6_TSSSAHIBI = new SnfEnumPrsTurleri(_MDD6_TSSSAHIBI);
    public static final SnfEnumPrsTurleri MDD6_SUREKLIPER = new SnfEnumPrsTurleri(_MDD6_SUREKLIPER);
    public static final SnfEnumPrsTurleri MDD6_DENEMEPER = new SnfEnumPrsTurleri(_MDD6_DENEMEPER);
    public static final SnfEnumPrsTurleri MDD6_ISBASDEVEDENPER = new SnfEnumPrsTurleri(_MDD6_ISBASDEVEDENPER);
    public static final SnfEnumPrsTurleri MDD6_AILEUYE = new SnfEnumPrsTurleri(_MDD6_AILEUYE);
    public static final SnfEnumPrsTurleri MDD7_TRMARACI = new SnfEnumPrsTurleri(_MDD7_TRMARACI);
    public static final SnfEnumPrsTurleri MDD7_MEVTRMISCI = new SnfEnumPrsTurleri(_MDD7_MEVTRMISCI);
    public static final SnfEnumPrsTurleri MDD7_MEVTRMISCIAILESI = new SnfEnumPrsTurleri(_MDD7_MEVTRMISCIAILESI);
    public static final SnfEnumPrsTurleri MDD7_ARICI = new SnfEnumPrsTurleri(_MDD7_ARICI);
    public static final SnfEnumPrsTurleri MDD7_YAYLAKCI = new SnfEnumPrsTurleri(_MDD7_YAYLAKCI);
    public static final SnfEnumPrsTurleri MDD7_OTLAKCI = new SnfEnumPrsTurleri(_MDD7_OTLAKCI);
    public static final SnfEnumPrsTurleri MDD7_GOCER = new SnfEnumPrsTurleri(_MDD7_GOCER);
    public java.lang.String getValue() { return _value_;}
    public static SnfEnumPrsTurleri fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SnfEnumPrsTurleri enumeration = (SnfEnumPrsTurleri)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SnfEnumPrsTurleri fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SnfEnumPrsTurleri.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Model", "snfEnum.PrsTurleri"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
