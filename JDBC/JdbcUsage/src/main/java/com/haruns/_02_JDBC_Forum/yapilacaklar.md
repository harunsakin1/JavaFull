*************
Java15 Forum
*************
1-Register
2-Log in
3-Çıkış

Database adı : Java15ForumDB
Tablo Adı : User
1. entity package içinde User(id,ad,soyad,username(Unique),pw) adında bir class açalım.
2. register işlemi sırasında username'in daha önce alınıp alınmadığı kontrol edilmeli.
3. Adınızı Giriniz : 
4. Soyadınızı Giriniz : 
5. Username Giriniz : 
6. Password Giriniz : 
7. UserRepository hazırlanmalı. Temel CRUD işlemleri olmalı. Extra olarak : 
   - boolean existByUserName (String username)
   - Optional<User> doLogin (String username, String password)

Giriş Yap:
    - Username giriniz : 
    - Password giriniz : 
    - Eğer giriş bilgileri doğru ise o zaman başka bir ekrana geçiş yapılır.

MainController

*************
Hoşgeldin, ad, soyad
*************
1-Postları görüntüle
2-Post Paylaş
3-Kendi postlarını görüntüle
4-Kullanıcıları listele
0-Logout

Yapılacaklar:
Entity kısmında Post(id,user_id,baslik,icerik,paylasimTarihi)
PostRepository(Crud işlemleri-findAll,save,)