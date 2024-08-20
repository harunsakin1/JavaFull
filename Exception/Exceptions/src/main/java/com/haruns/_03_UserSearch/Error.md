# UYGULAMA İÇİ HATA YÖNETİMİ

## Hata türleri ve numaralandırma

```
    X X X X -> Hata kodu
    | | | | 
    | | | + -> Uygulama içi hata detay kodu
    | | + ---> Hata türü
    | + -----> Hata kaynağı class, microservice adı
    + -------> Hata kod numarası
```

### UserSearch Birimi Hataları
    1 0 0 0 -> UserSearch Hata Kodu
    1 0 0 1 ->UserSearch Kullanıcı bulunamadı hatası