package controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.UploadedImageFile;

@Controller
public class UploadController {
 
    @RequestMapping("/uploadImage")
    public ModelAndView upload(HttpServletRequest request, UploadedImageFile file)
            throws IllegalStateException, IOException {
    	String newFileName = UUID.randomUUID() + ".jpg";
//      String filePath = request.getServletContext().getRealPath("/image") + newFileName ;
      File newFile = new File(request.getSession().getServletContext().getRealPath("/image"), newFileName);
      newFile.getParentFile().mkdirs();
      file.getImage().transferTo(newFile);

      ModelAndView mav = new ModelAndView("showUploadedFile");
      mav.addObject("imageName", newFileName);
      return mav;
    }
}