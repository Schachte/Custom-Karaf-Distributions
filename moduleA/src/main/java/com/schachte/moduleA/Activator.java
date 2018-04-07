package com.schachte.moduleA;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("Activated Bundle");
    }

    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("Deactivated Bundle");
    }
}
