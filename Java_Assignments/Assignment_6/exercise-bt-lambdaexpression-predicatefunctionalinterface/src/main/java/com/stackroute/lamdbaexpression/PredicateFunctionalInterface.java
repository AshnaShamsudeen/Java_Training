package com.stackroute.lamdbaexpression;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PredicateFunctionalInterface {
    //write logic to find the values that starts with letter I in the given list
    public List<String> findPattern(List<String> list) {
    	List<String>res=list.stream().filter(i->i.startsWith("I")).collect(Collectors.toList());
    	Set<String>result=new LinkedHashSet<>();
    	for(String list1:res)
    		result.add(list1);
    	
        return  new ArrayList<>(result);
    }
}
