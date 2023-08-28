package org.tempuri;

public class ISrvShsYtkTmlProxy implements org.tempuri.ISrvShsYtkTml {
  private String _endpoint = null;
  private org.tempuri.ISrvShsYtkTml ıSrvShsYtkTml = null;
  
  public ISrvShsYtkTmlProxy() {
    _initISrvShsYtkTmlProxy();
  }
  
  public ISrvShsYtkTmlProxy(String endpoint) {
    _endpoint = endpoint;
    _initISrvShsYtkTmlProxy();
  }
  
  private void _initISrvShsYtkTmlProxy() {
    try {
      ıSrvShsYtkTml = (new org.tempuri.SrvShsYtkTmlLocator()).getBasicHttpsBinding_KBSServis();
      if (ıSrvShsYtkTml != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ıSrvShsYtkTml)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ıSrvShsYtkTml)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ıSrvShsYtkTml != null)
      ((javax.xml.rpc.Stub)ıSrvShsYtkTml)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.ISrvShsYtkTml getISrvShsYtkTml() {
    if (ıSrvShsYtkTml == null)
      _initISrvShsYtkTmlProxy();
    return ıSrvShsYtkTml;
  }
  
  public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.MusteriKimlikNoGirisSonuc musteriKimlikNoGiris(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Tesis_Servis.MusteriKimlikNoGirisTalep musteri) throws java.rmi.RemoteException{
    if (ıSrvShsYtkTml == null)
      _initISrvShsYtkTmlProxy();
    return ıSrvShsYtkTml.musteriKimlikNoGiris(kullaniciTC, tssKod, sifre, musteri);
  }
  
  public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc musteriKimlikNoCikis(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Tesis_Servis.MusteriKimlikNoCikisTalep musteri) throws java.rmi.RemoteException{
    if (ıSrvShsYtkTml == null)
      _initISrvShsYtkTmlProxy();
    return ıSrvShsYtkTml.musteriKimlikNoCikis(kullaniciTC, tssKod, sifre, musteri);
  }
  
  public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc musteriKimlikNoGuncelle(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Tesis_Servis.MusteriKimlikNoGuncelleTalep musteri) throws java.rmi.RemoteException{
    if (ıSrvShsYtkTml == null)
      _initISrvShsYtkTmlProxy();
    return ıSrvShsYtkTml.musteriKimlikNoGuncelle(kullaniciTC, tssKod, sifre, musteri);
  }
  
  public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.MusteriKimlikNoListe musteriKimlikNoListele(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre) throws java.rmi.RemoteException{
    if (ıSrvShsYtkTml == null)
      _initISrvShsYtkTmlProxy();
    return ıSrvShsYtkTml.musteriKimlikNoListele(kullaniciTC, tssKod, sifre);
  }
  
  public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.MusteriYabanciGirisSonuc musteriYabanciGiris(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Tesis_Servis.MusteriYabanciGirisTalep musteri) throws java.rmi.RemoteException{
    if (ıSrvShsYtkTml == null)
      _initISrvShsYtkTmlProxy();
    return ıSrvShsYtkTml.musteriYabanciGiris(kullaniciTC, tssKod, sifre, musteri);
  }
  
  public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc musteriYabanciCikis(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Tesis_Servis.MusteriYabanciCikisTalep musteri) throws java.rmi.RemoteException{
    if (ıSrvShsYtkTml == null)
      _initISrvShsYtkTmlProxy();
    return ıSrvShsYtkTml.musteriYabanciCikis(kullaniciTC, tssKod, sifre, musteri);
  }
  
  public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc musteriYabanciGuncelle(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Tesis_Servis.MusteriYabanciGuncelleTalep musteri) throws java.rmi.RemoteException{
    if (ıSrvShsYtkTml == null)
      _initISrvShsYtkTmlProxy();
    return ıSrvShsYtkTml.musteriYabanciGuncelle(kullaniciTC, tssKod, sifre, musteri);
  }
  
