package com.thermomash.tcp;

import com.thermomash.tcp.HandleClientTCP;	// Import the client communication handler


public class Client 
{
  public static void main(String[] args) 
  {
   // Variable declarations	  
   String host = "Robson_W700";  // Define a host server
   int port = 5050;             // Define a port
   HandleClientTCP client = new HandleClientTCP();

   // Connect to the server
   client.connectToServer(host, port);
   client.send("setTemp");   
}}
