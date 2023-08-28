/**
 * SnfEnumServisUstKodParametreler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.KBS_Model;

public class SnfEnumServisUstKodParametreler implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SnfEnumServisUstKodParametreler(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _TANIMSIZ = "TANIMSIZ";
    public static final java.lang.String _ULKELER = "ULKELER";
    public static final java.lang.String _CINSIYET = "CINSIYET";
    public static final java.lang.String _MEDENIHAL = "MEDENIHAL";
    public static final java.lang.String _KULLANICIYETKITIPLERI = "KULLANICIYETKITIPLERI";
    public static final java.lang.String _SAHISTIPI = "SAHISTIPI";
    public static final java.lang.String _PERSONELCIKISTURU = "PERSONELCIKISTURU";
    public static final java.lang.String _KONAKLAYANCIKISTURU = "KONAKLAYANCIKISTURU";
    public static final java.lang.String _MADDE7KAPSAMINDACIKISTURU = "MADDE7KAPSAMINDACIKISTURU";
    public static final java.lang.String _BILDIRIMZORUNLULUGUTURU = "BILDIRIMZORUNLULUGUTURU";
    public static final java.lang.String _KONAKLAYANKULLANIMSEKLI = "KONAKLAYANKULLANIMSEKLI";
    public static final java.lang.String _TESISILGILIMADDETIPI = "TESISILGILIMADDETIPI";
    public static final java.lang.String _MADDE2KAPSAMINDAKIPERSONELTURU = "MADDE2KAPSAMINDAKIPERSONELTURU";
    public static final java.lang.String _MADDE6KAPSAMINDAKIPERSONELTURU = "MADDE6KAPSAMINDAKIPERSONELTURU";
    public static final java.lang.String _MADDE7KAPSAMINDAKIPERSONELTURU = "MADDE7KAPSAMINDAKIPERSONELTURU";
    public static final java.lang.String _BELGETURLERI = "BELGETURLERI";
    public static final SnfEnumServisUstKodParametreler TANIMSIZ = new SnfEnumServisUstKodParametreler(_TANIMSIZ);
    public static final SnfEnumServisUstKodParametreler ULKELER = new SnfEnumServisUstKodParametreler(_ULKELER);
    public static final SnfEnumServisUstKodParametreler CINSIYET = new SnfEnumServisUstKodParametreler(_CINSIYET);
    public static final SnfEnumServisUstKodParametreler MEDENIHAL = new SnfEnumServisUstKodParametreler(_MEDENIHAL);
    public static final SnfEnumServisUstKodParametreler KULLANICIYETKITIPLERI = new SnfEnumServisUstKodParametreler(_KULLANICIYETKITIPLERI);
    public static final SnfEnumServisUstKodParametreler SAHISTIPI = new SnfEnumServisUstKodParametreler(_SAHISTIPI);
    public static final SnfEnumServisUstKodParametreler PERSONELCIKISTURU = new SnfEnumServisUstKodParametreler(_PERSONELCIKISTURU);
    public static final SnfEnumServisUstKodParametreler KONAKLAYANCIKISTURU = new SnfEnumServisUstKodParametreler(_KONAKLAYANCIKISTURU);
    public static final SnfEnumServisUstKodParametreler MADDE7KAPSAMINDACIKISTURU = new SnfEnumServisUstKodParametreler(_MADDE7KAPSAMINDACIKISTURU);
    public static final SnfEnumServisUstKodParametreler BILDIRIMZORUNLULUGUTURU = new SnfEnumServisUstKodParametreler(_BILDIRIMZORUNLULUGUTURU);
    public static final SnfEnumServisUstKodParametreler KONAKLAYANKULLANIMSEKLI = new SnfEnumServisUstKodParametreler(_KONAKLAYANKULLANIMSEKLI);
    public static final SnfEnumServisUstKodParametreler TESISILGILIMADDETIPI = new SnfEnumServisUstKodParametreler(_TESISILGILIMADDETIPI);
    public static final SnfEnumServisUstKodParametreler MADDE2KAPSAMINDAKIPERSONELTURU = new SnfEnumServisUstKodParametreler(_MADDE2KAPSAMINDAKIPERSONELTURU);
    public static final SnfEnumServisUstKodParametreler MADDE6KAPSAMINDAKIPERSONELTURU = new SnfEnumServisUstKodParametreler(_MADDE6KAPSAMINDAKIPERSONELTURU);
    public static final SnfEnumServisUstKodParametreler MADDE7KAPSAMINDAKIPERSONELTURU = new SnfEnumServisUstKodParametreler(_MADDE7KAPSAMINDAKIPERSONELTURU);
    public static final SnfEnumServisUstKodParametreler BELGETURLERI = new SnfEnumServisUstKodParametreler(_BELGETURLERI);
    public java.lang.String getValue() { return _value_;}
    public static SnfEnumServisUstKodParametreler fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SnfEnumServisUstKodParametreler enumeration = (SnfEnumServisUstKodParametreler)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SnfEnumServisUstKodParametreler fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SnfEnumServisUstKodParametreler.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/KBS_Model", "snfEnum.ServisUstKodParametreler"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
