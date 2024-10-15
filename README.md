# MaceraOyunu

MaceraOyunu, savaş bölgelerinde bulunan canavarları yok ederek ödül eşyaları (yemek, su ve odun) kazanmayı amaçlayan bir strateji oyunudur. Eşyalara sahip olan oyuncu oyunu kazanır.

## Oyun Karakterleri

| ID | İsim     | Sağlık | Hasar | Para |
|----|----------|--------|-------|------|
| 1  | Samuray  | 18     | 4     | 15   |
| 2  | Okçu     | 15     | 5     | 20   |
| 3  | Şövalye  | 20     | 4     | 10   |

## Silahlar

| ID | İsim      | Hasar | Ücret |
|----|-----------|-------|-------|
| 1  | Tabanca   | 2     | 25    |
| 2  | Kılıç     | 3     | 35    |
| 3  | Tüfek     | 7     | 45    |

## Zırhlar

| ID | İsim    | Koruma | Ücret |
|----|---------|--------|-------|
| 1  | Hafif   | 1      | 15    |
| 2  | Orta    | 3      | 25    |
| 3  | Ağır    | 5      | 40    |

## Canavarlar

| ID | İsim    | Sağlık | Hasar | Ödül Para |
|----|---------|--------|-------|-----------|
| 1  | Zombi   | 12     | 4     | 3         |
| 2  | Vampir  | 14     | 7     | 7         |
| 3  | Ayı     | 25     | 9     | 12        |

## Mekanlar

- **Güvenli Ev**
  - Özellik: Can Yenileniyor

- **Mağara**
  - Canavar: Zombi (Random 1-3 Adet)
  - Özellik: Savaş + Ganimet
  - Eşya: Yemek (Food)

- **Orman**
  - Canavar: Vampir (Random 1-3 Adet)
  - Özellik: Savaş + Ganimet
  - Eşya: Odun (Firewood)

- **Nehir**
  - Canavar: Ayı (Random 1-3 Adet)
  - Özellik: Savaş + Ganimet
  - Eşya: Su (Water)

- **Mağaza**
  - Özellik: Destekleyici Eşyalar Satın Almak
  - Silahlar: Tabanca, Kılıç, Tüfek
  - Zırhlar: Hafif, Orta, Ağır
