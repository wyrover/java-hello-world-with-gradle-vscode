package hello;

import org.joda.time.LocalTime;
import com.hankcs.hanlp.HanLP;
import java.nio.charset.Charset;
import java.io.UnsupportedEncodingException;


public class HelloWorld
{
    public static void main(String[] args)
    {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
        System.out.println("file.encoding=" + System.getProperty("file.encoding"));
        System.out.println("Charset.defaultCharset=" + Charset.defaultCharset());
        String s = "中文";

        try {
            System.out.println("GBK:" + new String(s.getBytes(), "GBK"));
            System.out.println("UTF-8:" + new String(s.getBytes(), "UTF-8"));
            System.out.println("ISO8859-1:" + new String(s.getBytes(), "ISO-8859-1"));
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.getProperties().list(System.out);
        System.out.println("中文测试");
        System.out.println(HanLP.segment("你好，欢迎使用HanLP汉语处理包！"));
    }



}
