package com.turbomaquinas.DAO.comercial;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.turbomaquinas.POJO.comercial.NotaCredito;
import com.turbomaquinas.POJO.comercial.NotaCreditoVista;

@Repository
public class JDBCNotaCredito implements NotaCreditoDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void actualizar(NotaCredito nc) throws DataAccessException {
		jdbcTemplate.update("UPDATE NOTAS_CREDITO set fecha_baja = ?, modificado_por = ?, "
				+ " DATOS_TIMBRADO_id = ?"
				+ "NOTAS_CREDITO_id_sust = ?  WHERE id = ?", nc.getFecha_baja(), nc.getModificado_por(),
				nc.getDatos_timbrado_id(), 
				nc.getNotas_credito_id_sust(), nc.getId());
	}

	@Override
	public NotaCredito buscar(int id) throws DataAccessException {
		NotaCredito nc = jdbcTemplate.queryForObject("SELECT * FROM NOTAS_CREDITO WHERE id = ?", 
				new NotaCreditoRM(), id);
		return nc;
	}

	@Override
	public List<NotaCreditoVista> consultar() throws DataAccessException {
		List<NotaCreditoVista> ncl = jdbcTemplate.query("SELECT * FROM NOTAS_CREDITO_V", new NotaCreditoVistaRM());
		return ncl;
	}

	@Override
	public int crearNotasCredito(String doc) {
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withProcedureName("APLICAR_NOTAS_CREDITO");
		
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		inParamMap.put("p_nota_credito_id", 0);
		inParamMap.put("doc", doc);
		SqlParameterSource in = new MapSqlParameterSource(inParamMap);
		
		Map<String, Object> simpleJdbcCallResult = simpleJdbcCall.execute(in);
		
		for (Entry<String, Object> entry : simpleJdbcCallResult.entrySet()) {
	        if (entry.getKey().compareTo("p_nota_credito_id") == 0) {
	            return (Integer) entry.getValue();
	        }
	    }		
		return 0;
	}

	
}
