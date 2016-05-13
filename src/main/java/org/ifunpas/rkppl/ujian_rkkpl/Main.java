/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ifunpas.rkppl.ujian_rkkpl;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 *
 * @author SB-604-18
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        BasicConfigurator.configure();

        log.debug("Ini adalah debug message : Contoh Log4J");
        log.info("Ini adalah info message : Contoh Log4J");
        log.fatal("Ini adalah fatal message : Contoh Log4J");
        log.warn("Ini adalah warn message : Contoh Log4J");
        log.error("Ini adalah error message : Contoh Log4J");

    }
}
