/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddressViewer {

    public static void main(String[] args) {
        try {
            InetAddress myIP = InetAddress.getLocalHost();
            System.out.println("Your IP address is: " + myIP.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Could not find IP address: " + e.getMessage());
        }
    }
}
