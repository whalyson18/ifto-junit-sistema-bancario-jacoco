package com.sistemabancario.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaTest {
    
    @Test
    void testAddMovimentacaoCredito(){
        Conta instance = new Conta();
        Movimentacao mov = new Movimentacao(instance);
        mov.setConfirmada(true);
        mov.setTipo('D');
        final double valor = 100.50;
        final double esperado = -valor;
        mov.setValor(valor);
        instance.addMovimentacao(mov);
        assertEquals(esperado, instance.getSaldoTotal());
    }
    
    @Test
    void testAddMovimentacaoDebito(){
        Conta instance = new Conta();
        Movimentacao mov = new Movimentacao(instance);
        mov.setConfirmada(true);
        mov.setTipo('C');
        final double esperado = 100.50;
        mov.setValor(esperado);
        instance.addMovimentacao(mov);
        assertEquals(esperado, instance.getSaldoTotal());
    }
    
    @Test
    void testGetSaldoTotal() {
        Conta instance = new Conta();
        final double esperado = 100;
        instance.setLimite(esperado);
        assertEquals(esperado, instance.getSaldoTotal());
    }
    
    
}
