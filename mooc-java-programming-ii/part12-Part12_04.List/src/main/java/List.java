/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Travis
 */
public class List<Type> {
    private Type[] values;
    private int firstFreeIndex;
    
    public List(){
        this.values = (Type[]) new Object[10];
    }
    
    public void add(Type value){
        if (this.firstFreeIndex == this.values.length){
            grow();
        }
        this.values[this.firstFreeIndex]= value;
        this.firstFreeIndex++;
    }
    
    private void grow(){
        int growBy = this.values.length + this.values.length / 2;
        Type[] newValues = (Type[]) new Object[growBy];
        for (int i = 0; i < newValues.length; i++){
            newValues[i] = this.values[i];
        }
        this.values = newValues;
    }
    
    public boolean contains(Type value){
        return (indexOfValue(value) >= 0);
    }
    
    public void remove(Type value){
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0){
            return;
        }
        moveUp(indexOfValue);
        this.firstFreeIndex--;
    }
    public int indexOfValue(Type value){
       for (int i = 0 ; i < this.firstFreeIndex; i++){
            if (value.equals(this.values[i])){
                return i;
            }
        } 
        return -1;
    }
    
    private void moveUp(int moveFrom){
        for (int i = moveFrom; i < this.firstFreeIndex -1; i++){
            this.values[i] = this.values[i+1];
        }
    }
    public Type value(int index){
        if ((index < 0) || (index > this.firstFreeIndex)){
            throw new ArrayIndexOutOfBoundsException("Index "+index+" outside of [0,"+this.firstFreeIndex + "]");
        }
        return this.values[index];
    }
    
    public int size(){
        return this.firstFreeIndex;
    }
    
    
}
