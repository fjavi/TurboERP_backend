package com.turbomaquinas.DAO.comercial;

import java.util.List;

import com.turbomaquinas.POJO.comercial.FechasEstimadasCobro;

public interface FechasEstimadasCobroDAO {
	
	public void crear(FechasEstimadasCobro fec);
	public List<FechasEstimadasCobro> consultarPorFactura(int id);

}
