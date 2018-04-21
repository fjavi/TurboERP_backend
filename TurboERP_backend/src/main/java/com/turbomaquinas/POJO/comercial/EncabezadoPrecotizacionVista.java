package com.turbomaquinas.POJO.comercial;

import java.util.Date;

public class EncabezadoPrecotizacionVista {
	private int id;
	private String descripcion;
	private int lugar;
	private int activo;
	private int creado_por;
	private Date creado;
	private int modificado_por;
	private Date modificado;
	private int precotizaciones_id;
	private int precotizacion_no;
	private int cant_detalles;
	
	public EncabezadoPrecotizacionVista() {
		super();
	}

	public EncabezadoPrecotizacionVista(int id, String descripcion, int lugar, int activo, int creado_por, Date creado,
			int modificado_por, Date modificado, int precotizaciones_id, int precotizacion_no) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.lugar = lugar;
		this.activo = activo;
		this.creado_por = creado_por;
		this.creado = creado;
		this.modificado_por = modificado_por;
		this.modificado = modificado;
		this.precotizaciones_id = precotizaciones_id;
		this.precotizacion_no = precotizacion_no;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getLugar() {
		return lugar;
	}

	public void setLugar(int lugar) {
		this.lugar = lugar;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public int getCreado_por() {
		return creado_por;
	}

	public void setCreado_por(int creado_por) {
		this.creado_por = creado_por;
	}

	public Date getCreado() {
		return creado;
	}

	public void setCreado(Date creado) {
		this.creado = creado;
	}

	public int getModificado_por() {
		return modificado_por;
	}

	public void setModificado_por(int modificado_por) {
		this.modificado_por = modificado_por;
	}

	public Date getModificado() {
		return modificado;
	}

	public void setModificado(Date modificado) {
		this.modificado = modificado;
	}

	public int getPrecotizaciones_id() {
		return precotizaciones_id;
	}

	public void setPrecotizaciones_id(int precotizaciones_id) {
		this.precotizaciones_id = precotizaciones_id;
	}

	public int getPrecotizacion_no() {
		return precotizacion_no;
	}

	public void setPrecotizacion_no(int precotizacion_no) {
		this.precotizacion_no = precotizacion_no;
	}

	public int getCant_detalles() {
		return cant_detalles;
	}

	public void setCant_detalles(int cant_detalles) {
		this.cant_detalles = cant_detalles;
	}
	
}
