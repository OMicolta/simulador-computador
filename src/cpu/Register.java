/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpu;

import java.util.Stack;


public class Register {
    private final Stack<Integer> records;
    private int currentValue;

    public Register() {
        this.currentValue = -1;
        this.records = new Stack<>();
    }
    
    public void putRegistry(int value){
        this.records.add(value);
        this.currentValue = value;
    }
    
    public int getLastRegistry(){
        int temp = this.currentValue;
        if(temp != -1)this.currentValue = -1;
        
        return temp;
    }
    
    /**
     * Devuelve los registros históricos de los valores que ha tomado el Registro con el tamaño dado.
     *
     * @param regSize El tamano de los valores a devolver.
     * @return Matriz de cadenas con los registros que ha tomado el Registro.
     */
    public String[] getAllItems(int regSize){
        String[] array = new String[this.records.size()];
        
        for (int i = 0; i < this.records.size(); i++) {
            array[i] = Integer.toBinaryString(this.records.get(i));
            while(array[i].length() < regSize){
                array[i] = "0" + array[i];
            }
        }
        
        return array;
    }
}
