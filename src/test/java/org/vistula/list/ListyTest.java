package org.vistula.list;

import org.junit.Test;
import java.util.List;
import java.util.ArrayList;


public class ListyTest {

    //  @Test
    //public void listTest() {

      //  List<String> names = new ArrayList<>();
        //names.add("Slawek");
        //assert names.size() == 1;
        //assert names.get(0).equals("Slawek");

    //names.remove(0);
    //assert names.size() == 0;
    //assert names.contains("Slawek") == false;

    //}

    @Test
    public void listTestSize() {

        VistulaList objectVistulaList = new VistulaList();

        assert objectVistulaList.getImiona().size() == 0;

    }

    @Test
    public void shouldSerList() {


        List<String> myList = new ArrayList<>();
        myList.add("Slawek");
        myList.add("Daria");

        VistulaList objekt = new VistulaList();
        assert objekt.getImiona().size() == 0;

        objekt.setImiona(myList);
        assert objekt.getImiona().size() == 2;


        objekt.setImiona(myList);
        assert objekt.getImiona().size() == 2;
        assert objekt.getImiona().get(1).equals("Daria");



    }
}