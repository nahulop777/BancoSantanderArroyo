package com.company.cuentas;

import com.company.Cliente;

public class CajaDeAhorro extends Cuenta {

private Integer interes = 10;
    public CajaDeAhorro(Cliente titular) {
        super(titular);
    }

    public void cobrarInteres(){
       setSaldo (getSaldo() + getSaldo() * interes / 100);

    }

}
