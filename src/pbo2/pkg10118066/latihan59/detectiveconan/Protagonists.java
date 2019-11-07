/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan59.detectiveconan;

/**
 *
 * @author PC
 */
public class Protagonists extends KarakterConan{
    private int caseSolved;

    public Protagonists(String name, String gender, String job, int age) {
        super(name, gender, job, age);
    }

    public int getCaseSolved() {
        return caseSolved;
    }

    public void setCaseSolved(int caseSolved) {
        this.caseSolved = caseSolved;
    }

    @Override
    public void tampilData() {
        super.tampilData(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Case Solved    : " + getCaseSolved() + " case");
    }
    
    
    
    
}
