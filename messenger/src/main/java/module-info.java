/**
 * @author hakdogan (hakdogan@kodcu.com)
 * Created on 13.05.2020
 **/
module messenger
{
    requires vertx.core;
    requires vertx.web;
    requires helper;
    exports com.kodcu.nonclustered.messenger.verticle to vertx.core;
}