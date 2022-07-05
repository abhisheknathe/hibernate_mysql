package Models;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {



    private static Logger logger = Logger.getLogger(HibernateDemo.class);


    public static void main(String[] args) {



        logger.trace("Need to trace the things");
        logger.debug("We are debugging it");
        logger.info("This is Info");
        logger.warn("This is warning");
        logger.error("Error Came");
        logger.fatal("Application Crashed");





    }


}
