package com.example.demo.repository;

import java.util.ArrayList;
import java.util.Iterator;

import com.example.demo.bean.Libro;

public class BaseDatos {
	ArrayList<Libro> libros = new ArrayList<Libro>();
	public BaseDatos() {
		libros.add(new Libro(1,"Harry Potter 1","J.K ROWINS","SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
		libros.add(new Libro(2,"Harry Potter 2","J.K ROWINS","SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
		libros.add(new Libro(3,"Harry Potter 3","J.K ROWINS","SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
		libros.add(new Libro(4,"Harry Potter 4","J.K ROWINS","SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
		libros.add(new Libro(5,"Harry Potter 5","J.K ROWINS","SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
		libros.add(new Libro(6,"Harry Potter 6","J.K ROWINS","SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
		libros.add(new Libro(7,"Harry Potter 7","J.K ROWINS","SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
		libros.add(new Libro(8,"Harry Potter 8","J.K ROWINS","SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
		libros.add(new Libro(9,"Harry Potter 9","J.K ROWINS","SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
		libros.add(new Libro(10,"Harry Potter 10","J.K ROWINS","SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
		libros.add(new Libro(11,"Harry Potter 11","J.K ROWINS","SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
		libros.add(new Libro(12,"Harry Potter 12","J.K ROWINS","SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
		libros.add(new Libro(13,"Harry Potter 13","J.K ROWINS","SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
		libros.add(new Libro(14,"Harry Potter 14","J.K ROWINS","SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
		libros.add(new Libro(15,"Harry Potter 15","J.K ROWINS","SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
		libros.add(new Libro(16,"Harry Potter 16","J.K ROWINS","SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
		libros.add(new Libro(17,"Harry Potter 17","J.K ROWINS","SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
		libros.add(new Libro(18,"Harry Potter 18","J.K ROWINS","SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
	}
	public ArrayList<Libro> getLibros(){
		return libros;
	}
	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}
	public void inserta(Libro libro) {
		libros.add(libro);
		// TODO Auto-generated method stub
		
	}
	public void borrar(int id) {
		Iterator<Libro> it = libros.iterator();
		while(it.hasNext()) {
			Libro li = it.next();
			if (li.getId()==id) {
				it.remove();
				break;
			}
		}
		// TODO Auto-generated method stub
		
	}
	public Libro getLibro(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	public void modifica(Libro libro) {
		Iterator<Libro> it = libros.iterator();
		while(it.hasNext()) {
			Libro li= it.next();
			if(li.getId()==libro.getId()) {
				li.setTitulo(libro.getTitulo());
				li.setAutor(libro.getAutor());
				li.setEditorial(libro.getEditorial());
				li.setFecha(libro.getFecha());
				li.setTematica(libro.getTematica());
				break;
			}
		}
	}
}

