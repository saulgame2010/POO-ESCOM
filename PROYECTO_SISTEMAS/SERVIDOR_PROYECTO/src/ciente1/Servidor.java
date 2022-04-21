package ciente1;

import java.awt.BorderLayout;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.net.*;
import java.io.*;
import javax.swing.*;

public class Servidor {
  public static void main(String[]args){
      MarcoServidor mimarco = new MarcoServidor();
      mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      SocketProducto obj = new SocketProducto();
      while(true){
      obj.iniciar();
    }    
    
  }
}

