package com.example.ThymleafPage.service;

import com.lowagie.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@Service
public class PdfService {
    @Autowired
    private TemplateEngine templateEngine;

    public void create() throws IOException, DocumentException {
        Context context = new Context();

        String processedHtml = templateEngine.process("opertun",context);

        OutputStream outputStream = new FileOutputStream("privacy.pdf");

        ITextRenderer renderer = new ITextRenderer();
        renderer.setDocumentFromString(processedHtml);
        renderer.layout();
        renderer.createPDF(outputStream,false);
        renderer.finishPDF();
        outputStream.close();


    }
}
