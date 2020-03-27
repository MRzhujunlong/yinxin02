package com.yinxinhome.pack.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/login")
public class testPick {

    @RequestMapping("/test")
    @ResponseBody
    public String test(@RequestParam("file")MultipartFile[] files){
        for (int i = 0; i < files.length; i++) {
            System.out.println("获取图片对象里面的数据="+files[i].getOriginalFilename());
        }



        return "123456789";
    }

    @RequestMapping("/index")
    public String come(){
        return "/IndexHtml/testhtml.html";
    }
}
