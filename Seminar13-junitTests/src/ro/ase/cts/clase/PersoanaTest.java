package ro.ase.cts.clase;

import org.junit.Test;

import static org.junit.Assert.*;
public class PersoanaTest {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetGen() {
        Persoana persoana = new Persoana("Matei", "12345678");
        assertEquals("M", persoana.getGen());
    }

    @Test
    public void testGenDupa2000() {
        Persoana persoana1 = new Persoana("Ana", "61313131");
        assertEquals("A picat pentru persoane dupa 2000", "F", persoana1.getGen());
    }

    @Test
    public void testBoundaryInferior2000() {
        Persoana persoana = new Persoana("Mircea", "5000101232131");
        assertTrue(persoana.checkCNP());
    }

    @Test
    public void testPersoanaNascutaAzi() {
        Persoana persoana = new Persoana("Mihai", "52605142321312");
        assertEquals(0, persoana.getVarsta());
    }

    @Test
    public void testGenCrosscheck() {
        String cnp = "6231231321312";
        Persoana persoana = new Persoana("Andreea", cnp);
        String expected;
        String actual = persoana.getGen();
        if(cnp.charAt(0) % 2 == 0) {
            expected = "F";
        } else {
            expected = "M";
        }
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCheckLungimeCnp() {
        Persoana persoana = new Persoana("Marius", "5004030924");
        persoana.checkCNP();
    }

    @Test
    public void checkCNP() {
        Persoana persoana = new Persoana("Matei", "1830110447306");
        assertTrue(persoana.checkCNP());
    }
  
}