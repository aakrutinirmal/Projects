/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Family;

/**
 *
 * @author aakrutinirmal
 */
public class Family {
   private int familyId;
   private String familyName;
   private static int count;

  public Family(String name) {
       
        familyId = count;
        this.familyName=name;
        count++;
    }

    public int getFamilyId() {
        return familyId;
    }

    public void setFamilyId(int familyId) {
        this.familyId = familyId;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
   
   
   
   
}
