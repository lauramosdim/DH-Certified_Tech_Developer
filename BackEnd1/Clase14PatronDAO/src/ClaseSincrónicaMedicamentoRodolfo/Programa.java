package ClaseSincrÃ³nicaMedicamentoRodolfo;

import ClaseSincrÃ³nicaMedicamentoRodolfo.dao.MedicamentoDaoH2;
import ClaseSincrÃ³nicaMedicamentoRodolfo.model.Medicamento;
import ClaseSincrÃ³nicaMedicamentoRodolfo.service.MedicamentosService;

import java.sql.SQLException;

public class Programa {
    public static void main(String[] args) throws SQLException {
        //debemos crear la base de datos

        //quiero guardar un medicamento
        Medicamento med1=new Medicamento(1,1256,"advil","pfizer",2,100.00);
        //usar el servicio disponible
        MedicamentosService medicamentosService=new MedicamentosService(new MedicamentoDaoH2());
        //usamos el servici para guardar el medicamento
        medicamentosService.guardar(med1);
    }
}
