package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ProductBean;
import com.util.Validators;

public class SaveProductServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String category = request.getParameter("category");
		String priceStr = request.getParameter("price");
		String qtyStr = request.getParameter("qty");

		ProductBean product = new ProductBean();
		boolean isError = false;

		if (Validators.isEmpty(name)) {
			isError = true;
			request.setAttribute("nameError", "Please Enter Product Name");
		} else {

			product.setName(name);
		}

		if (Validators.isEmpty(category)) {
			isError = true;
			request.setAttribute("categoryError", "Please Enter Category Name");
		} else {
			;
			product.setCategory(category);
		}

		if (Validators.isEmpty(priceStr)) {
			isError = true;
			request.setAttribute("priceError", "Please Enter Product Price");
		} else {

			product.setPrice(Integer.parseInt(priceStr));
		}

		if (Validators.isEmpty(qtyStr)) {
			isError = true;
			request.setAttribute("qtyError", "Please Enter Product Quantity");
		} else {

			product.setQty(Integer.parseInt(qtyStr));
		}

		request.setAttribute("product", product);
	
		if (isError == true) {
			// goback
			RequestDispatcher rd = request.getRequestDispatcher("NewProduct.jsp");
			rd.forward(request, response);
		} else {
			// goahead
			RequestDispatcher rd = request.getRequestDispatcher("PrintProduct.jsp");
			rd.forward(request, response);

		}

	}
}
