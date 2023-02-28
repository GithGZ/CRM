import com.alibaba.fastjson.JSON;
import domain.People;

public class test {
    public static void main(String[] args) {
        People p = new People("zhangsan","666");
        String str = JSON.toJSONString(p);
        System.out.println(str);
    }
}
