/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companyierarchy;

/**
 *
 * @author My Pc
 */
public class Material {
    private String name;
    private boolean isBreakable;

    public Material(String name, boolean isBreakable) {
        this.name = name;
        this.isBreakable = isBreakable;
    }
    


    public String getName() {
        return name;
    }

    public boolean getIsBreakable() {
        return isBreakable;
    }

    @Override
    public String toString() {
        return "Material{" + "name=" + name + ", isBreakable=" + isBreakable + '}';
    }
    
}
