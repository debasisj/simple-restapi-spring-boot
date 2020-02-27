package restservice;


import com.google.common.base.*;

import javax.validation.constraints.*;
import javax.persistence.Entity;
import java.util.List;


public class Name {
    @NotEmpty(message = "Please provide first name")
    private String firstName;

    private String lastName;

    private List<String> middleNames;

    public Name(){}

    public Name(String firstName, String lastName, List<String> middleNames){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleNames = middleNames;

    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getMiddleNames() {
        return middleNames;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleNames(List<String> middleNames) {
        this.middleNames = middleNames;
    }

    public int getScore(){
        int totalScore= !Strings.isNullOrEmpty(firstName)?firstName.length():0;
        if(!Strings.isNullOrEmpty(lastName))totalScore = totalScore+lastName.length()+20;

        if(middleNames!=null) {
            for (String str : middleNames) {

                if(!Strings.isNullOrEmpty(str)) {

                        totalScore = totalScore + str.length() + 10;

                }
            }
        }

        if(!Strings.isNullOrEmpty(firstName) && firstName.length()%2==0){totalScore = totalScore+5;}
        return totalScore;
    }

}
