/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Shan
 */
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.lang.management.OperatingSystemMXBean;

public class ComputerSpecsViewer {

    public static void main(String[] args) {
        // Get various system properties
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String osArch = System.getProperty("os.arch");

        String javaVersion = System.getProperty("java.version");
        String javaVendor = System.getProperty("java.vendor");
        String javaHome = System.getProperty("java.home");

        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");

        // Get memory information
        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
        MemoryUsage heapMemoryUsage = memoryBean.getHeapMemoryUsage();

        // Get operating system information
        OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();
       

        // Display gathered system information
        System.out.println("Operating System: " + osName + " " + osVersion + " (" + osArch + ")");
        System.out.println("Java Version: " + javaVersion + " by " + javaVendor);
        System.out.println("Java Home: " + javaHome);
        System.out.println("User: " + userName);
        System.out.println("User Home Directory: " + userHome);

        System.out.println("Heap Memory Used: " + (heapMemoryUsage.getUsed() / (1024 * 1024)) + " MB");
        
    }
}
