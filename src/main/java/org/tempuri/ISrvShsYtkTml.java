/**
 * ISrvShsYtkTml.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface ISrvShsYtkTml extends java.rmi.Remote {
    public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.MusteriKimlikNoGirisSonuc musteriKimlikNoGiris(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Tesis_Servis.MusteriKimlikNoGirisTalep musteri) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc musteriKimlikNoCikis(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Tesis_Servis.MusteriKimlikNoCikisTalep musteri) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc musteriKimlikNoGuncelle(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Tesis_Servis.MusteriKimlikNoGuncelleTalep musteri) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.MusteriKimlikNoListe musteriKimlikNoListele(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.MusteriYabanciGirisSonuc musteriYabanciGiris(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Tesis_Servis.MusteriYabanciGirisTalep musteri) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc musteriYabanciCikis(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Tesis_Servis.MusteriYabanciCikisTalep musteri) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc musteriYabanciGuncelle(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Tesis_Servis.MusteriYabanciGuncelleTalep musteri) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.MusteriYabanciListe musteriYabanciListele(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.PersonelKimlikNoGirisSonuc personelKimlikNoGiris(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Tesis_Servis.PersonelKimlikNoGirisTalep personel) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc personelKimlikNoCikis(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Tesis_Servis.PersonelKimlikNoCikisTalep personel) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc personelKimlikNoGuncelle(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Tesis_Servis.PersonelKimlikNoGuncelleTalep personel) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.PersonelKimlikNoListe personelKimlikNoListele(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.PersonelYabanciGirisSonuc personelYabanciGiris(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Tesis_Servis.PersonelYabanciGirisTalep personel) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc personelYabanciCikis(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Tesis_Servis.PersonelYabanciCikisTalep personel) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc personelYabanciGuncelle(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Tesis_Servis.PersonelYabanciGuncelleTalep personel) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.PersonelYabanciListe personelYabanciListele(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Parametreler parametreListele(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Model.SnfEnumServisUstKodParametreler parametreTuru) throws java.rmi.RemoteException;
}
