# Shopping

![](/images/project_structure.png)

Bu proje microservice yapısıyla oluşturulmuş e-ticaret projesinin alış-veriş kısmıdır.
[Diğer iki proje](#i̇lişkili-diğer-projeler) ile birlikte kullanılır.

## Veri tabanı yapısı
![](/images/db_structure.png)

## Kurulum

Bu projeyi bilgisayarınızda çalıştırmak için `java-11` in bilgisayarınızda kurulu olması gereklidir.

Aşağıdaki komutla kodları indirip derleyiciniz ile açabilirsiniz.

```git
git clone https://github.com/MustafaCelal/commerce.git
```
> Değiştirilmediği sürece "8080" portunda çalışır. Bağlantılı "Shopping" projesi ile "8082" portundan, "Inventory" projesi ile "8081" portundan iletişim kurar.

---
[Postman Collection](https://github.com/MustafaCelal/commerce/blob/main/Commerce.postman_collection.json) bu dosyayı indirerek postman'de import ederek resimlerde gördüğünüz isteklerin olduğu postman collection'ını kullanabilirsiniz.

---
<details open>
<summary>ekran görüntüleri </summary>

### Kategoriler listelendi
![bütün kategoriler](/images/kategoriler%20listelendi.png)

### 3 id'li kategori
![3 id'li kategori](/images/3%20id'li%20kategori%20g%C3%B6sterildi.png)

### 6 id'li ürün
![6 id'li ürün](/images/6%20id'li%20%C3%BCr%C3%BCn%20g%C3%B6sterildi.png)

### 3 kategorisindeki ürünler
![3 kategorisindeki ürünler](/images/kategori%20id'si%203%20olan%20%C3%BCr%C3%BCnler%20listelendi.png)

### Yeni sepet oluşturuldu
![yeni sepet oluşturuldu](/images/Sepet%20olu%C5%9Fturuldu.png)

### Sepete ürün eklendi
![sepete ürün eklendi](/images/Sepete%20%C3%BCr%C3%BCn%20eklendi.png)

### Sepetten ürün silindi
![Sepetten ürün silindi](/images/Sepetten%20%C3%BCr%C3%BCn%20silindi.png)

### Sepet durumu değiştirildi
![Sepet durumu değiştirildi](/images/sepetin%20durumu%20de%C4%9Fi%C5%9Ftirildi.png)

</details>

---
## İlişkili diğer Projeler

[Inventory](https://github.com/MustafaCelal/inventory)

[Shopping](https://github.com/MustafaCelal/Shopping)
