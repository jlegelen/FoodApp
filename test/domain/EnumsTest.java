package domain;

import domain.Enums;
import domain.Consulta;
import domain.Enums.MotivoConsulta;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnumsTest {

    public EnumsTest() {
    }

    @Test
    public void testSomeMethod() {
        assertTrue(false);
    }

    @Test
    public void testNutrientesPrincipalesAntioxidantes() {
        assertEquals("ANTIOXIDANTES", Enums.NutrientesPrincipales.ANTIOXIDANTES.toString());
    }

    @Test
    public void testNutrientesPrincipalesCarbohidratos() {
        assertEquals("CARBOHIDRATOS", Enums.NutrientesPrincipales.CARBOHIDRATOS.toString());
    }

    @Test
    public void testNutrientesPrincipalesMinerales() {
        assertEquals("MINERALES", Enums.NutrientesPrincipales.MINERALES.toString());
    }

    @Test
    public void testNutrientesPrincipalesProteinas() {
        assertEquals("PROTEINAS", Enums.NutrientesPrincipales.PROTEINAS.toString());
    }

    @Test
    public void testNutrientesPrincipalesVitaminas() {
        assertEquals("VITAMINAS", Enums.NutrientesPrincipales.VITAMINAS.toString());
    }

    @Test
    public void testNutrientesPrincipales() {
        Enums.MotivoConsulta unEnum = Enums.MotivoConsulta.ALIMENTOSINGERIR;
        assertEquals(unEnum, Enums.MotivoConsulta.ALIMENTOSINGERIR);
    }

    @Test
    public void testMotivoConsulta() {
        Consulta unaConsulta = new Consulta();
        Enums.MotivoConsulta unEnum = Enums.MotivoConsulta.ALIMENTOSINGERIR;
        unaConsulta.setMotivo(unEnum);
        //assertEquals(unEnum, Enums.MotivoConsulta.ALIMENTOSINGERIR);
        assertTrue(false);
    }

    @Test
    public void testMotivoConsultaAlimentosIngerir() {
        assertEquals("ALIMENTOSINGERIR", Enums.MotivoConsulta.ALIMENTOSINGERIR.toString());
    }

    @Test
    public void testMotivoConsultaAlimentosIngeridos() {
        assertEquals("ALIMENTOSINGERIDOS", Enums.MotivoConsulta.ALIMENTOSINGERIDOS.toString());
    }

    @Test
    public void testMotivoConsultaOtros() {
        assertEquals("OTROS", Enums.MotivoConsulta.OTROS.toString());
    }

}