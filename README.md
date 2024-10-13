# MaceraOyunu
Oyunu kazanmak için savaş bölgelerinde bulunan canavarları yok ederek ödül eşyalarını (yemek, su ve odun) kazanmak. Eşyalara sahip olan oyunu kazanır.

OYUN KARAKTERLERİ
-----------------
ID	İSİM	SAĞLIK	HASAR	PARA
1	Samuray	18	    4	    15
2	Okçu	15	    5	    20
3	Şövalye	20	    4	    10

SİLAHLAR
-----------------
ID	İSİM	HASAR	ÜCRET
1	Tabanca	2    	25
2	Kılıç	3	    35
3	Tüfek	7    	45

ARMORLAR
-----------------
ID	İSİM	KORUMA	ÜCRET
1	Light	1    	15
2	Medium	3	    25
3	Heavy	5    	40

CANAVARLAR
-----------------
ID	İSİM	SAĞLIK	HASAR	ÖDÜL PARA
1	Zombi	12        4        3
2	Vampir	14        7        7
3   Ayı     25        9        12


MEKANLAR
-----------------
*Güvenli Ev
    Özellik : Can Yenileniyor
*Mağara
    Canavar : Zombi (Random 1-3 Adet)
    Özellik : Savaş + Ganimet
    Eşya : Yemek (Food)
*Orman
    Canavar : Vampir (Random 1-3 Adet)
    Özellik : Savaş + Ganimet
    Eşya : Odun (Firewood)
*Nehir
    Canavar : Ayı (Random 1-3 Adet)
    Özellik : Savaş + Ganimet
    Eşya : Su (Water)
*Mağaza
    Özellik : Destekleyici Eşyalar Satın Almak
    Silah : Tabanca,Kılıç,Tüfek
    Zırh : Hafif,Orta,Ağır
