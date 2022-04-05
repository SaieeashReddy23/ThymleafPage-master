package com.example.ThymleafPage.controller;

import com.lowagie.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.*;


@Controller
public class HomeController {


    @GetMapping("/hello")
    public String home(Model model){
        model.addAttribute("message","Hello world");
        return "helloworld";
    }

    @GetMapping("/style")
    public String style(Model model){
        model.addAttribute("message","Hello world");
        return "css_js_demo";
    }


    @GetMapping("/bootstrap")
    public String bootstrap(Model model){
        model.addAttribute("message","Hello world");
        return "bootstrap";
    }


    @GetMapping("/opertun")
    public String opertun(Model model)  {
//        HomeController controller = new HomeController();
//
//        try{
//            String html = controller.parseThymeleafTemplate();
//            controller.generatePdfFromHtml(html);
//        }catch (Exception e){
//            System.out.println("Error occured in creating pdf of template");
//        }
//        try {
//            pdfGenaratorUtil.createPdf("opertun");
//        }catch (Exception e){
//            e.printStackTrace();
//            System.out.println("Some error occured while creating pdf");
//        }


        return "opertun";
    }


//    private String parseThymeleafTemplate() {
//		ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
//		templateResolver.setSuffix(".html");
//		templateResolver.setTemplateMode(TemplateMode.HTML);
//
//		TemplateEngine templateEngine = new TemplateEngine();
//		templateEngine.setTemplateResolver(templateResolver);
//
//		Context context = new Context();
//
//		return templateEngine.process("opertun", context);
//	}
//
//    public void generatePdfFromHtml(String html) throws IOException, DocumentException {
//        String outputFolder = System.getProperty("user.home") + File.separator + "OpertunPrivacy.pdf";
//        OutputStream outputStream = new FileOutputStream(outputFolder);
//
//        ITextRenderer renderer = new ITextRenderer();
//        renderer.setDocumentFromString(html);
//        renderer.layout();
//        renderer.createPDF(outputStream);
//
//        outputStream.close();
//    }


}
