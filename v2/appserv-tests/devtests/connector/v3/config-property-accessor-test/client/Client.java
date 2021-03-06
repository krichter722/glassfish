package com.sun.s1asdev.connector.serializabletest.client;

import com.sun.ejte.ccl.reporter.SimpleReporterAdapter;
import com.sun.s1asdev.connector.serializabletest.ejb.SimpleSession;
import com.sun.s1asdev.connector.serializabletest.ejb.SimpleSessionHome;

import javax.naming.InitialContext;

public class Client {

    public static void main(String[] args)
            throws Exception {

        SimpleReporterAdapter stat = new SimpleReporterAdapter();
        String testSuite = "serializable connector test";

        InitialContext ic = new InitialContext();
        Object objRef = ic.lookup("java:comp/env/ejb/SimpleSessionHome");
        SimpleSessionHome simpleSessionHome = (SimpleSessionHome)
                javax.rmi.PortableRemoteObject.narrow(objRef, SimpleSessionHome.class);

        stat.addDescription("Running serializable connector test ");
        SimpleSession bean = simpleSessionHome.create();

        boolean passed = false;

        try {
            if (!bean.test1()) {
                stat.addStatus(testSuite + " test1 :  ", stat.FAIL);
            } else {
                stat.addStatus(testSuite + " test1 :  ", stat.PASS);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        stat.printSummary();
    }
}
