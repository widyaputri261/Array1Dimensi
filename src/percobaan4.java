/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class percobaan4 {
    public static void main(String[] args) {
        //String names[] = new String["Tom", "David", "Mike"];
        
        String names[] = {"Tom", "David", "Mike"};
        //sintaks benar
        
//        for (int idx = 0; idx < names.length; idx++){
//            System.out.println(names[idx]);
//        }
        
        for(String name: names){
            System.out.println(name);
        }
    }
}
