package com.javainuse;


import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.dao.OptimisticLockingFailureException;

public class CustomItemWriter implements ItemWriter<String> {

 @Override
 public void write(List<? extends String> bookNameWithAuthor) throws Exception {
  try {
	  System.out.println(bookNameWithAuthor);
	  throw new OptimisticLockingFailureException(null);
  }catch(Exception e){
	  throw e;
  }
	   
 }

}