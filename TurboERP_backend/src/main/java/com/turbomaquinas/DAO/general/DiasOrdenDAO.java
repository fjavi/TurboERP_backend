package com.turbomaquinas.DAO.general;

import java.util.List;

import com.turbomaquinas.POJO.general.DiasOrden;
import com.turbomaquinas.POJO.general.DiasOrdenVista;

public interface DiasOrdenDAO {
	public int crear(DiasOrden d);
	public void actualizar(DiasOrden d);
	public DiasOrdenVista buscar(int id);
	public List<DiasOrdenVista> consultar();
	public List<DiasOrdenVista> buscarDiasPorOrden(int id);
	public Integer sumarDias(int id);
}
