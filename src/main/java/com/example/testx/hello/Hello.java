package com.example.testx.hello;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.script.ScriptContext;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@RestController
public class Hello {

    @RequestMapping("/")
    public String hello() throws IOException {
        String text = "Hello world";
//
//        HttpServletResponse response = null;
//        PrintWriter out = response.getWriter();
//        out.println("<HTML>" + "<HEAD>" + "<title>Home</title>" + "</HEAD>" +
//                "<BODY>\n" +
//                "<div align=\"center\"><h1>login in</h1>" +
//                "<form  method=\"post\" name=\"login form\" align=\"center\">" +
//                "<table align=\"center\" width=\"232\" border=\"2\">\n" +
//                "<tr>\n" +
//                "<td>Username</td>\n" +
//                "<td><input type=\"text\" name=\"username\"></td>" +
//                "</tr>" + "\n" +
//                "<tr>\n" +
//                "<td>Password</td>\n" +
//                "<td><input type=\"password\" name=\"password\"></td>" +
//                "</tr>" + "\n" +
//                "</table>\n" +
//                "<a href= >Click</a>" +
//                "<input type=\"submit\" value=\"Submit\" name=\"Submit\">\n" +
//                "</form>\n" +
//                "<form action=\"MaServlet\" method=\"get\">" +
//                "<a href=\"SignUp\">SIGN UP</a>" +
//                "</form>" +
//                "</div>" +
//                "</BODY>" +
//                "</HTML>"
//        );
//        out.close();

        return text;
    }
}
