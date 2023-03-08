package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.xdevapi.JsonParser;

import dao.ProductDao;
import dto.Product;

@WebServlet("/addtocart")
public class Fetch extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
//	super.doPost(req, resp);
	String s1=req.getParameter("pname");
	String s2=req.getParameter("pcode");
	String s3=req.getParameter("price");
	String s4=req.getParameter("pdescription");
	
	//String[] pname=req.getParameterValues("pname");
	
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	
	Product product=new Product();
	product.setPname(s1);
	product.setPcode(s2);
	product.setPrice(s3);
	product.setDescription(s4);
	
	ProductDao dao=new ProductDao();
	dao.insert(product);
	
	RequestDispatcher r1=req.getRequestDispatcher("project.html");
	r1.include(req, resp);
}
}
