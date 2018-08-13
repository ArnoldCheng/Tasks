import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.MemcachedClientBuilder;
import net.rubyeye.xmemcached.XMemcachedClientBuilder;
import net.rubyeye.xmemcached.exception.MemcachedException;
import net.rubyeye.xmemcached.utils.AddrUtil;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class TestMemcachded {

    public static void main(String[] args) {
        MemcachedClientBuilder builder =
                new XMemcachedClientBuilder(AddrUtil.getAddresses("localhost:11211"));
        MemcachedClient memcachedClient = null;
        try {
            memcachedClient = builder.build();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            memcachedClient.add("hello",1,"hi", 8) ;
            String value = (String) memcachedClient.get("hello");
            System.out.println("hello1=" + value);
            // 第一个参数：key。第二个参数：单位是秒，意思是存储时间，0为永久
            // 第三个参数：value
            memcachedClient.set("hello", 5, "Hello,xmemcached");

            value = (String) memcachedClient.get("hello");
            System.out.println("hello2=" + value);

            //等待6秒后存储失效
            //Thread.sleep(6*1000);
            //memcachedClient.delete("hello");
            memcachedClient.flushAll();
            memcachedClient.replace("hello",2,"world!") ;
            memcachedClient.append("hello","???????") ;
            memcachedClient.prepend("hello","*****") ;
            value = (String) memcachedClient.get("hello");
            System.out.println("hello3=" + value);

        } catch (MemcachedException e) {
            System.err.println("MemcachedClientoperation fail");
            e.printStackTrace();
        } catch (TimeoutException e) {
            System.err.println("MemcachedClientoperation timeout");
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.err.println("MemcachedClientoperation Interrupted");
            e.printStackTrace();
        }
        try {
            memcachedClient.shutdown();
        } catch (IOException e) {
            System.err.println("ShutdownMemcachedClient fail");
            e.printStackTrace();
        }

    }
}
