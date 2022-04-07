package com.example.ThymleafPage.service;

import com.itextpdf.html2pdf.HtmlConverter;
import com.lowagie.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.*;

@Service
public class PdfService {
    @Autowired
    private TemplateEngine templateEngine;

    public void create() throws IOException, DocumentException {
        Context context = new Context();

        String processedHtml = templateEngine.process("tempTemplate",context);

//        OutputStream outputStream = new FileOutputStream("C:\\Users\\91994\\Saieeash\\privacy.pdf");
//
//        ITextRenderer renderer = new ITextRenderer();
//        renderer.setDocumentFromString(processedHtml);
//        renderer.layout();
//        renderer.createPDF(outputStream,false);
//        renderer.finishPDF();
//        outputStream.close();

        Writer writer = new FileWriter("C:\\Users\\91994\\Saieeash\\tempTemplate.html");
        writer.write(processedHtml);
        writer.close();


        File htmlSource = new File("C:\\Users\\91994\\Saieeash\\tempTemplate.html");
        File pdfDest = new File("C:\\Users\\91994\\Saieeash\\outputTemp.pdf");
        HtmlConverter.convertToPdf(new FileInputStream(htmlSource), new FileOutputStream(pdfDest));





    }
}


