package com.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet( "/test" )
public class Test extends HttpServlet {

    private int compteur = 0;

    @Override
    public void init() throws ServletException {
        System.out.println( ">> Servlet initialisée." );
    }

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        ++compteur;

        int compteurLocal = 0;
        ++compteurLocal;
        System.out.println( ">> Compteurs incrémentés." );
    }

    @Override
    public void destroy() {
        System.out.println( ">> Servlet détruite." );
    }
}