/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;



/**
 *
 * @author imadariaga
 */
public class ProgramaNagusia {

 public static void main(String args[]) {

        View view = View.viewaSortuBistaratu();
        
        //System.out.println(view.ChoiceRecordToDelete.getItemCount());

        Model model = new Model();

        Controller controller = new Controller(model, view);
    }
}
