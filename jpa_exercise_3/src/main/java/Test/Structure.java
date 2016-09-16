/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.HashMap;
import javax.persistence.Persistence;

/**
 *
 * @author Philip
 */
public class Structure 
{
    public static void main(String[] args) 
    {
        HashMap<String, Object> puproperties = new HashMap<>();
        
//        puproperties.put("javax.persistence.sql-load-script-source", "scripts/ClearDB.sql");
        
        puproperties.put("javax.persistence.schema-generation.database.action", "drop-and-create");
        
        Persistence.generateSchema("jpa_exercise_3PU", puproperties);
        
        Persistence.generateSchema("jpa_exercise_3PU", null);
    }
}
