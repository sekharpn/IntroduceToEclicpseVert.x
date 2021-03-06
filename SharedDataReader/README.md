# Shared Data Reader

This example shows the use of `Shared Data` via `Asynchronous Shared Maps` in Vert.x. The data generated by the `Shared Data Provider` app is read every second.
                                                 
```java
   SharedData sharedData = vertx.sharedData();
           sharedData.<String, StockExchange>getAsyncMap(DEFAULT_ASYNC_MAP_NAME, res -> {
               if (res.succeeded()) {
                   AsyncMap<String, StockExchange> stockExchangeAsyncMap = res.result();
                   stockExchangeAsyncMap.get(DEFAULT_ASYNC_MAP_KEY, asyncDataResult -> {
                       stockExchange = asyncDataResult.result();
                       log.debug("Stock Exchange object is {} ", Json.encodePrettily(stockExchange));
                   });
               } else {
                   log.debug("Something went wrong when access to shared map!");
               }
           });
```

## Requirements
* JDK 8 or later
* Maven 3.0.0 or later

## To compile
```bash
mvn clean install
```

## To run
```bash
java -jar target/asyncReaderVerticle.jar -cluster
```

Or

```bash
sh run.sh
```

![](images/reader.png)

## Relevant article is
[How to Share Data Between Threads in Vert.x](https://medium.com/@hakdogan/how-to-share-data-between-threads-in-vert-x-afdf26dcc684)
