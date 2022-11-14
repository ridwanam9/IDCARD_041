/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wsc.practice.idcart;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author DELL
 */
@Controller
public class IdCartController {
    
    @ResponseBody
    @RequestMapping("/mimosa")
    public String getdata(@RequestParam("nama")String text,
            @RequestParam("image")MultipartFile image, 
            @RequestParam("tanggal") @DateTimeFormat(pattern="yyyy-MM-dd") Date date)
            throws IOException{
        
        SimpleDateFormat tanggal = new SimpleDateFormat("EE-dd-MMMM-yyyy");
        String newTanggal = tanggal.format(date);
        String blob = Base64.encodeBase64String(image.getBytes());
        
        return text +"<br>" + newTanggal+ "<br> <img width=100' src='data:image/jpeg;base64, "+
                blob+" '><br>";
    
    }
    
}
