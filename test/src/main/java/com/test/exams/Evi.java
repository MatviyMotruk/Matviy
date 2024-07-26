package com.test.exams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import com.test.objects.Student;

public class Evi {
    
    
    private Map<Student, String> particiantsMap = new HashMap<>();

    public void registerStudent(Student student){
        particiantsMap.put(student, "0");
    }
    
    public void printAllParticipants(){
       for(Entry<Student,String> keyValue : particiantsMap.entrySet()){
     
        System.out.println(keyValue.getKey() + "| Score:" + keyValue.getValue());
      }
    }
}
