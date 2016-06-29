package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    Part file = request.getPart("file");
	    Part input = request.getPart("input");
	    Part test = request.getPart("test");
	    String contentDisp = file.getHeader("content-disposition");
	    String[] items = contentDisp.split(";");
	    String filename = "";
	    for (String s : items) {
	        if (s.trim().startsWith("filename")) {
	            filename =  s.substring(s.indexOf("=") + 2, s.length()-1);
	        }
	    }
	    System.out.print(filename);
	    ProcessBuilder pb = new ProcessBuilder("C:/MinGW/bin/g++.exe", "-o", "output", filename);
	    pb.directory(new File("C:/Users/B/workspace/WebApp/"));
	    System.out.print(pb.directory());
	    Process process = pb.start();
	    try {
			process.waitFor();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 /*
	    OutputStream stdin = process.getOutputStream();
        InputStream stdout = process.getInputStream();

        BufferedReader reader = new BufferedReader(new InputStreamReader(stdout));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(stdin));

	    InputStream fs = input.getInputStream();
	    int read = 0;
	    char c;
	    while((read = fs.read()) != -1) {
	    	c = (char)read;
	        writer.write(c);
	    }
	    fs.close();
        writer.close();

        StringBuilder builder = new StringBuilder();
        String line = null;
        while ( (line = reader.readLine()) != null) {
           builder.append(line);
           builder.append(System.getProperty("line.separator"));
        }
        String result = builder.toString();
        System.out.print(result);  */
	}

}
