# crazyMarket

# İlginç Market Simülatörü

Bu Java programı, bir marketin çalışmasını simüle etmek için tasarlanmıştır. Markette 1 adet kasa ve 2 adet kuyruk (qServer ve qLottery) bulunmaktadır. Müşterilerin hizmet alması ve kuyruklara eklenmesi aşağıdaki kurallara göre belirlenmektedir:

- qServer kuyruğunda, sıradaki müşterinin bekleme süresi Wthreshold değerinden büyük veya eşitse, kuyruğun başındaki müşteri hizmet almaktadır. Bu durumda müşteri kuyruktan çıkarılır.
- Bekleme süresi Wthreshold değerinden küçükse, müşteri qLottery kuyruğuna eklenir ve rastgele bir sayı üretilerek sıradaki müşteri bu sayı ile bu kuyruktan seçilir.

## Nasıl Çalışır?

Program, MarketSimulator sınıfı içinde tanımlanmıştır. Müşteri varış zamanları (arrival time) ve hizmet süreleri (service time) exponansiyel dağılım kullanılarak hesaplanır. Simülasyon zamanı ilerlerken iki farklı event olabilir:

- Müşteri Varışı (Customer Arrival): Yeni bir müşteri markete gelir ve kuyruğa eklenir.
- Müşteri Hizmeti ve Çıkışı (Customer Departure): Kuyruğun başındaki müşteri hizmet alır ve kasadan çıkar.

## Kurulum

1. Java JDK'nın yüklü olduğundan emin olun.
2. Projeyi bilgisayarınıza indirin veya klonlayın.
3. Proje klasörüne gidin ve terminali açın.
4. Aşağıdaki komutu çalıştırın:

## Gereksinimler

- Java JDK 8 veya üzeri
- Java IDE (isteğe bağlı)

