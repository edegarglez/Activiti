package org.activiti.camel;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class TestJoinDelegate implements JavaDelegate {

  @Override
  public void execute(DelegateExecution execution) throws Exception {
    System.out.println("testing join delegate");
  }

}
