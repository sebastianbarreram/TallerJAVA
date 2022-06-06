package com.sofkau.ownlogger;

import java.util.logging.Logger;

/**
 * Esta clase ayuda a mostrar mensajes por consola
 */
public class OwnLogger {
    private final Logger logger = Logger.getLogger("MyLog");

    /**
     * Esta funcion muestra el mensaje ingresado como tipo informacion
     * 
     * @param mensaje mensaje que quiere ser mostrado en consola
     */
    public void printInfo(String mensaje) {
        logger.info(mensaje);
    }
    
    /**
     * Esta funcion muestra el mensaje ingresado como tipo advertencia
     * 
     * @param mensaje mensaje que quiere ser mostrado en consola
     */
    public void printWarn(String mensaje) {
        logger.warning(mensaje);
    }
}
