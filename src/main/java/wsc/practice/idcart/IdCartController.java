/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wsc.practice.idcart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author DELL
 */
@Controller
public class IdCartController {
    
    @ResponseBody
    @RequestMapping("/getData")
    public String getdata(){
        
        String text = "Hello World";
    
    
        return text;
    }
    
}
