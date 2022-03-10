/*
 * Copyright (c) 2014. Opennaru, Inc.
 * http://www.opennaru.com/
 */

package com.opennaru.khan.test;

/**
 * Created by jjeon on 7/3/14.
 */
public class Deadlock {
    
    public static void start() {
    	
        final  Object resource1 = "resource1";
        final  Object resource2 = "resource2";


        Thread t1 = new Thread() {
            public void run() {
                //Lock resource 1
                synchronized (resource1) {
                    System.out.println("Thread 1: locked resource 1");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                    }

                    synchronized (resource2) {
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };

        //Here's the second thread.
        //It tries to lock resource2 then resource1
        Thread t2 = new Thread() {
            public void run() {
                //This thread locks resource 2 right away
                synchronized (resource2) {
                    System.out.println("Thread 2: locked resource 2");

                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                    }

                    synchronized (resource1) {
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };

        //Start the two threads.
        t1.start();
        t2.start();
    }
}
