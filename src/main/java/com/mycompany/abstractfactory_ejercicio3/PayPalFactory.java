/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractfactory_ejercicio3;

/**
 *
 * @author Arzate
 */
public class PayPalFactory implements IAbstractFactory{

    @Override
    public ITransactionLogger Logear() {
   return new PayPalTransactionLogger();
    }

    @Override
    public IPaymentGateway Pagar() {
   return new PayPaylPaymentGateway();
    }
    
}