  public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.MusteriYabanciListe musteriYabanciListele(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre) throws java.rmi.RemoteException{
    if (ıSrvShsYtkTml == null)
      _initISrvShsYtkTmlProxy();
    return ıSrvShsYtkTml.musteriYabanciListele(kullaniciTC, tssKod, sifre);
  }
  
  public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.PersonelKimlikNoGirisSonuc personelKimlikNoGiris(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Tesis_Servis.PersonelKimlikNoGirisTalep personel) throws java.rmi.RemoteException{
    if (ıSrvShsYtkTml == null)
      _initISrvShsYtkTmlProxy();
    return ıSrvShsYtkTml.personelKimlikNoGiris(kullaniciTC, tssKod, sifre, personel);
  }
  
  public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc personelKimlikNoCikis(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Tesis_Servis.PersonelKimlikNoCikisTalep personel) throws java.rmi.RemoteException{
    if (ıSrvShsYtkTml == null)
      _initISrvShsYtkTmlProxy();
    return ıSrvShsYtkTml.personelKimlikNoCikis(kullaniciTC, tssKod, sifre, personel);
  }
  
  public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc personelKimlikNoGuncelle(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Tesis_Servis.PersonelKimlikNoGuncelleTalep personel) throws java.rmi.RemoteException{
    if (ıSrvShsYtkTml == null)
      _initISrvShsYtkTmlProxy();
    return ıSrvShsYtkTml.personelKimlikNoGuncelle(kullaniciTC, tssKod, sifre, personel);
  }
  
  public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.PersonelKimlikNoListe personelKimlikNoListele(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre) throws java.rmi.RemoteException{
    if (ıSrvShsYtkTml == null)
      _initISrvShsYtkTmlProxy();
    return ıSrvShsYtkTml.personelKimlikNoListele(kullaniciTC, tssKod, sifre);
  }
  
  public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.PersonelYabanciGirisSonuc personelYabanciGiris(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Tesis_Servis.PersonelYabanciGirisTalep personel) throws java.rmi.RemoteException{
    if (ıSrvShsYtkTml == null)
      _initISrvShsYtkTmlProxy();
    return ıSrvShsYtkTml.personelYabanciGiris(kullaniciTC, tssKod, sifre, personel);
  }
  
  public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc personelYabanciCikis(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Tesis_Servis.PersonelYabanciCikisTalep personel) throws java.rmi.RemoteException{
    if (ıSrvShsYtkTml == null)
      _initISrvShsYtkTmlProxy();
    return ıSrvShsYtkTml.personelYabanciCikis(kullaniciTC, tssKod, sifre, personel);
  }
  
  public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Sonuc personelYabanciGuncelle(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Tesis_Servis.PersonelYabanciGuncelleTalep personel) throws java.rmi.RemoteException{
    if (ıSrvShsYtkTml == null)
      _initISrvShsYtkTmlProxy();
    return ıSrvShsYtkTml.personelYabanciGuncelle(kullaniciTC, tssKod, sifre, personel);
  }
  
  public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.PersonelYabanciListe personelYabanciListele(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre) throws java.rmi.RemoteException{
    if (ıSrvShsYtkTml == null)
      _initISrvShsYtkTmlProxy();
    return ıSrvShsYtkTml.personelYabanciListele(kullaniciTC, tssKod, sifre);
  }
  
  public org.datacontract.schemas._2004._07.KBS_Tesis_Servis.Parametreler parametreListele(java.lang.Long kullaniciTC, java.lang.Long tssKod, java.lang.String sifre, org.datacontract.schemas._2004._07.KBS_Model.SnfEnumServisUstKodParametreler parametreTuru) throws java.rmi.RemoteException{
    if (ıSrvShsYtkTml == null)
      _initISrvShsYtkTmlProxy();
    return ıSrvShsYtkTml.parametreListele(kullaniciTC, tssKod, sifre, parametreTuru);
  }
  
  
}