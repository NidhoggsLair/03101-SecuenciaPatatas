/* 
 * Copyright 2020 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public class Main {

    public static void main(String[] args) {
//        Constantes
        final double DINERO_INI = 1.00;
        final double PRECIO_ENC = 0.30;
        final double PRECIO_IMP = 0.20;
        final int CANTIDAD_ENC = 3;
        final String PERSONA_ENC = "Jaimito";
        final String ARTICULO_ENC = "Patatas";
        final String ARTICULO_IMP = "Piruleta";

//        Variables + Calculos
        double vueltas = DINERO_INI - PRECIO_IMP; //Gasto imprevisto
        int cantFinal = (int) (vueltas / PRECIO_ENC); //Cantidad final de kg
        double vueltasFin = (DINERO_INI - PRECIO_IMP) % PRECIO_ENC; //Devuelto

//        Salida pantalla
        System.out.println("Secuencia de Patatas");
        System.out.println("====================");
        System.out.printf("Persona encargada .....: %s %n", PERSONA_ENC);
        System.out.printf("Artículo encargado ....: %s %n", ARTICULO_ENC);
        System.out.printf("Cantidad encargada ....: %d %n", CANTIDAD_ENC);
        System.out.println("---");
        System.out.printf(Locale.ENGLISH, "Precio encargo ........: %.02f €/kg "
                + "%n", PRECIO_ENC);
        System.out.printf(Locale.ENGLISH, "Dinero suministrado ...: %.02f € "
                + "%n", DINERO_INI);
        System.out.println("---");
        System.out.printf("Artículo imprevisto ...: %s %n", ARTICULO_IMP);
        System.out.printf(Locale.ENGLISH, "Precio imprevisto .....: %.02f € "
                + "%n", PRECIO_IMP);
        System.out.println("---");
        System.out.printf("Cantidad comprada .....: %d kg %n", cantFinal);
        System.out.printf(Locale.ENGLISH, "Dinero devuelto .......: %.02f € "
                + "%n", vueltasFin);
    }
}
