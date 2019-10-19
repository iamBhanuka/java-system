/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;

abstract class A{
    int i;
    abstract void dislay();
}
 class B extends A
{
    int j;
    void display()
    {
        System.out.println(j);
    }

    @Override
    void dislay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class Demo
{
    public static void main (String args[]){
        
        B obj=new B();
        obj.j=2;
        obj.dislay();
    }
}