/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.util.ArrayList;

/**
 *
 * @author AdriAlex
 */
public class GameUserAttempts {

    private String originalEuskaraz;        //Basque word taken from the database
    private String originalGazteleraz;      //SPANISH word taken from the database
    private String userGazteleraz;          //word in SPANISH entered by the user
    private String answer;         //rating of the answer of the user (correct or wrong)
    //private AnswerCheckGame answer;       //rating of the answer of the user (correct or wrong)
    
    public static final ArrayList<GameUserAttempts> eachAttemptUser = new ArrayList<>();
    public final int numAllowedFailures = 5;
    
    
    public GameUserAttempts (String originalEuskaraz, String originalGazteleraz, String userGazteleraz, String answer /*AnswerCheckGame answer*/) {
        this.originalEuskaraz = originalEuskaraz;
        this.originalGazteleraz = originalGazteleraz;
        this.userGazteleraz = userGazteleraz;
        this.answer = answer;
    }
    
    public String getOriginalEuskaraz() {
        return originalEuskaraz;
    }
    
    public void setOriginalEuskaraz(String originalEuskaraz) {
        this.originalEuskaraz = originalEuskaraz;
    }
    
    public String getOriginalGazteleraz() {
        return originalGazteleraz;
    }
    
    public void setOriginalGazteleraz(String originalGazteleraz) {
        this.originalGazteleraz = originalGazteleraz;
    }
    
    public String getUserGazteleraz() {
        return userGazteleraz;
    }
    
    public void setUserGazteleraz(String userGazteleraz) {
        this.userGazteleraz = userGazteleraz;
    }
        
    public String getAnswer() {
        return answer;
    }
    
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    @Override
    public String toString() {
        
        return "\nEus:" + originalEuskaraz + "Gaz:" + originalGazteleraz + "User (gaz):" + userGazteleraz + "Ans:" + answer;
    }
    
    
}
