package com.auryan898.socketcomm;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public abstract class AdvancedCommReceiver {

  public void setProps(AdvancedComm advancedComm, DataInputStream dis, DataOutputStream dos) {
    
  }

  protected abstract void receive(byte code1, byte code2, DataInputStream dis,
      DataOutputStream dos);
  
}