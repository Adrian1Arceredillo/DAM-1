/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

/**
 *
 * @author AdriAlex
 */
public class GameUserAttempts {

    private String originalEuskaraz;
    private String originalGazteleraz;
    private String answer;
    
    
    public GameUserAttempts (String originalEuskaraz, String originalGazteleraz, String answer) {
        this.originalEuskaraz = originalEuskaraz;
        this.originalGazteleraz = originalGazteleraz;
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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
    @Override
    public String toString() {
        
        return "\nEus:" + originalEuskaraz + "Gaz:" + originalGazteleraz + "Ans:" + answer;
    }
    
    
}
