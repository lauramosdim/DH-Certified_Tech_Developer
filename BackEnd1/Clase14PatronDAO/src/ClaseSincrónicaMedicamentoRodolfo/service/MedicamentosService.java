package ClaseSincrÃ³nicaMedicamentoRodolfo.service;


import ClaseSincrÃ³nicaMedicamentoRodolfo.dao.IDao;
import ClaseSincrÃ³nicaMedicamentoRodolfo.model.Medicamento;

import java.sql.SQLException;

public class MedicamentosService {
    //Necesito un dao para acceder a la base
    private IDao<Medicamento> medicamentoDao;

    public MedicamentosService(IDao<Medicamento> medicamentoDao) {
        this.medicamentoDao = medicamentoDao;
    }

    public Medicamento guardar(Medicamento medicamento) throws SQLException {
        return medicamentoDao.guardar(medicamento);
    }
}
