import com.alibaba.fastjson.JSON;
import domain.People;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/MyServlet01")
public class MyServlet01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        People p = new People("zhangsan","666");
        String str = JSON.toJSONString(p);
        // {"str1":"aaa","str2":"bbb"}
        String str1 = "{\"str1\":\"aaa\",\"str2\":\"bbb\"}";
        response.getWriter().print(str1);
    }
}