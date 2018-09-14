package servletcontroller;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class firstservlet implements Servlet{
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("初始sss化hbiusssss");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        ServletOutputStream os = servletResponse.getOutputStream();
        FileInputStream fis = new FileInputStream(new File("D:\\aaadevelopment_tool\\IDEA\\workspace\\fruitshome\\web\\hello.html"));
        byte[] b = new byte[1024];
        int len ;
        while ((len = fis.read(b))!=-1){
            os.write(b,0,len);
        }
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
