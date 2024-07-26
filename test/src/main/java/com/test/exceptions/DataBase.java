package com.test.exceptions;

import java.io.IOException;

public class DataBase {
   
    public String getUserName () throws IOException {
    
   return "Matviy M.";
   
}

public String getUserNameById(String id) {
    Integer idInteger = Integer.valueOf(id);

    //GET UNAME BY ID
    return "Mark Zukerberkg";
}


}
