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
import java.lang.management.*;

public class HardwareInfo {
    public static void main(String[] args) {
        // Getting the operating system MXBean
        OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getOperatingSystemMXBean();

        // Retrieving system information
        System.out.println("Operating System: " + operatingSystemMXBean.getName());
        System.out.println("Architecture: " + operatingSystemMXBean.getArch());
        System.out.println("Available Processors: " + operatingSystemMXBean.getAvailableProcessors());

        // Getting the memory MXBean
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();

        // Retrieving memory information
        System.out.println("Total Memory: " + memoryMXBean.getHeapMemoryUsage().getMax() / (1024 * 1024) + " MB");
        System.out.println("Free Memory: " + memoryMXBean.getHeapMemoryUsage().getMax() / (1024 * 1024) + " MB");
    }
}
