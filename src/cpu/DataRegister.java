/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpu;


public class DataRegister extends Register{
    
    /**
     * Toma el registro real que tiene y lo divide en dos partes: Regiatro de datos y Regisatro de direcciones
     *
     * @return Array de valores correspondiente al registro de direccion y registro de instruccion
     */
    public Integer[] getDividedValue(){
        String tempVal = Integer.toBinaryString(super.getLastRegistry());
        
        while(tempVal.length() < 8) {
            tempVal = "0" + tempVal;
        }
        
        Integer[] values = new Integer[2];
        values[0] = Integer.parseInt(tempVal.substring(0, 4), 2);
        values[1] = Integer.parseInt(tempVal.substring(4, tempVal.length()), 2);  
        
        return values;
    }
}
