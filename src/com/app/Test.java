package com.app;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {
public static void main(String[] args) {
	
	Margin marg1=new Margin();
	marg1.setMargId(65);
	marg1.setMargCode("Hp-marg1");
	
	Margin marg2=new Margin();
	marg2.setMargId(75);
	marg2.setMargCode("Hp-marg2");
	
	Margin marg3=new Margin();
	marg3.setMargId(85);
	marg3.setMargCode("Hp-marg3");
	
	Margin marg4=new Margin();
	marg4.setMargId(95);
	marg4.setMargCode("Hp-marg4");
	
	Model model1=new Model();
	model1.setModelId(1111);
	model1.setModelCode("HPmodel1");
	model1.setModelCost(200000.00);
	Map<Integer, Margin> map1=new LinkedHashMap<Integer,Margin>();
    map1.put(10, marg1);
    map1.put(20, marg2);
    model1.setMarginObjs(map1);
    
   Model model2=new Model();
   model2.setModelId(2222);
   model2.setModelCode("HPmodel2");
   model2.setModelCost(2.2);
   Map<Integer,Margin> map2=new LinkedHashMap<Integer,Margin>();
   map2.put(30, marg3);
   map2.put(40, marg4);
   model2.setMarginObjs(map2);
   
   
   Product product=new Product();
   product.setProductId(89);
   product.setProductName("HPproduct"); 
   List<Model> lst=new ArrayList();
   lst.add(model1);
   lst.add(model2);
   product.setModelObjs(lst);
   
   try {
	   ObjectMapper om=new ObjectMapper();
	   String json=om.writerWithDefaultPrettyPrinter().writeValueAsString(product);
	   System.out.println(json);
   }catch (Exception e) {
	   System.out.println(e);
   }
   
}
}
