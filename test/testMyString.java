iport static org.junit.Assert.*;

        import org.junit.Test;

public class testMyString {


    MyString str_empty;
    MyString str_empty2;
    MyString str_hola;
    MyString str_hola2;
    MyString str_adios;
    MyString str_addos;

    @Before
    public void setEverything(){
        str_empty = new MyString("");
        str_empty2 = new MyString("");
        str_hola = new MyString("hola");
        str_hola2 = new MyString("hola");
        str_adios = new MyString("adios");
        str_addos = new MyString("addos");
    }

    @Test
    public void equalStringTest(){
        assertEquals(0,str_hola.compareTo(str_hola2));
    }

    @Test
    public void equalEmptyStringTest(){
        assertEquals(0,str_empty.compareTo(str_empty2));
    }

    @Test
    public void difLenStringTest(){
        assertEquals(-1,str_hola.compareTo(str_adios));
    }

    @Test
    public void eqLenDifStringTest(){
        assertEquals(1,str_adios.compareTo(str_addos));
    }





}