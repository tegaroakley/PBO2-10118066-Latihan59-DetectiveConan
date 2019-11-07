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
public class KorbanVirus extends KarakterConan{
    private final String realName;
    private final int realAge;

    public KorbanVirus(String name, String gender, String job, int age, String realName, int realAge) {
        super(name, gender, job, age);
        this.realName = realName;
        this.realAge = realAge;
    }

    @Override
    public void tampilData() {
        System.out.println("Character Name      : " + getName());
        System.out.println("Character Real Name : " + realName);
        System.out.println("Age                 : " + getAge());
        System.out.println("Real Age            : " + realAge);
        System.out.println("Gender              : " + getGender());
        System.out.println("Profession          : " + getJob());
        
    }
    
    
}
