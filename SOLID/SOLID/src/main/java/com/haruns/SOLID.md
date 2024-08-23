# SOLID 

## UNCLE BOB : ROBERT MARTIN
Kötü Tasarım : 
* Katılık : Sistemde değişiklik yapmakta zorlanıyorsanız bunun sebebi yazılım tasarımınızın katı olmasıdır.
* Kırılganlık : Sistemde meydana gelen bir hatayı ortadan kaldırırken başka bir yerden hatalar ortaya çıkmasıdır.
* Taşınmazlık : Bir yapıyı tekraren başka yerlerde kullanmakta zorlanıyorsanız, tasarım hatalıdır.

### SOLID nedir ?
* Kötü tasarımlardan kaçınmak için öne sürülen yöntemler.
* Hedef : Tasarımın esnek, anlaşılır ve yönetilebilir olmasının sağlamaktır.


* S - Single Responsibility Principle (SRP) 
* O - Open-Closed Principle (OCP)
* L - Liskov Substition Principle (LSP)
* I - Interface Segregation Principle (ISP)
* D - Dependency Inversion Principle (DIP)

# S - Single Responsibility Principle (SRP) 
* Tek sorumluluk ilkesi. Oluşturduğunuz yapılar (metod-sınıf-interface-enum) tek bir görevi yerine getirmeli.
* Belli bir işi yapmalı.
* Bu tür yapılarda bir değişime gitmek için yalnızca bir sebep olmalı.
* İsviçre çakısını biz sevmiyoruz!
* Giant Hulk gibi sınıflar istemiyoruz!

# O - Open-Closed Principle (OCP)
* Projeye ait tüm yapıların gelişime AÇIK, değişime KAPALI olmasıdır.
* Yazılan kodların kendisinde değişiklik yapmadan yeni eklemeler yapılabilmesidir.
* Kodunun değişim gerektirmeyecek şekilde yapılandırmasını sağlamalısın.

# L - Liskov Substition Principle (LSP)
* Barbara Liskov
* Alt sınıftan oluşturulan nesneler, üst sınıfın nesnesi ile yer değiştirdiğinde aynı davranışı sergileyebilmeli.
* Türetilen sınıf, türeyen sınıfın tüm özelliklerini kullanabilmeli.
* Kullanılmaması gereken durumlar var ise onları ayrıştırmalısın.

# I - Interface Segregation Principle (ISP)
* Nesnenin ihtiyacı olmayan metotları interface'den çıkarın. Ayırın.
* Bir interface'de gereğinden fazla metot olmamalı.
* Böyle bir durumda interface'lere bölmek gerekli.

# D - Dependency Inversion Principle (DIP)
Bağımlılıkların Tersine Çevrilmesi
* Yüksek seviye sınıflar, düşük seviye sınıflara bağımlı olmamalı.
* Her ikisi de soyut kavramlara(interfacelere, abstract classlara) bağlı olmalıdır.