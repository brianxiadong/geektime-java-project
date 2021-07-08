package com.brianxia.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * @author brianxia
 * @version 1.0
 * @date 2021/7/7 16:39
 */
@WebServlet(urlPatterns = "/test")
public class MyServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        print(resp.getWriter(),"abc");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("test2");
        requestDispatcher.forward(req,resp);
    }

    private void print(Writer writer,Object message) throws IOException {
        writer.write(String.format("线程ID-ThreadId: %s,%s ",Thread.currentThread().getName(),message ));
    }
}
