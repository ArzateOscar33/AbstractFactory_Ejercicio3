/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstractfactory_ejercicio3;

/**
 *
 * @author Arzate
 */
public class AbstractFactory_Ejercicio3 {

    public static void main(String[] args) {
        IAbstractFactory AB = new PayPalFactory();
        IPaymentGateway pago=AB.Pagar();
        pago.Render();
        
    }
}
