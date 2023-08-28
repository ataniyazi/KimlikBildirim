package com.test;

import java.rmi.RemoteException;
import java.util.Calendar;

import org.datacontract.schemas._2004._07.KBS_Model.SnfEnumKonaklayanKullanimSekli;
import org.datacontract.schemas._2004._07.KBS_Tesis_Servis.MusteriKimlikNoGirisSonuc;
import org.datacontract.schemas._2004._07.KBS_Tesis_Servis.MusteriKimlikNoGirisTalep;
import org.tempuri.ISrvShsYtkTmlProxy;

public class Test {

	public static void main(String[] args) {

		ISrvShsYtkTmlProxy proxy = new ISrvShsYtkTmlProxy();
		
		MusteriKimlikNoGirisTalep talep = new MusteriKimlikNoGirisTalep();
		talep.setKIMLIKNO(12565501960l);
		talep.setODANO("1");
		
		Calendar cal = Calendar.getInstance();
		cal.set(2023, 8 - 1, 17, 0, 0);
		talep.setGRSTRH(cal);
		talep.setKULLANIMSEKLI(SnfEnumKonaklayanKullanimSekli.KONAKLAMA);
		talep.setILERITARIHLI(false);
		
		
		try {
			MusteriKimlikNoGirisSonuc sonuc =  proxy.musteriKimlikNoGiris(10141299300l, 203537l, "at1514ta", talep);
			System.out.println(sonuc);
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}

}
