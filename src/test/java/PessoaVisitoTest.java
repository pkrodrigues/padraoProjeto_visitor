import designpattern.behaviroral.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaVisitoTest {

    @Test
    void deveExibirHospede()
    {
        Hospede hospede = new Hospede(1, "Samuel", new Quarto(106, "Suite Master"));
        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Hospede{Id: 1, nome: 'Samuel', quarto: 106}", visitor.exibir(hospede));
    }

    @Test
    void deveExibirDiarista()
    {
        Diarista diarista = new Diarista(2, "Marlene", 120.0);
        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Diarista{Id: 2, nome: 'Marlene', Valor da diaria: R$ 120.0}",visitor.exibir(diarista));
    }

    @Test
    void deveExibirRecepcionista()
    {
        Recepcionista recepcionista = new Recepcionista(3, "Larissa", 2, "nortuno");
        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Recepcionista{Id: 3, nome: 'Larissa', turno: nortuno , quantidade de idiomas falados:2}",visitor.exibir(recepcionista));
    }

}
